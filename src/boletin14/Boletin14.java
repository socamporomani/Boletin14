/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author socamporomani
 */
public class Boletin14 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner ler=new Scanner(System.in);
        System.out.println("Introduce 1 si quieres convertir a Fº o 2 para Reamur");
        int temperatura =ler.nextInt();
        
        ConversorTemperaturas obx =new ConversorTemperaturas();
       switch(temperatura){
           case 1:
               try{
            obx.centigradosAFahrenheit(Float.parseFloat(JOptionPane.showInputDialog("introduce los grados")));
            
        }catch(TemperaturaErradaExcepcion ex){
            System.out.println(ex.getMessage());  
        }
               break;
           case 2:
             
        try{
            obx.centigradosAReamur(Float.parseFloat(JOptionPane.showInputDialog("introduce los grados")));
            
        }catch(TemperaturaErradaExcepcion ex){
            System.out.println(ex.getMessage());  
        }
        break;
           default:
    }
    }
}
