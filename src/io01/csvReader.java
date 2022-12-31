package io01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;  
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class csvReader {
	private List<Company> strList = new ArrayList<>();
	public void readCSVFile() {
		BufferedReader br;
		Scanner csvFile = new Scanner(System.in);
		System.out.println("Please enter the data file: ");
		String str= csvFile.nextLine(); // never closed?
		String line; 
		try {
			br = new BufferedReader(new FileReader (new File(str)));
			br.readLine();
			while((line=br.readLine()) != null) {
				csvValue(line);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	public void csvValue(String line) {
		Company company = new Company();
		String[] csvArray = line.split(",");
		company.setZip(Integer.parseInt(csvArray[0]));
		company.setCompName(csvArray[2]);
		company.setComRate(Double.parseDouble(csvArray[6]));
		company.setState(csvArray[3]);
		strList.add(company);
	}
	public String findMax() {
		double num = 0;
		double max = 0;
		String statement = "";
		for (Company str: getStrList()) {
			num = str.getComRate();
			if (max<num) {
				max = num;
				statement = (str.getCompName()+ "("+str.getZip()+", "+str.getState()+") - $"+max);
			}
			
		}
	return (statement);
}
	public String findMin() {
		double num = 0;
		double min = 1;
		String statement = "";
		for (Company str: getStrList()) {
			num = str.getComRate();
			if (min>num) {
				min = num;
				statement = (str.getCompName()+ "("+str.getZip()+", "+str.getState()+") - $"+min);
			}
			
		}
	return (statement);
	}
	public double findAvg() {
		double counter = 0;
		double avg = 0;
		double num = 0;
		for (Company str: getStrList()) {
			num = str.getComRate();
			avg+=num;
			counter++;
		}
		avg = avg/counter;
		return (avg);
	}
	public List<Company> getStrList() {
		return strList;
	}

}
