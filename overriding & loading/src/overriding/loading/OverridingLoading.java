/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overriding.loading;

/**
 *
 * @author ADAMSEN BRANAY
 */
public class OverridingLoading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        weight apple = new weight ();
        
        apple.name = "APPLE";
        apple.value =20;
        
        apple.kilo();
        
        
        load orange = new load();
        
        orange.name = "ORANGE";
        orange.age = 7;
        
        orange.kilo ();
        orange.kilo(10);
                
    }
    
}
