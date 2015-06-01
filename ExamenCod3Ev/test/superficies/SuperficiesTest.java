/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficies;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Miguel
 */
@RunWith(Parameterized.class)
public class SuperficiesTest {


   private float inputNumber;
   private float inputNumber2;
   private float radio;
   private String opc;
   private float expectedRes;
   private Superficies SuperficiesTest;

   @Before
   public void initialize() {
      SuperficiesTest = new Superficies();
   }

   // Each parameter should be placed as an argument here
   // Every time runner triggers, it will pass the arguments
   // from parameters we defined in primeNumbers() method
   public SuperficiesTest(float inputNumber,float inputnumber2 ,float radio, String opc ,float expectedRes) {
      this.inputNumber = inputNumber;
      this.inputNumber2=inputnumber2;
      this.radio=radio;
      this.opc = opc;
      this.expectedRes=expectedRes;
   }

   @Parameterized.Parameters
   public static Collection Calcula2Test() {
      return Arrays.asList(new Object[][] {
         {2,2,0,"Cuadrado",4},
         { 4,2,1,"Triangulo",4},
         { 4,4,2,"Cuadrado",16},
         { 6,4,3,"Rectangulo",24},
         { 0,0,2,"Circulo",12}
      });
   }

    @Test
    public void testRealizaOperacion() {
    System.out.println("Parameterized Number is : " + expectedRes);
      assertEquals(expectedRes, Superficies.realizaOperacion(inputNumber, inputNumber2,radio, opc),0);
    }
    
}
