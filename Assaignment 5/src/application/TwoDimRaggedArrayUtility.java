package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
//import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {

	public TwoDimRaggedArrayUtility(){

	}

	public static double getAverage(double[][] data) {
		double total = 0;
		double average = 0;
		for( int row = 0; row < data.length; row++) {
			for( int col = 0; col < data[row].length; col++) { 
				total+= data[row][col];
			}
			average = total/data.length;
		}
		return average;
	}
	public static double getColumnTotal(double[][] data, int col) {
		double total = 0;
		for( int row = 0; row < data.length; row++) {
			for( int column = 0; column < data[row].length; column++) {
				if(column == col) {
					total+= data[row][column];
				}
			}
		}
		return total;
	}
	public static double getHighestInArray(double[][] data) {
		double max  = Double.MIN_VALUE;
		for( int row = 0; row < data.length; row++) {
			for( int column = 0; column < data[row].length; column++) {
				if( data[row][column] > max) {
					max = data[row][column];
				}
			}	
		}
		return max;
	}
	public static double getHighestInColumn(double[][] data, int col) {
		double max  =  Double.MIN_VALUE; 
		for( int row = 0; row < data.length; row++) {
			for( int column = 0; column < data[row].length; column++) {
				if(column == col) {
					if( data[row][column] > max) {
						max = data[row][column];
					}
				}
			}
		}
		return max;
	}
	public static int getHighestInColumnIndex(double[][] data, int col) {
		double max  =  Double.MIN_VALUE;
		int x = 0;
		for( int row = 0; row < data.length; row++) {
			for( int column = 0,index = 0; column < data[row].length; column++,index++) {
				if(column == col) {
					if( data[row][column] > max) {
						x = index;
					}
				}
			}
		}

		return x;
	}
	public static double getHighestInRow(double[][] data, int row) {
		double max  =  Double.MIN_VALUE;
		for( int rows = 0; rows < data.length; rows++) {
			for( int column = 0; column < data[rows].length; column++) {
				if(rows == row) {
					if( data[rows][column] > max) {
						max = data[rows][column];
					}
				}
			}
		}

		return max;
	}
	public static int getHighestInRowIndex(double[][] data, int row) {
		double max  = Double.MIN_VALUE;
		int x = 0;
		for( int rows = 0; rows < data.length; rows++) {
			for( int column = 0,index = 0; column < data[rows].length; column++,index++) {

				if( rows == row ) { 
					if(data[rows][column] > max) {
						x = index;
					}

				}

			}
		}

		return x;
	}
	public static double getLowestInArray(double[][] data) {
		double min  = Double.MAX_VALUE;
		for( int row = 0; row < data.length; row++) {
			for( int column = 0; column < data[row].length; column++) {
				if( data[row][column] < min) {
					min = data[row][column];
				}
			}	
		}
		return min;
	}
	public static double getLowestInColumn(double[][] data, int col) {
		double min  = Double.MAX_VALUE;
		for( int row = 0; row < data.length; row++) {
			for( int column = 0; column < data[row].length; column++) {
				if(column == col) {
					if( data[row][column] < min) {
						min = data[row][column];
					}
				}
			}
		}
		return min;
	}
	public static int getLowestInColumnIndex(double[][] data, int col) {
		double min  = Double.MAX_VALUE;
		int x = 0;
		for( int row = 0; row < data.length; row++) {
			for( int column = 0,index = 0; column < data[row].length; column++,index++) {
				if(column == col) {
					if( data[row][column] < min) {
						x = index;
					}
				}
			}
		}

		return x;
	}
	public static double getLowestInRow(double[][] data, int row) {
		double min  = Double.MAX_VALUE;
		for( int rows = 0; rows < data.length; rows++) {
			for( int column = 0; column < data[rows].length; column++) {
					if(rows == row) {
					if( data[rows][column] < min) {
						min = data[rows][column];
					}
					}
				
			}
		}

		return min;
	}
	public static int getLowestInRowIndex(double[][] data, int row) {
		double min  = Double.MAX_VALUE;
		int x = 0;
		for( int rows = 0; rows < data.length; rows++) {
			for( int column = 0,index = 0; column < data[rows].length; column++,index++) {

				if( rows == row ) { 
					if(data[rows][column] < min) {
						x = index;
					}

				}

			}
		}

		return x;
	}
	public static double getRowTotal(double[][] data, int row) {
		double total = 0;
		for( int rows = 0; rows < data.length; rows++) {
			for( int column = 0; column < data[rows].length; column++) {
				if(rows == row) {
					total+= data[rows][column];
				}
			}
		}
		return total;
	}
	public static double getTotal(double[][] data) {
		double total = 0;
		for( int rows = 0; rows < data.length; rows++) {
			for( int column = 0; column < data[rows].length; column++) {
				total+= data[rows][column];
			}

		}
		return total;
	}
	public static double[][] readFile(java.io.File file) throws FileNotFoundException {
		
		
		double[][]myArray = null;
		try {
		Scanner scan = new Scanner(file);
		int row = 0;

			while(scan.hasNextLine()) {
				row++;
				scan.nextLine();
			}
		  scan.close();
		  scan =  new Scanner(file);
		  String line;
		 myArray = new double[row][];
		
		         for (int i = 0; i < myArray.length; i++) {
		        	 line = scan.nextLine();
		        	  String[]numbers = line.split(" ");
		        	 myArray[i] = new double[numbers.length];
		         
		            for (int j = 0; j < myArray[i].length; j++) {
		           
		               myArray[i][j] = Double.parseDouble(numbers[j]);
		            }
		       }
		         scan.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
			
		   
	return myArray;
	}
	public static void writeToFile(double[][] data, java.io.File outputFile)throws FileNotFoundException{

		
		try {
		
			
		BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
		for( int rows = 0; rows < data.length; rows++) {
			//String line = "";
			for( int column = 0; column < data[rows].length; column++) 
			{ 

				bw.write(data[rows][column]+" ");
				

			}
			
	
		}
		bw.close();
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
}
