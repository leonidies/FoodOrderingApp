package Service;

//import FoodOrderingApp.Model.fooditem;
import Model.Fooditem;
import Repository.FoodRepo;

public class FoodService {
    FoodRepo frepo=new FoodRepo();
    public Fooditem addFood(String id, String resturantid, String name, String price, String description, boolean availibility){
        Fooditem fi=new Fooditem(id,resturantid,name,price,description,availibility);
        frepo.addFood(fi);
        System.out.println("New food item added");
        return fi;
    }
    public Fooditem deleteFood(String id) {
    return frepo.deleteFood(id);

    }
}
