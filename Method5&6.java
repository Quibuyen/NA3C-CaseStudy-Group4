/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casestudy4.pkg5;

/**
 *
 * @author Lorenz
 */
import java.util.*;
public class CaseStudy45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Method m = new Method();


        Scanner prog = new Scanner (System.in);
        


        System.out.print("Car Color: ");
        String color = prog.nextLine();
        m.getcolor(color);


        System.out.print("Car Id No: ");
        int ID= prog.nextInt();
        m.getId(0);


      
    }

 }
