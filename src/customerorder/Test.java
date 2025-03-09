package customerorder;

public class Test {
    public static void  main(String[] args){

        Customer C1 = new Customer();
        C1.setId(12);
        C1.setName("kathir");
        C1.setmail("kathir@gmail.com");
        System.out.println(C1.getId());
        System.out.println(C1.getName());
        System.out.println(C1.getmail());

        Order Or1 = new Order();
        Or1.setOrderId(246);
        Or1.setOrderAmount(50000.50);
        Or1.setIsdelivered(true);
        System.out.println(Or1.getOrderId());
        System.out.println(Or1.getOrderAmount());
        System.out.println(Or1.getIsdelivered());

        Order Or2 = new Order();
        Or2.setOrderId(684);
        Or2.setOrderAmount(35000.50);
        Or2.setIsdelivered(true);
        System.out.println(Or2.getOrderId());
        System.out.println(Or2.getOrderAmount());
        System.out.println(Or2.getIsdelivered());


        C1.order.add(Or1);
        C1.order.add(Or2);
        System.out.println(C1.order.get(0).getOrderId());
        System.out.println(C1.order.get(0).getOrderAmount());
        System.out.println(C1.order.get(0).getIsdelivered());


    }
}
