package com.bridgelabz.QuestientRemender;

import org.apache.logging.log4j.Logger;



import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
/**
 * Hello world!
 *
 */
public class App 
{
	
	private static final Logger Log = LogManager.getLogger(App.class);
	//numerator
	private int Numerator;
	//denominator
	private int Denominator;
	
    public static void main( String[] args )
    {
    	// this section of the code will generate log file and print log message on console
    			String message="Welcome ";
    			Log.debug(message + " will be printed on Debug");
    			Log.info(message + " Will be printed on info");
    			Log.warn(message + " will be printed on warn");
    			Log.error(message + " will be printed on error");
    			Log.fatal(message + " will be printed on fatal");
    			Log.info("Appending String: {}.", message);
    			System.out.println(message);
    			App a=new App();
    			a.setNumerator();
    			a.setDenominator();
    			a.calculateQuestientAndRemender();
    }
    public void setNumerator() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the value for numerator");
    	this.Numerator =sc.nextInt();
    	
    }
    public int getNumerator() {
    	return this.Numerator;
    }
    
    public void setDenominator() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the value for denominator");
    	this.Denominator=sc.nextInt();
    	
    }
    
    public int getDenominator() {
    	return this.Denominator;
    }
    
    public void calculateQuestientAndRemender() {
    	System.out.println("questient" + this.Numerator / this.Denominator);
    	System.out.println("Remender" + this.Numerator % this.Denominator);
    }
    
}
