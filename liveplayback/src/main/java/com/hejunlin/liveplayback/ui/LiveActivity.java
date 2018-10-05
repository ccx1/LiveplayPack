/*
 * Copyright (C) 2016 hejunlin <hejunlin2013@gmail.com>
 *
 * Github:https://github.com/hejunlin2013/LivePlayback
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hejunlin.liveplayback.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hejunlin.liveplayback.DataBean;
import com.hejunlin.liveplayback.LiveMangager;
import com.hejunlin.liveplayback.R;
import com.hejunlin.liveplayback.ToastUtil;
import com.hejunlin.liveplayback.evideoview.EVideoView;
import com.hejunlin.liveplayback.evideoview.VideoPlayerListener;

import java.util.List;

import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.player.IjkTimedText;

public class LiveActivity extends Activity {

    private EVideoView     mVideoView;
    private RelativeLayout mVideoViewLayout;
    private RelativeLayout mLoadingLayout;
    private TextView       mLoadingText;
    private              String mVideoUrl        = "";
    private              int    mRetryTimes      = 0;
    private static final int    CONNECTION_TIMES = 5;
    private int            mCurrentPositiopn;
    private List<DataBean> mList;
    private ToastUtil      mToastUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live);
        mVideoUrl = getIntent().getStringExtra("url");
        mCurrentPositiopn = getIntent().getIntExtra("position", 0);
        mList = LiveMangager.getList();
        notIndexOf(mCurrentPositiopn);
        mVideoView = (EVideoView) findViewById(R.id.videoview);
        mVideoViewLayout = (RelativeLayout) findViewById(R.id.fl_videoview);
        mLoadingLayout = (RelativeLayout) findViewById(R.id.rl_loading);
        mLoadingText = (TextView) findViewById(R.id.tv_load_msg);
        mLoadingText.setText("节目加载中...");
        initVideo();
    }

    private void notIndexOf(int i) {
        if (mCurrentPositiopn == -1) {
            mCurrentPositiopn = 0;
        } else if (mCurrentPositiopn > (mList.size() - 1)) {
            mCurrentPositiopn = LiveMangager.getList().size() - 1;
        }
    }


    public void initVideo() {
        // init player
        mVideoView.setVideoPath(Uri.parse(mVideoUrl));
        mVideoView.setListener(new VideoPlayerListener() {
            @Override
            public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {

            }

            @Override
            public void onCompletion(IMediaPlayer iMediaPlayer) {
                mLoadingLayout.setVisibility(View.VISIBLE);
                mVideoView.stop();
                mVideoView.release();
                mVideoView.setVideoPath(Uri.parse(mVideoUrl));
            }

            @Override
            public boolean onError(IMediaPlayer iMediaPlayer, int i, int i1) {
                if (mRetryTimes > CONNECTION_TIMES) {
                    new AlertDialog.Builder(LiveActivity.this)
                            .setMessage("节目暂时不能播放")
                            .setPositiveButton(R.string.VideoView_error_button,
                                    new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int whichButton) {
                                            LiveActivity.this.finish();
                                        }
                                    })
                            .setCancelable(false)
                            .show();
                } else {
                    mVideoView.stop();
                    mVideoView.release();
                    mVideoView.setVideoPath(Uri.parse(mVideoUrl));
                    mVideoView.start();
                }
                return false;
            }

            @Override
            public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i1) {
                switch (i) {
                    case IjkMediaPlayer.MEDIA_INFO_BUFFERING_START:
                        mLoadingLayout.setVisibility(View.VISIBLE);
                        mVideoView.start();
                        break;
                    case IjkMediaPlayer.MEDIA_INFO_VIDEO_RENDERING_START:
                    case IjkMediaPlayer.MEDIA_INFO_BUFFERING_END:
                        mLoadingLayout.setVisibility(View.GONE);
                        if (mToastUtil != null) {
                            mToastUtil.hide();
                        }
                        mVideoView.start();
                        break;
                }
                return false;
            }

            @Override
            public void onPrepared(IMediaPlayer iMediaPlayer) {
                mVideoView.start();

            }

            @Override
            public void onSeekComplete(IMediaPlayer iMediaPlayer) {

            }

            @Override
            public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {

            }

            @Override
            public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i1, int i2, int i3) {

            }
        });


    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_PAGE_DOWN:     //向上翻页键
            case KeyEvent.KEYCODE_MEDIA_NEXT:
            case KeyEvent.KEYCODE_DPAD_UP:   //向上键
            case KeyEvent.KEYCODE_DPAD_LEFT: //向左键
                mVideoView.stop();
                mVideoView.release();
                mCurrentPositiopn = mCurrentPositiopn - 1;
                notIndexOf(mCurrentPositiopn);
                DataBean dataBean = mList.get(mCurrentPositiopn);
                mVideoView.setVideoPath(Uri.parse(dataBean.Url));
                mToastUtil = new ToastUtil(LiveActivity.this, dataBean.TVName);
                mToastUtil.show();
                break;
            case KeyEvent.KEYCODE_PAGE_UP:     //向下翻页键
            case KeyEvent.KEYCODE_MEDIA_PREVIOUS:
            case KeyEvent.KEYCODE_DPAD_RIGHT:  //向右键
            case KeyEvent.KEYCODE_DPAD_DOWN:   //向下键
                mVideoView.stop();
                mVideoView.release();
                mCurrentPositiopn = mCurrentPositiopn + 1;
                notIndexOf(mCurrentPositiopn);
                mVideoView.setVideoPath(Uri.parse(mList.get(mCurrentPositiopn).Url));
                mToastUtil = new ToastUtil(LiveActivity.this, mList.get(mCurrentPositiopn).TVName);
                mToastUtil.show();
                break;

            default:
                break;
        }

        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        mVideoView.stop();
        mVideoView.release();
        super.onStop();

    }

    public static void activityStart(Context context, String url, int i) {
        Intent intent = new Intent(context, LiveActivity.class);
        intent.putExtra("url", url);
        intent.putExtra("position", i);
        context.startActivity(intent);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

}
