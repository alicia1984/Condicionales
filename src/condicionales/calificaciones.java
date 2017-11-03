/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;
import javax.swing.JOptionPane;
//import java.util.Scanner ; 
/**
 *
 * @author LP 13
 */
public class calificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       

float num1, num2, num3, suma, promedio; 

//Scanner entrada = new Scanner (System.in) ; 
//System.out.println ("Ingrese nota 1") ; 
num1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la primera nota"));
       
//num1 = entrada.nextFloat(); 
//System.out.println ("Ingrese nota 2"); 
    
//num2 = entrada.nextFloat(); 
num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la segunda nota"));

//System.out.println ("Ingrese nota 3"); 


//num3 = entrada.nextFloat();
num3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la tercera nota"));

suma = (num1 + num2 + num3); 
promedio = (suma/3) ;

JOptionPane.showMessageDialog(null, "SU PROMEDIO  ES"+promedio);  
if (promedio >=4) { 
//System.out.println ("El estudiante aprovo con un promedio de: " +promedio ) ;
JOptionPane.showMessageDialog(null, "El alumno a Aprovado"); 
 }
else { 
//System.out.println ("El estudiante No aprovo, el promedio es de: " +promedio ) ;
JOptionPane.showMessageDialog(null, "el  alumno No Aprobo sus Ramos"); 

        }
//System.out.println ("El estudiante aprovo con un promedio de: " +promedio );
 


    }
}
 



