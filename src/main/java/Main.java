public class Main {
public static void main(String[] args) 
  {
    int[] ex1  = new int[5];
    ex1[0] = 5;
    ex1[1] = 7;
    ex1[2] = -2;
    ex1[3] = 8;
    ex1[4] = 6;
    
    int[] ex2  = new int[4];
    ex2[0] = 6;
    ex2[1] = 7;
    ex2[2] = 6;
    ex2[3] = 6;
    
    int[] ex3  = new int[4];
    ex3[0] = 6;
    ex3[1] = -6;
    ex3[2] = 31;
    ex3[3] = -30;
    
    
    int[] ex4  = new int[4];
    ex4[0] = 4;
    ex4[1] = 2;
    ex4[2] = -8;
    ex4[3] = 6;
    
    int[] ex5  = new int[5];
    ex5[0] = 5;
    ex5[1] = 4;
    ex5[2] = 2;
    ex5[3] = 4;
    ex5[4] = 3;
    
    System.out.println("Testing Part A");
    FrogSimulation sim = new FrogSimulation(24, 5);
    sim.setPart("A");
    sim.setHopValues(ex1);
    System.out.println("Example 1: " + sim.simulate());
    sim.setHopValues(ex2);
    System.out.println("Example 2: " + sim.simulate());
    sim.setHopValues(ex3);
    System.out.println("Example 3: " + sim.simulate());
    sim.setHopValues(ex4);
    System.out.println("Example 4: " + sim.simulate());
    sim.setHopValues(ex5);
    System.out.println("Example 5: " + sim.simulate());
    
    
    System.out.println("\n\nTesting Part B");
    sim.setPart("B");
    int[][] numMatrix;
    
    numMatrix = new int[5][];
    numMatrix[0] = ex1; //True
    numMatrix[1] = ex2; //True
    numMatrix[2] = ex3; //True
    numMatrix[3] = ex4; //False
    numMatrix[4] = ex5; //False
    sim.setMultipleHopValues(numMatrix);
    System.out.println("Success Proportion : " + sim.runSimulations(5));  // 3/5 = .6
    
    
    numMatrix = new int[2][];
    numMatrix[0] = ex1; //True
    numMatrix[1] = ex5; //False
    sim.setMultipleHopValues(numMatrix);
    System.out.println("Success Proportion : " + sim.runSimulations(2));  // 1/2 = .5
    
    numMatrix = new int[3][];
    numMatrix[0] = ex1; //True
    numMatrix[1] = ex2; //True
    numMatrix[2] = ex3; //True
    sim.setMultipleHopValues(numMatrix);
    System.out.println("Success Proportion : " + sim.runSimulations(3));  // 3/3 = 1.0
  }
}
