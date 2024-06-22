package Repository;



import Model.Resturant;

import java.util.ArrayList;
import java.util.List;

public class ResturantRepo {
 private List<Resturant> r=new ArrayList<>();
 public Resturant findByOwnerId(Resturant res){
     r.add(res);
     return  res;
 }
}
