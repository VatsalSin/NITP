package com.saksham.sakshambharat.model;

import android.net.Uri;

public class Notifications {
    private String header, short_details, long_details,time_stamp;
    private Uri iconUri,imageUri;

    public Notifications() {
    }

    public Notifications(String head, String short_detail) {
        this.header = head;
        this.short_details = short_detail;
    }

    public Notifications(String head, String short_detail, Uri u,String time_stamp) {
        this.header = head;
        this.short_details = short_detail;
        this.iconUri = u;
        this.time_stamp=time_stamp;
    }

    public Notifications(String head, String long_detail, Uri u) {
        this.header = head;
        this.long_details = long_detail;
        this.imageUri = u;
    }

    public String getHeader(){
        return header;
    }

    public void setHeader(String h){
        header=h;
    }

    public String getShort_details(){
        return short_details;
    }

    public Uri getImageUri(){
        return imageUri;
    }

    public Uri getIconUri(){
        return iconUri;
    }

    public String getLong_details(){
        return long_details;
    }

    public String getTime_stamp(){
        return time_stamp;
    }

    public void setIconUri(Uri u){
        iconUri=u;
    }

    public void setImageUri(Uri u){
        imageUri=u;
    }

    public void setTime_stamp(String t){
        time_stamp=t;
    }

    public void setShort_details(String s){
        short_details=s;
    }

    public void setLong_details(String l){
        long_details=l;
    }
}
