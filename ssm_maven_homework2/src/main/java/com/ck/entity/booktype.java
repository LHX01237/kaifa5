package com.ck.entity;

import java.util.List;

public class booktype {
    private int btid;
    private String btname;
    private List<bookinfo> bi;

    public int getBtid() {
        return btid;
    }

    public void setBtid(int btid) {
        this.btid = btid;
    }

    public String getBtname() {
        return btname;
    }

    public void setBtname(String btname) {
        this.btname = btname;
    }

    public List<bookinfo> getBi() {
        return bi;
    }

    public void setBi(List<bookinfo> bi) {
        this.bi = bi;
    }

    public booktype(int btid, String btname, List<bookinfo> bi) {
        this.btid = btid;
        this.btname = btname;
        this.bi = bi;
    }

    public booktype() {
    }
}
