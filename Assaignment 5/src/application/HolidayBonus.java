package application;

public class HolidayBonus {
	public HolidayBonus() {
	
	}
	public static double[] calculateHolidayBonus(double[][] data, double high, double low, double other) {
		//double value = 0;
		double[]  bonus = new double[data.length]; 
		for(int row = 0; row < data.length; row++) {
			for(int col = 0; col < data[row].length; col++) {
				double highest = TwoDimRaggedArrayUtility.getHighestInColumn(data, col);
				double lowest = TwoDimRaggedArrayUtility.getLowestInColumn(data, col);
				
				if(data[row][col] == highest) {
					bonus[row] += high;
				}else if(data[row][col] == lowest) {
					bonus[row] += low;
				}else if(!(data[row][col] == highest || data[row][col] == lowest)) {
					bonus[row] += other;
				}
				
			}
			
		}
		return bonus;
		
	}
public static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other)	{
	double Btotal = 0;
	for(int row = 0; row < data.length; row++) {
		for(int col = 0; col < data[row].length; col++) {
			double highest = TwoDimRaggedArrayUtility.getHighestInColumn(data, col);
			double lowest = TwoDimRaggedArrayUtility.getLowestInColumn(data, col);
			if(data[row][col] == highest) {
				
				Btotal+= high;
			}else if(data[row][col] == lowest) {
	
				Btotal+= low;
			}else if(!(data[row][col] == highest || data[row][col] == lowest)) {
				
				Btotal+= other;
			}
			
		}
	
	}
	return Btotal;
}
}