package Service;

import Model.Order;
import Repository.OrderRepo;

import java.util.List;

public class OrderService {

        private OrderRepo orderRepository=new OrderRepo();



        public void placeOrder(Order order) {

            orderRepository.addOrder(order);
        }

        public void updateOrderStatus(String Id, String Status) {
            Order order = orderRepository.getOrderById(Id);
            if (order != null) {
                order.setStatus(Status);
            } else {
                System.out.println("Order not found!");
            }
        }
        public void getOrderBYCustomerId(String customerID){
            List<Order> od=orderRepository.getAllOrders();
            for (Order oder:od) {
                if (oder.getCustomerId()==customerID){
                    System.out.println(oder.getResturantID());
                    for (String st:oder.getFooditems()) {
                        System.out.println(st);
                    }
                }

            }

        }
    }


