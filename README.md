# FoodOrderingApp
#MODEL#
Class UserRegister {
id,name,phonenumber,email address , address,role.
}
Class Resturant{
id,ownerid,nameofresturant,address,phonenumber.
}
Class Fooditem{
id,resturantid,name,description,price,availibilty.
}
Class Order{
id,customerid,resturantid,listoffood,totalprice and status.
}

#CONTROLLER#
Class UserRegister{
signup();
signin();
getdetails();
}
Class ResturantController{
    CreateResturant();
}
Class FoodController{
    addFood();
    deleteFood();
}
Class ResturantController{
    placeOrder();
    updateOrderStatus();
    getOrder();
}

#SERVICE#
Class UserService{
    signup();
    signin();//where i took phonenumber and emailid to compare and whey they get matched you will be logged in.
}
Class ResturantService{
    createResturant();
}
Class FoodService{
    addFood();
    deleteFood();
}
Class OrderService{
    placeOrder();
    updateOrderStatus();
    getOrderByCustomerId();
}

#REPOSITORY#
Class UserRepo{
    list of array is passed
    save();//to add that user in list
}
Class Resturantservice{
    findByOwnerId();//to add resturant in list
}
Class FoodRepo{
    addFood();//to add food in list
    deleteaFood();//to delete food when id got matched
}
Class OrderRepo{
    addOrder();//to add order in list
    getOrderById();//it takes id as parameter and check if id got matched it gives the details of order
}

#UiClient#
Class FinalCalling{
    It calls all the methods in this class it has main method which runs the whole app and gives all output on the screen.
}