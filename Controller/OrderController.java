package Controller;

import Model.Order;
import Service.OrderService;

import java.util.Collections;

public class OrderController {
    private static OrderController instance;
    public static synchronized OrderController getInstance(){
        if (instance==null){
            instance=new OrderController();
        }
        return instance;
    }
         OrderService orderService=new OrderService();

        public void placeOrder(String id, String customerId, String resturantID, String fooditems, String totalprice, String Status) {
            Order order = new Order(id, customerId, resturantID, Collections.singletonList(fooditems), totalprice, Status);
            orderService.placeOrder(order);
            System.out.println("Order placed successfully.");
        }

        public void updateOrderStatus(String Id, String Status) {
            orderService.updateOrderStatus(Id, Status);
            System.out.println("Order status updated successfully.");
        }
        public void getOrder(String CustomerID){
            orderService.getOrderBYCustomerId(CustomerID);
        }

    }


