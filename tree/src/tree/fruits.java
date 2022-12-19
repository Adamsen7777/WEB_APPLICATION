/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/**
 *
 * @author ADAMSEN BRANAY
 */
class trees{
    String treename;
    int height;
    
    void branch()
    {
      System.out.println(treename + " is big tree ");
    }      
    
}

public class fruits extends trees{
    String name;
    int seeds;
    
    void taste()
    {
        System.out.println(name + " have " +seeds+ " seeds ");
        System.out.println(name+ " is good fruit " );
    }
    
    
}
