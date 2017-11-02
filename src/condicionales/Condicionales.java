/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;
import javax.swing.JOptionPane;
/**
 *
 * @author LP 13
 */
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       float numero1, numero2;
       numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el Primer  Numero"));
       numero2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el Segundo  Numero"));
       
        if (numero1 == numero2)//aqui va una  condicion
        {
            
        //si la  condicion se cumple  se ejecuta este  codigo    
        JOptionPane.showMessageDialog(null, "Son Iguales");
        
        }
        
        else 
        {
        //si  no  se cumple la  condicion s e ejecuta esto
            
        }
        // TODO code application logic here
    }
    
}
