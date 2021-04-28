package application;


import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoDimRaggedArrayUtilitySTUDENT_Test {
	//STUDENT fill in dataSetSTUDENT with values, it must be a ragged array
	private double[][] dataSetSTUDENT = {{20,92,44},
										{46,62,28,7},
										{12,5}};
	
	private File inputFile,outputFile;

	@Before
	public void setUp() throws Exception {
		outputFile = new File("TestOut.txt");
	}

	@After
	public void tearDown() throws Exception {
		dataSetSTUDENT = null;
		inputFile = outputFile = null;
	}

	/**
	 * Student Test getTotal method
	 * Return the total of all the elements in the two dimensional array
	 */
	@Test
	public void testGetTotal() {
		//fail("Student testGetTotal not implemented");	
		assertEquals(316.0,TwoDimRaggedArrayUtility.getTotal(dataSetSTUDENT),.001);
	}

	/**
	 * Student Test getAverage method
	 * Return the average of all the elements in the two dimensional array
	 */
	@Test
	public void testGetAverage() {
		//fail("Student testGetAverage not implemented");	
		assertEquals(105.33333333333333333,TwoDimRaggedArrayUtility.getAverage(dataSetSTUDENT),.001);
	}

	/**
	 * Student Test getRowTotal method
	 * Return the total of all the elements of the row.
	 * Row 0 refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetRowTotal() {
	//	fail("Student testGetRowTotal not implemented");	
		assertEquals(143.0,TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT,1),.001);
	}


	/**
	 * Student Test getColumnTotal method
	 * Return the total of all the elements in the column. If a row in the two dimensional array
	 * doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * Column 0 refers to the first column in the two dimensional array
	 */
	@Test
	public void testGetColumnTotal() {
		//fail("Student testGetColumnTotal not implemented");	
		assertEquals(159.0,TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT,1),.001);
		assertEquals(72.0,TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT,2),.001);
	}


	/**
	 * Student Test getHighestInArray method
	 * Return the largest of all the elements in the two dimensional array.
	 */
	@Test
	public void testGetHighestInArray() {
		//fail("Student testGetHighestInArray not implemented");
		assertEquals(92.0,TwoDimRaggedArrayUtility.getHighestInArray(dataSetSTUDENT),.001);
	}
	

	/**
	 * Test the writeToFile method
	 * write the array to the outputFile File
	 * then read it back to make sure formatted correctly to read
	 * 
	 */
	@Test
	public void testWriteToFile() {
		double[][] array = {{1,2,3},{4,5,6,7},{0,5}};
		  
		//
		try {
		TwoDimRaggedArrayUtility.writeToFile(array,outputFile);
		}catch(Exception e) {
			fail("Student testWriteToFile not implemented");	
		}
		
		try {
			TwoDimRaggedArrayUtility.readFile(outputFile);
			assertEquals(1,array[0][0],.001);
			assertEquals(4,array[1][0],.001);
		}catch(FileNotFoundException e) {
			fail("Student testWriteToFile not implemented");	
		}
		
	}

}
