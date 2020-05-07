package lab5;


import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Date;

public class Lab5 {
	
	//creating the main method
	
	public static void main (String[] args) {
	ArrayList<Integer> intArray = new ArrayList<Integer>();
	Random rand = new Random(); 
	
	//adding q0 integers to the array list
	
	for(int j = 0; j<10; j++) {
		int nextVal = rand.nextInt(100);
		intArray.add(nextVal); 
		
	}
	System.out.println(intArray);
	
	//reversing the ArrayList
	
	Collections.reverse(intArray);
	System.out.println(intArray);
	
	//HourlyEmployee ArrayList
		ArrayList<HourlyEmployee> hourlyEmployeeArray = new ArrayList<HourlyEmployee>(100);
		
		for (int i = 0; i<5; i++) {
			HourlyEmployee newValue = new HourlyEmployee("Name",new Date(6,18,1998), 1.0, 2.0);
			hourlyEmployeeArray.add(newValue); 
			
		}
		//Print new arraylist
		System.out.println(hourlyEmployeeArray);
		
		System.out.println(hourlyEmployeeArray.size());
		
		//trim to size
		hourlyEmployeeArray.trimToSize();
		
	
			
		hourlyEmployeeArray.set(0, new HourlyEmployee("Name",new Date(6,18,1998), 1.0, 2.0)); 
		
		hourlyEmployeeArray.remove(2);
	
		System.out.println(hourlyEmployeeArray);
		
			
		}
	
	}
