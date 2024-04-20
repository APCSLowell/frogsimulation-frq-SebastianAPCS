public class FrogSimulation {
	private int goalDistance;
	private int maxHops;
	
	public FrogSimulation(int dist, int numHops) {
		goalDistance = dist;
		maxHops = numHops;
		maxHopsHolder = numHops;
	}
	
	public boolean simulate() { 
		int frogPosition = 0;

		for (int i = 0; i < maxHops; i++) {
			frogPosition += hopDistance();
		}

		return frogPosition > goalDistance;
	}
	
	public double runSimulations(int num) {
		double numSuccess = 0;

		for (int i = 0; i < num; i++) {
			numSuccess += simulate() == true ? 1 : 0;
		}

		return numSuccess / num;
	}
	
	
	private String part; 

	private int[] hopValues;
	private int[][] hopValuesMatrix;
	
	private int hopIndex = 0;
	private int row = 0;
	private int col = 0;
	
	private int maxHopsHolder;
	
	private int hopDistance() {
		int value = 0;
	
		if (this.part.equals("A")) {
			if (hopValues != null && hopIndex < hopValues.length) {
				value = hopValues[hopIndex];
				hopIndex++;
			}
		} else if (this.part.equals("B")) {
			if (hopValuesMatrix != null && row < hopValuesMatrix.length) {
				value = hopValuesMatrix[row][col];
				col++;
				if (col == hopValuesMatrix[row].length) {
					col = 0;
					row++;
				}
			}
		}
	
		return value;
	}
	
	public void setPart(String letter) {
		this.part = letter;
	}
	
	public void setHopValues(int[] hopValues) {
		this.maxHops = maxHopsHolder;
		this.hopValues = hopValues;
		hopIndex = 0;
	}
	
	public void setMultipleHopValues(int[][] hopValuesMatrix) {
		this.hopValuesMatrix = hopValuesMatrix;
		this.row = 0;
		this.col = 0;
	}
}
