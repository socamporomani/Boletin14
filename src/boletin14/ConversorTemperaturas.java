/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;
import java.io.IOException;
/**
 *
 * @author socamporomani
 */
public class ConversorTemperaturas {
  final int l=80;
 // float temperaturaC;
  public void centigradosAFahrenheit (float temperaturaC)throws TemperaturaErradaExcepcion{
      float fahrenheit;
    if (temperaturaC>80 || temperaturaC<0)
        throw new TemperaturaErradaExcepcion("La temperatura debe ser entre 0ºC y 80ºC");
    else
      fahrenheit=(float) (9.0/5.0*temperaturaC+32.4);
      System.out.println(fahrenheit);


  }
  
  public void centigradosAReamur (float temperaturaC)throws TemperaturaErradaExcepcion{
      float reamur;
      if (temperaturaC>80 || temperaturaC<0)
          throw new TemperaturaErradaExcepcion("La temperatura debe ser entre 0ºC y 80ºC");
      else{
          reamur = (float) (4.0 / 5.0 * temperaturaC) ;
          System.out.println(reamur);
  }
  }
}
