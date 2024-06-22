package Model;

import java.util.List;

public class Order {
   private String id;
   private String CustomerId;
   private String ResturantID;
   private List<String> Fooditems;
   private String Totalprice;
   private String Status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String customerId) {
        CustomerId = customerId;
    }

    public String getResturantID() {
        return ResturantID;
    }

    public void setResturantID(String resturantID) {
        ResturantID = resturantID;
    }

    public List<String> getFooditems() {
        return Fooditems;
    }

    public void setFooditems(List<String> fooditems) {
        Fooditems = fooditems;
    }

    public String getTotalprice() {
        return Totalprice;
    }

    public void setTotalprice(String totalprice) {
        Totalprice = totalprice;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Order(String id, String customerId, String resturantID, List<String> fooditems, String totalprice, String Status) {
        this.id = id;
        this.CustomerId = customerId;
        this.ResturantID = resturantID;
        this.Fooditems = fooditems;
        this.Totalprice = totalprice;
        this.Status = "placed";
    }
}
