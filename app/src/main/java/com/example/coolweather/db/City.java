package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017\5\24 0024.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;
    //id
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    //市名
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName=cityName;
    }
    //市的代号
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode=cityCode;
    }
    //市所属的省的ID
    public int getProvinceId(){
        return cityCode;
    }
    public void setProvinceId(int provinceId){
        this.provinceId=provinceId;
    }
}
