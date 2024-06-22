package Repository;

import Model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepo {
        private List<Order> Orders=new ArrayList<>();
        public void OrderRepository() {

         this.Orders = new ArrayList<>();
       }

        public void addOrder(Order order) {
            Orders.add(order);
        }

        public List<Order> getAllOrders() {
            return Orders;
        }

        public Order getOrderById(String Id) {
            for (Order order : Orders) {
                if (order.getId() == Id) {
                    return order;
                }
            }
            return null;
        }

    public List<Order> getOrders() {
        return Orders;
    }
}



