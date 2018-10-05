package com.hejunlin.liveplayback;

import android.os.Parcel;
import android.os.Parcelable;

public class DataBean {

    public String TVName;
    public String Url;

    DataBean(String TVName, String url) {
        this.TVName = TVName;
        Url = url;
    }


}
