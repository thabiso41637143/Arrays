package arrays;
import java.util.*;

public class Arrays {
	
	//method defination
	static void sum(String v1, String v2) {
		System.out.print( v1 + v2);
	}
	
	public static void main(String[] args) {
		//calling a method.
		sum("Name ","Surname");
		//System.out.println(addition);
		//declaration of an array
		int[] araays = new int[5];
		int[]ary = {2,5,6,8,8};
		
		//two dimensional Array
		int [][] studMarks = new int[2][3];
		
		studMarks[0][0] = 25;
		studMarks[1][1] =30;
		studMarks[0][2]= 50;
		studMarks[1][0] = 100;
		studMarks[1][2] = 60;
		studMarks[0][1] = 78;
		int sum = 0;
		//represent the rows
		for(int i = 0; i < 2; i++) {
			//int sumcol = 0;
			//for loop representing the columns
			for (int j = 0;j <3;j++) 
				sum += studMarks[i][j];			
			
			
		}
		//the total sum of the two mention
		System.out.println(sum);
		
		//create an object to read from console.
		Scanner values = new Scanner(System.in);
		//araays[0] = values.nextInt();
		//iterate in the array using for loop.
		for(int i = 0; i < 5; i++) {
			System.out.print("Enter a number: ");
			araays[i] = values.nextInt();
		}
		int cout9s = 0;
		for(int k = 0; k < 5; k++) {
			//comparison of array values
			if (araays[k] == ary[k]) {
				cout9s += 1;
			}
		}
		System.out.print(cout9s);
		
	}

}
