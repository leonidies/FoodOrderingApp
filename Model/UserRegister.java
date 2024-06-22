package Model;

public class UserRegister {
    private String id;
    private String name;
    private String phonenum;
    private String email;
    private String address;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    private String role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public  String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserRegister(String id,String name, String phonenum, String email, String address, String role){
        this.id=id;
        this.name=name;
        this.phonenum=phonenum;
        this.email=email;
        this.address=address;
        this.role=role;
    }

}
