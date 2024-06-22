package Controller;

import Model.Resturant;
import Service.ResturantService;

public class ResturantController {
    private static ResturantController instance;
    public static synchronized ResturantController getInstance(){
        if (instance==null){
            instance=new ResturantController();
        }
        return instance;
    }
    ResturantService rc=new ResturantService();
    Resturant r=new Resturant("01","own01","Foodworld","boring road","123456789","veg and non veg");
    public Resturant createResturant(String id, String OwnerId, String name, String address, String phonenum, String foodItems){
      return rc.createResturant(id, OwnerId, name, address, phonenum, foodItems);
    }
}
