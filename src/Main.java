import java.util.ArrayList;
import java.util.List;

class  std{
    String name ;
    int id ;
    String clg ;

    std(String n, int i, String c){
        this.name = n;
        this.id = i;
        this.clg = c;
    }
}

 class  staff{
     String name ;
     int id ;
     String clg ;
     staff(String n, int i, String c){
         this.name = n;
         this.id = i;
         this.clg = c;
     }
     List<std> student = new ArrayList<std>();
 }


public class Main {
    public static void main(String[] args) {

        std s1 = new std("kathir",22,"ucek");
        std s2 = new std("bala",5,"ucek");
        std s3 = new std("vignesh",21,"ucek");
        std s4 = new std("jayanth",48,"ucek");
        std s5 = new std("Thalha",17,"ucek");

        staff staff1 = new staff("sathish",52,"ucek");

        staff1.student.add(s1);
        staff1.student.add(s2);
        staff1.student.add(s3);
        staff1.student.add(s4);
        staff1.student.add(s5);

        System.out.println(staff1.student);
        System.out.println(staff1.student.get(0).name);
        System.out.println(staff1.student.get(1).name);
        System.out.println(staff1.student.get(2).name);
        System.out.println(staff1.student.get(3).name);
        System.out.println(staff1.student.get(4).name);


    }
}