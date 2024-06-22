package Repository;

import Model.UserRegister;

import java.util.ArrayList;
import java.util.List;

public class UserRepo {
   private List<UserRegister> ur=new ArrayList<>();
   public UserRegister save(UserRegister userregister){
       ur.add(userregister);
       return userregister;
   }
   public List<UserRegister> find(){
       return ur;
   }

}
