import java.util.*;


public class CaseStudy {

    public static void main(String[] args) {
    
        Person p = new Person();


        Scanner prog = new Scanner (System.in);
        
        System.out.print("Phone No.: ");
        int phoneNum= prog.nextInt();
        p.getPhoneNum(0);
        
        System.out.print("No. of hours To Rent: ");
        int numD = prog.nextInt();
        p.getNumofD(numD);
   }

 }
