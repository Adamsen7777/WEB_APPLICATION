/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package food;

/**
 *
 * @author ADAMSEN BRANAY
 */
public class Food {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       nonveg burger = new nonveg();
       nonveg pizza = new nonveg();
       
       burger.name = "BURGER";
       pizza.name ="PIZZA";
       
       burger.price = 500;
       pizza.price =1000;
       
       burger.nice();
       pizza.nice();
       
    }
    
}
