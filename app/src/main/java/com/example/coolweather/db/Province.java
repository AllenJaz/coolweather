package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017\5\24 0024.
 */

public class Province extends DataSupport{
    private int id;
    private String provinceName;
    private int provinceCode;
    //ID
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    //省的名字
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName=provinceName;
    }
    //省的代号
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode=provinceCode;
    }
}
