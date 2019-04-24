package com.hwt.babybag.network;

import com.hwt.babybag.bean.BaseEntity;
import com.hwt.babybag.bean.ChildInfoBean;
import com.hwt.babybag.bean.MissionBean;
import com.hwt.babybag.bean.UserInfo;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface IHttpInterface {

    @POST("user/login")
    Observable<BaseEntity<UserInfo>> login2(@Body Map<String,Object> params);

    @POST("user/register")
    Observable<BaseEntity> register(@Body Map<String,Object> params);

    @POST("user/updateUser")
    Observable<BaseEntity> updateUser(@Body UserInfo params);

    @POST("user/modifyPassword")
    Observable<BaseEntity> modifyPassword(@Body Map<String,Object> params);

    @POST("user/findOne")
    Observable<BaseEntity<UserInfo>> findOne(@Body Map<String,Object> params);

    @POST("child/findChildById")
    Observable<BaseEntity<ChildInfoBean>> findChildById(@Body ChildInfoBean ChildInfoBean);

    @POST("child/addChild")
    Observable<BaseEntity> addChild(@Body ChildInfoBean params);

    @POST("application/commitApplication")
    Observable<BaseEntity> commitApplication(@Body Map<String,Object> params);

    @GET("mission/getAllMission")
    Observable<BaseEntity<List<MissionBean>>>  getAllMission();

    @POST("mission/modifyComplete")
    Observable<BaseEntity> modifyComplete(@Body Map<String,Object> params);
}