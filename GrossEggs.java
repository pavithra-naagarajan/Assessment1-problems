package assessmentquestions;

import java.util.Scanner;

public class GrossEggs {

	public static void main(String[] args) {
		System.out.println("Enter no of eggs");
		Scanner s=new Scanner(System.in);
		int numOfEggs=s.nextInt();
		
		if(numOfEggs!=0) {
			if(numOfEggs>144) {
				int gross=(int)numOfEggs/144;
				numOfEggs=numOfEggs-(gross*144);
				System.out.println(gross);
			}
			if(numOfEggs>12) {
				int dozen=(int)numOfEggs/12;
				numOfEggs=numOfEggs-(dozen*12);
				System.out.println(dozen);
			}
			if(numOfEggs<12)
				System.out.println(numOfEggs);
			
			
		}
		
				

	}

}
