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
}
