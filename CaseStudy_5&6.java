import java.util.*;


public class CaseStudy {

    public static void main(String[] args) {
    
        Person p = new Person();


        Scanner prog = new Scanner (System.in);
         System.out.print("Car Model: ");
        String model = prog.nextLine();
        p.getModel(model);


        System.out.print("Phone No.: ");
        int phoneNum= prog.nextInt();
        p.getPhoneNum(0);
   }

 }
