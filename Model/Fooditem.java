package Model;

public class Fooditem {
    private  String id;
   private String resturantid;
   private String name;
   private String description;
   private String price;
   private boolean availability;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResturantid() {
        return resturantid;
    }

    public void setResturantid(String resturantid) {
        this.resturantid = resturantid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    public Fooditem(String id, String resturantid, String name, String price, String description, boolean availability){
        this.id=id;
        this.resturantid=resturantid;
        this.name=name;
        this.price=price;
        this.description=description;
        this.availability=availability;
    }


}
