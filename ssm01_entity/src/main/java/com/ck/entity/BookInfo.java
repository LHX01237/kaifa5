package com.ck.entity;

public class BookInfo {
   private int bid;
   private String bname;
   private int price;
   private int btid;
   private String dtime;
   private String imgurl;
   private int state;

    public BookInfo(int bid, String bname, int price, int btid, String dtime, String imgurl, int state) {
        this.bid = bid;
        this.bname = bname;
        this.price = price;
        this.btid = btid;
        this.dtime = dtime;
        this.imgurl = imgurl;
        this.state = state;
    }

    public BookInfo() {
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

    public int getBtid() {
        return btid;
    }

    public void setBtid(int btid) {
        this.btid = btid;
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
}
