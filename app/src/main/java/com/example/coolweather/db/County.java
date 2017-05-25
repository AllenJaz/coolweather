package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017\5\24 0024.
 */

public class County extends DataSupport{
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;
    //ID
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    //县的名字
    public String getCountyName(){
        return countyName;
    }
    public void setCountyName(String countyName){
        this.countyName=countyName;
    }
    //县的天气
    public String getWeatherId(){
        return weatherId;
    }
    public void setWeatherId(String weatherId){
        this.weatherId=weatherId;
    }
    //所属市的ID值
    public int getCityId(){
        return cityId;
        }
    public void setCityId(int cityId){
        this.cityId=cityId;
    }
}
