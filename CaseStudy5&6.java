
import java.util.*;


public class CaseStudy {

    public static void main(String[] args) {
    
        Person p = new Person();


        Scanner prog = new Scanner (System.in);
        


        System.out.print("Car Color: ");
        String color = prog.nextLine();
        p.getcolor(color);


        System.out.print("Car Id No: ");
        int ID= prog.nextInt();
        p.getId(0);


      
    }

 }
