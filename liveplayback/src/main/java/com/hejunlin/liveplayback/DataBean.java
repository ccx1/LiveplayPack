package com.hejunlin.liveplayback;

import android.os.Parcel;
import android.os.Parcelable;

public class DataBean {

    String TVName;
    String Url;

    DataBean(String TVName, String url) {
        this.TVName = TVName;
        Url = url;
    }


}
