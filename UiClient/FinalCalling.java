package UiClient;

import Controller.UserController;
import Controller.OrderController;
import Controller.ResturantController;
public class FinalCalling {

    public static void main(String[] args) {
        UserController usercontroller=UserController.getInstance();
        ResturantController resturantcontroller=ResturantController.getInstance();
        FoodOrderingApp.Controller.FoodController foodcontroller= FoodOrderingApp.Controller.FoodController.getInstance();
        OrderController ordercontroller= OrderController.getInstance();
        usercontroller.Signup("01","Rohit","9546468148","rohit123@gmail.com","kanakrbagh","customer");
        usercontroller.Signup("05","Ansh","8546462148","ansh12@gmail.com","kankabagh","customer");
        usercontroller.Signin("8546462148","ansh12@gmail.com");
        usercontroller.Signin("9546468148","rohit123@gmail.com");
        resturantcontroller.createResturant("01","own01","Foodworld","boring road","123456789","veg and non veg");
        foodcontroller.addFood("01","own01","Chicken tikka","500","mouth watering and fresh",true);
        foodcontroller.addFood("02","own02","Pizza","350","fresh and yummy",true);
        foodcontroller.deleteFood("02");
        ordercontroller.placeOrder("01","c01","own01","chicken tikka,pizza,Naan,Rice,Cold Drink","850","pending");
        ordercontroller.updateOrderStatus("01","pending");
        ordercontroller.getOrder("c01");
    }
}
