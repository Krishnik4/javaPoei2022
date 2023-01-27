package com.centraleNantes.poei2.nichita;

import com.centraleNantes.poei2.nichita.YouTubeEx.Video;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		/*
		ex1();
		ex2();
		ex3();
		ex4();
		ex5();

		exBook();

		exYoutube();

		 */
		exRnJ();
	}

	/*
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


	//exBook
	public static void exBook(){

		Book book = new Book("Guide to naming books",Arrays.asList(
				new Chapter("Guide to naming chapters",1,100),
				new Chapter("Naming chapters, part 2",101,200),
				new Chapter("Mastering chapter names",201,300)
		));

		System.out.println("Book Name : " + book.name);
		System.out.println("Chapter at page 57 : " + book.getChapterName(57));
		System.out.println("Chapter at page 134 : " + book.getChapterName(134));
		System.out.println("Chapter at page 278 : " + book.getChapterName(278));
		System.out.println("Chapter at page 4532 : " + book.getChapterName(4532));
	}




	//exYoutube
	public static void exYoutube(){
		System.out.println(Video.instanceNumber);
		Video v1 = new Video(1,"1", new Date(),new ArrayList<>());
		System.out.println(Video.instanceNumber);
		Video v2 = new Video(2,"2", new Date(),new ArrayList<>());
		System.out.println(Video.instanceNumber);

	}
	 */

	//exRnJ

	public static void exRnJ(){
		//1
		List<String> words = Arrays.asList("Friar Laurence: Two households, both alike in dignity in fair Verona, where we lay our scene from ancient grudge break to new mutiny. Where civil blood makes civil hands unclean. From forth the fatal loins of these two foes. A pair of star-crossed lovers take their life whose misadventured piteous overthrows. Do with their death bury their parents strife the fearful passage of their death marked love. And the continuance of their parents’s rage which but their childrens? end, nought could remove. Is now the two hours traffic of our stage the which if you with patient ears attend what here shall miss, our toil shall strive to mend.".split("\\s+"));

		for (int i = 0; i < words.size(); i++) {
			words.set(i,words.get(i).toLowerCase());
		}
		Collections.sort(words);
		System.out.println(words);

		//2
		System.out.println(words.stream().filter((word)->word.length()>2).collect(Collectors.toList()));

		//3
		System.out.println(words.stream().filter((word) -> word.length() > 2).distinct().sorted().collect(Collectors.toList()));

		//4
		System.out.println(words.stream().collect(Collectors.groupingBy(w->w,Collectors.counting())));

		//5
		SortedSet<Map.Entry<String,Long>> set = new TreeSet<>((e1, e2) -> {int res=(int) (e2.getValue() - e1.getValue());return res!=0?res:1;});
		set.addAll(words.stream().collect(Collectors.groupingBy(w->w,Collectors.counting())).entrySet());
		System.out.println(set);

		//6
		String text = "Friar Laurence: Two households, both alike in dignity in fair Verona, where we lay our scene from ancient grudge break to new mutiny. Where civil blood makes civil hands unclean. From forth the fatal loins of these two foes. A pair of star-crossed lovers take their life whose misadventured piteous overthrows. Do with their death bury their parents strife the fearful passage of their death marked love. And the continuance of their parents’s rage which but their childrens? end, nought could remove. Is now the two hours traffic of our stage the which if you with patient ears attend what here shall miss, our toil shall strive to mend.".toLowerCase();
		Map<String,List<Integer>> wordsWithIndexes = new HashMap<>();
		for(String word:words){
			List<Integer> indexes = new ArrayList<>();
			Integer tmpIndex=text.indexOf(word+" ");
			while(tmpIndex>=0){
				indexes.add(tmpIndex);
				tmpIndex=text.indexOf(word+ " ",tmpIndex+1);
			}
			wordsWithIndexes.putIfAbsent(word,indexes);
		}
		System.out.println(wordsWithIndexes);

	}
}
