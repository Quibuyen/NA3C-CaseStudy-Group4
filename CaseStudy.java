/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casestudy;
import java.util.*;
/**
 *
 * @author iamprecious
 */
public class CaseStudy {
   public static void main(String[] args) {

        Person p = new Person();
       
        Scanner prog = new Scanner (System.in);
        System.out.print("Full Name of Renters: ");
        String rname = prog.nextLine();
        p.getRName(rname);


        System.out.print("Full Name of Owners: ");
        String oname = prog.nextLine();
        p.getOName(oname);

	//Geron Daril 
	System.out.print("Address of Renters: ");
	String address = prog.nextLine();
	p.getAddress(address);

	//Geron Daril
	System.out.print("Car Model: ");
	String model = prog.nextLine();
	p.getModel(model);
	
	//Pangilinan, Ralph Lorenz
	System.out.print("Phone No.: ");
        int phoneNum= prog.nextInt();
        p.getPhoneNum(0);


        System.out.print("No. of hours To Rent: ");
        int numD = prog.nextInt();
        p.getNumofD(numD);

	//Marc Cedric Fagaragan
	System.out.print("Rent Amount per hours: ");
        int rent = prog.nextInt();
        p.getRent(rent);


        System.out.print("No. of hours of Overtime to Rent: ");
        int OT = prog.nextInt();
        p.getOT(OT);

        //Christian Baun
        System.out.print("Amount of Overtime per hours of rent: ");
        int OTAmount = prog.nextInt();
        p.getOTAmount(OTAmount);


        System.out.print("Amount of Tax: ");
        int tax = prog.nextInt();
        p.getTax(tax);


        p.result();
 }
    
}
