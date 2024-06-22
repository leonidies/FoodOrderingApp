package FoodOrderingApp.Controller;

import Model.Fooditem;
import Service.FoodService;

public class FoodController {
    private static FoodOrderingApp.Controller.FoodController instance;
    public static synchronized FoodOrderingApp.Controller.FoodController getInstance(){
        if (instance==null){
            instance=new FoodOrderingApp.Controller.FoodController();
        }
        return instance;
    }
    Fooditem fitem = new Fooditem("01", "own01", "chicken tikka", "500", "mouth watering taste", true);
    FoodService fservice = new FoodService();

    public Fooditem addFood(String id, String resturantid, String name, String price, String description, boolean availibility) {
        System.out.println("Added food items are:-");
        System.out.println(" Name of Food= " + name + ", Price= "+price +", description= " + description + " ," + " availabel=" + availibility);
        return fservice.addFood(id, resturantid, name, price, description, availibility);
    }

  public Fooditem deleteFood(String id) {
        return fservice.deleteFood(id);
  }

}
