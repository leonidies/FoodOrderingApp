package Service;

//import FoodOrderingApp.Model.resturant;
import Model.Resturant;
import Repository.ResturantRepo;

public class ResturantService {
     ResturantRepo rr=new ResturantRepo();
    public Resturant createResturant(String id, String ownerId, String name, String address, String phonenum, String foodItems){
        Resturant r=new Resturant(id,ownerId,name,address,phonenum,foodItems);
        rr.findByOwnerId(r);
        System.out.println("Your resturant is added");
        return r;
    }
}
