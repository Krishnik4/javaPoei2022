package com.centraleNantes.poei2.nichita;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		//ex1();
		//ex2();
		//ex3();
		ex4();

	}
	//ex1
	public static void ex1(){
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("Enter two numbers to compare: ");
		System.out.println( "The bigger number is : " + max(keyboardInput.nextInt(),keyboardInput.nextInt()));
	}
	public static int max(int num1, int num2){
		return (num1>num2) ? num1:num2;
	}


	//ex2
	public static void ex2(){
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("Enter the number of the day of the week : ");
		System.out.println("The day is : " + getDayIf(keyboardInput.nextInt()));
	}
	public static String getDayIf(int day){

		if (day==1){
			return "Monday";
		}
		else if(day ==2){
			return "Tuesday";
		}
		else if(day ==3){
			return "Wednesday";
		}
		else if(day ==4){
			return "Thursday";
		}
		else if(day ==5){
			return "Friday";
		}
		else if(day ==6){
			return "Saturday";
		}
		else if(day ==7){
			return "Sunday";
		}
		else{
			return "";
		}
	}


	//ex3
	public static void ex3(){
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("Enter the number of the day of the week : ");
		System.out.println("The day is : " + getDayIf(keyboardInput.nextInt()));
	}
	public static String getDaySwitch(int day){
		switch (day){
			case 1: return "Monday";
			case 2: return "Tuesday";
			case 3: return "Wednesday";
			case 4: return "Thursday";
			case 5: return "Friday";
			case 6: return "Saturday";
			case 7: return "Sunday";
			default: return "";
		}
	}


	//ex4
	public static void ex4(){
		Scanner keyboardInput = new Scanner(System.in);
		Hashtable<String,List<String>> days=new Hashtable<>();
		days.put("English", Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));
		days.put("French", Arrays.asList("Lundi","Mardi","Mercredi","Jeudi","Vendredi","Samedi","Dimanche"));
		System.out.println("Enter language and desired day of the week : ");
		System.out.println(days.get(keyboardInput.nextLine()).get(keyboardInput.nextInt()-1));
	}
}
