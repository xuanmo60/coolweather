package com.coolweather.android.gson;

import androidx.appcompat.widget.ForwardingListener;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    public String status;  //网站返回的状态

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
