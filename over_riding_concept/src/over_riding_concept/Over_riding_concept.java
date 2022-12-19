/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package over_riding_concept;

/**
 *
 * @author ADAMSEN BRANAY
 */
public class Over_riding_concept {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        riding adam = new riding();
        
        adam.name = "ADAM";
        adam.exp = 23;
        
        adam.bike();
        
        pillion bretlee = new pillion(5);
//         bretlee.name = "BRETLEE";
//         bretlee.age =17;
         
         bretlee.bike();
         bretlee.car(7);
         bretlee.car();
    }   
    
    
}
