package Repository;

import Model.Fooditem;

import java.util.ArrayList;
import java.util.List;

public class FoodRepo {
    List<Fooditem> fitem = new ArrayList<>();

    public Fooditem addFood(Fooditem fi) {
        fitem.add(fi);
        return fi;
    }

    public Fooditem deleteFood(String id) {
        for (Fooditem FoodItem : fitem) {
            if (FoodItem.getId() == id) {
                System.out.println("Food sucesfullly deleted ");
                // return frepo.deleteFood(FoodItem);
                fitem.remove(FoodItem);
                return FoodItem;

            }
        }
        return null;
    }
}
