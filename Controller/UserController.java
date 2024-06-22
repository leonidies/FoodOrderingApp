package Controller;

import Service.UserService;
import Model.UserRegister;

public class UserController {
    private static UserController instance;
    public static synchronized UserController getInstance(){
        if (instance==null){
            instance=new UserController();
        }
        return instance;
    }
    UserService li=new UserService();
    UserRegister u1=new UserRegister("01","Rohit","9546468148","rohit123@gmail.com","kankarbagh","customer");
    public UserRegister Signup(String id,String name,String phonenum,String emailid,String address,String role){
        getDetails(id, name, phonenum, emailid, address, role);
        return li.Signup(id,name,phonenum,emailid,address,role);
    }
    public UserRegister Signin(String phonenum,String emailid){
        return li.Signin(phonenum,emailid);
    }

    public void getDetails(String id,String name,String phonenum,String email,String address,String role){
        System.out.println("Details of registered user are here:- ");
        System.out.println("id="+id+" ");
        System.out.print("name="+name+ " ");
        System.out.print("phone="+phonenum+" ");
        System.out.print("mail="+email+" ");
        System.out.print("Location="+address+" ");
        System.out.println("role="+role+" ");
    }
}
