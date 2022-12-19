/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author ADAMSEN BRANAY
 */
class parent{
    void character(){
      System.out.println("i am a good boy");
    }
           
    
}

public class child extends parent {
     @Override
     void character(){
      System.out.println("i am a good boy & brilliant");
     }
    
}
