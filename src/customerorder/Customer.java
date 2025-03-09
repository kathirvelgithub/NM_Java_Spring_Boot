package customerorder;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int Id;
    private String Name ;
    private String mail;
    List<Order> order =new ArrayList<Order>() ;

    int getId(){
        return this.Id;
    }
    String getName(){
        return this.Name;
    }
    String getmail(){
        return this.mail;
    }

    void setId(int Id){
        this.Id = Id;
    }
    void setName(String Name){
        this.Name = Name;
    }
    void setmail(String mail){
        this.mail = mail;
    }

}
