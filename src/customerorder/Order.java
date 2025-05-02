package customerorder;

public class Order {

    Order(){

    }
    private int OrderId;
    private double OrderAmount;
    private Boolean Isdelivered;

    int getOrderId(){
        return this.OrderId;
    }
    double getOrderAmount(){
        return this.OrderAmount;
    }
    Boolean getIsdelivered(){
        return this.Isdelivered;
    }

    void setOrderId(int OrderId){
         this.OrderId = OrderId;
    }
    void setOrderAmount(double OrderAmount){
        this.OrderAmount = OrderAmount;
    }
    void setIsdelivered(Boolean Isdelivered){
        this.Isdelivered  = Isdelivered;
    }
}
