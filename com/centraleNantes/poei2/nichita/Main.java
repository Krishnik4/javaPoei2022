package com.centraleNantes.poei2.nichita;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//ex1();
		ex2();
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
		System.out.println("The day is : " + getDay(keyboardInput.nextInt()));
	}
	public static String getDay(int day){

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
        /*
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
        */
	}
}
