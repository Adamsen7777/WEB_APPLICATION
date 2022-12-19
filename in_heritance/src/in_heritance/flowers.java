/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in_heritance;

/**
 *
 * @author ADAMSEN BRANAY
 * 
 */
class plant{
    String potname;
    int age;
    
    void newplant()
    {
       System.out.println( age + "age old" + potname);
    }
            
         
}
public class flowers extends plant{
    String name;
    int petals;
    
     void root()   
     {
         System.out.println(name + "is good");
         System.out.println(name + " has " +  petals  + " petals ");
     }     
}
