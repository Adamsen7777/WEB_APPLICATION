/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding.loading;

/**
 *
 * @author ADAMSEN BRANAY
 */
class weight{
    String name;
    int value;
    
    void kilo(){
        System.out.println( name + value);
    }
    
}


public class load extends weight {
    String name;
    int age;
    
    
    @Override
    void kilo(){
        System.out.println( name + age);
    }
    void kilo(int i){
        System.out.println("Hello");
    }
    
}
