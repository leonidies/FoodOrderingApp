package Model;

//import foodOrderingApp.Model.fooditem;

import java.util.ArrayList;
import java.util.List;

public class Resturant {
    String id;
    String OwnerId;
    String name;
    String address;
    String phonenum;
    private String ft= String.valueOf(new ArrayList<>());

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwnerId() {
        return OwnerId;
    }

    public void setOwnerId(String ownerId) {
        OwnerId = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getFt() {
        String fooditems = ft;
        return fooditems;
    }

    public void setFt(List<Fooditem> ft) {
        this.ft = ft.toString();
    }

    public Resturant(String id, String ownerId, String name, String address, String phonenum, String ft) {
        this.id = id;
        OwnerId = ownerId;
        this.name = name;
        this.address = address;
        this.phonenum = phonenum;
        this.ft = ft;
    }
}
