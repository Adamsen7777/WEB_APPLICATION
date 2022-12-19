/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tree;

/**
 *
 * @author ADAMSEN BRANAY
 */
public class Tree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fruits orange = new fruits();
        fruits grapes = new fruits();
        
        orange.name="ORANGE";
        grapes.name="GRAPES";
                
        orange.seeds = 7;
        grapes.seeds =3;
        
        orange.taste();
        grapes.taste();
        
        orange.treename="Orange";
        orange.branch();
        
        
    }
    
}
