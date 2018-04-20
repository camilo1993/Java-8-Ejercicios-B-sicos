/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcii;

import javax.swing.JOptionPane;

/**
 *
 * @author kamilo
 */
public class CalcII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                String [] arc=new String[5];
        
        for(int i=0;i<5;i++){
            
            arc[i]=JOptionPane.showInputDialog("Introducir Números " + (i+1));
        }
        

        
        for(String elemento: arc){
    
            System.out.println("Número:" + elemento);
        }
    }
    
}
        
        
        
        
    