package com.coolweather.android.gson;

import android.annotation.TargetApi;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class Now {

    @SerializedName("tem")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;

    }

}
