package com.centraleNantes.poei2.nichita;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		//ex1();
		//ex2();
		//ex3();
		//ex4();
		ex5();

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
		System.out.println("The day is : " + getDaySwitch(keyboardInput.nextInt()));
	}
	public static String getDaySwitch(int day){
		return switch (day) {
			case 1 -> "Monday";
			case 2 -> "Tuesday";
			case 3 -> "Wednesday";
			case 4 -> "Thursday";
			case 5 -> "Friday";
			case 6 -> "Saturday";
			case 7 -> "Sunday";
			default -> "";
		};
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


	//ex5
	public static void ex5() {
		System.out.println("Enter the number of the desired day of the week : ");
		defaultFunction();
		errorFunction();
	}
	public static String getDayList(int day){
		List<String> days = Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday");
		return days.get(day-1);
	}
	public static void errorFunction() {
		Scanner keyboardInput = new Scanner(System.in);
		try{
			System.out.println(getDayList(keyboardInput.nextInt()));
		} catch (Exception e) {
			System.out.println("A week has 7 days");
		}
	}

	public static void defaultFunction(){
		Scanner keyboardInput = new Scanner(System.in);
		try{
			System.out.println(getDayList(keyboardInput.nextInt()));
		} catch (Exception e) {
			System.out.println(getDayList(1));
		}
	}
}
