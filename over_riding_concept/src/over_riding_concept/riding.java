/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package over_riding_concept;

/**
 *
 * @author ADAMSEN BRANAY
 */
public class riding {
    String name;
    int exp;
    
 void bike()
 {
     System.out.println( name + " ride a bike with " +  exp + " years of experience");
     
 }           
}

 class pillion extends riding{
    String name;
    int age;
    
   pillion() {
       
       name = "BRANAY";
       age = 23;
               
   }
    pillion(int i) {
       
       name = "abinesh";
       age = 2777;
               
   }       
    
    @Override
    void bike(){
        
        System.out.println( name + " is a pillion of adams bike  " + age + " old " );
    }
    void car(){
        System.out.println( "this is a car");
    }
    void car(int j){
        System.out.println( "this is a super car");
    }
}
        