package io01;

public class fileIO {
	public static void main(String[] args) {
		csvReader read = new csvReader();
		read.readCSVFile();
		System.out.println("The average commercial rate is: "+read.findAvg());
		System.out.println(read.findMax());
		System.out.println(read.findMin());
	}

}