/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casestudy;

/**
 *
 * @author iamprecious
 */
class Person {
         private String rname;
    private String oname;
    private int rent;
    private int OT;


    //Method 1: 
    public void getRName(String rname)
    {
        this.rname = rname;
    }
    
    public String showName()
    {
        return rname;
    }
    
    //Method 2: 
    public void getOName(String oname)
    {
        this.oname = oname;
    }
  
    public String showOName()
    {
        return oname;
        
    }

    //Method 7: Marc Cedric Fagaragan
    public void getRent(int rent)
    {
        this.rent = rent;
    }
    
    public int showrent()
    {
        return rent;
    }
    
    //Method 8: Marc Cedric Fagaragan
    public void getOT(int OT)
    {
        this.OT = OT;
    }
    
    public int showOT()
    {
        return OT;
    }
    
    //Method 11: Rommel Christian Sindayen
    public int TRent()
    {
	int TotalRent = (rent * 10)+OTAmount;
	return TotalRent;
    }
    
    //Method 12: Rommel Christian Sindayen
    public int TRentTax()
    {
	int RentTax = (rent*10 + OTAmount) -tax;
	return RentTax;
    }
    public void result()
    {
	System.out.println("The Total Rent is: " +TRent());
	System.out.println("The Total Rent with Tax: " +TRentTax());
    }
}
