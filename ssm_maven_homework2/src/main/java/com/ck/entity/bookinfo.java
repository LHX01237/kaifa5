package com.ck.entity;

public class bookinfo {
   private int bid;
   private String bname;
   private int price;
   private booktype btype;
   private String dtime;
   private String imgurl;
   private int state;

    public booktype getBtype() {
        return btype;
    }

    public void setBtype(booktype btype) {
        this.btype = btype;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    public String getDtime() {
        return dtime;
    }

    public void setDtime(String dtime) {
        this.dtime = dtime;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public bookinfo(int bid, String bname, int price, booktype btype, String dtime, String imgurl, int state) {
        this.bid = bid;
        this.bname = bname;
        this.price = price;
        this.btype = btype;
        this.dtime = dtime;
        this.imgurl = imgurl;
        this.state = state;
    }

    public bookinfo() {
    }
}
