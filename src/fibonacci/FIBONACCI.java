/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import javax.swing.JOptionPane;

/**
 *
 * @author Armando Yañez
 */
public class FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N1=Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos valores de la sucesion requieres?  "));
        int x=1;
        int Fr;
        int xP=0;
        System.out.println(x);
    for ( int i = 0 ; i <N1 ; ++i) {
        Fr= x +xP;
        xP = x;
        x=Fr;
        System.out.println(Fr);
        
}
            
           
        }
    }
    

