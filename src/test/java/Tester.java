

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class Tester {

   @Test
   public void partA () {
      FrogSimulation test1 = new FrogSimulation(24,5);
      test1.setPart("A");
      test1.setHopValues(new int[]{5,7,-2,8,6});
      boolean res = test1.simulate();
      assertEquals(res,true);
      test1.setHopValues(new int[]{6,7,6,6});
      res = test1.simulate();
      assertEquals(res,true);
      test1.setHopValues(new int[]{6,-6,31});
      res = test1.simulate();
      assertEquals(res,true);
      test1.setHopValues(new int[]{4,2,-8});
      res = test1.simulate();
      assertEquals(res,false);
      test1.setHopValues(new int[]{5,4,2,4,3});
      res = test1.simulate();
      assertEquals(res,false);
      test1.setHopValues(new int[]{24,-7,-6,-6});
      res = test1.simulate();
      assertEquals(res,true);
      test1 = new FrogSimulation(15,3);
      test1.setPart("A");
      test1.setHopValues(new int[]{6,7,11});
      res = test1.simulate();
      assertEquals(res,true);
   }
   @Test
   public void partB(){
      FrogSimulation test1 = new FrogSimulation(24,5);
      test1.setPart("B");
      int [][] testMatrix = {{5,7,-2,8,6},
                        {6,7,6,6},
                        {6,-6,31},
                        {4,2,-8},
                        {5,4,2,4,3}};
      test1.setMultipleHopValues(testMatrix);
      assertEquals(test1.runSimulations(5),.6,.01);
      int[][] testMatrix2 ={{5,7,-2,8,6}, 
                      {5,4,2,4,3}};
      test1.setMultipleHopValues(testMatrix2);
      assertEquals(test1.runSimulations(2),.5,.01);
      int [][] testMatrix3 = {{5,7,-2,8,6},
                        {6,7,6,6},
                        {6,-6,31}};
      test1.setMultipleHopValues(testMatrix3);
      assertEquals(test1.runSimulations(3),1.0,.01);    
   }


}
