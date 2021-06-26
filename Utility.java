package Utility.java;
import java.util.Scanner;

	public class Utility {
		Scanner scanner;
		
	 public Utility() {
		 scanner = new Scanner(System.in);
	 }
	 public int getIntValue() {
		 return scanner.nextInt();
	 }
	 // method to return flip coin percentile
	 public void flipCoin(int numberOfFlip) {
		 double heads =0,tails = 0;
			for(int i = 0;i < numberOfFlip; i++) {
			double side = Math.random();	
			if(side>0.5) {
				heads++;
			}
			else {
				tails++;
				}
			}
			System.out.println("Number of head occurance ::" + heads);
			System.out.println("Number of tail occurance ::" + (numberOfFlip-heads));
			double headPercent = ((heads * 100)/numberOfFlip);
			double tailPercent = ((tails * 100)/numberOfFlip);
			System.out.println("Heads Percentage ::" + headPercent + "%");
			System.out.println("Tails Percentage ::" + tailPercent + "%");
			}
	 }
