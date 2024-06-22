package Service;

import Repository.UserRepo;
import Model.UserRegister;

import java.util.List;

public class UserService {
    UserRepo lr=new UserRepo();
    public UserRegister Signup(String id,String name, String phonenum, String emailid, String address,String role){
        UserRegister ur=new UserRegister(id,name,phonenum,emailid,address,role);
        lr.save(ur);
        System.out.println("User registered");
        return ur;
    }
    public UserRegister Signin(String phonenum,String emailid){
        List<UserRegister> ur=lr.find();
        for (UserRegister userregister:ur ){
            if (userregister.getPhonenum()==phonenum && userregister.getEmail()==emailid){
                System.out.println("Congratulation you are logged in succesfully");
                return userregister;
            }
        }
        System.out.println("oh it seems you have entered wrong email or phonenumber");
        return null;
    }


}
