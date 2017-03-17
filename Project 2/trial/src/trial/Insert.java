package trial;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Insert {
	
	public static void main(String args[]) throws IOException{
		PrintStream out = new PrintStream(new FileOutputStream("output3.txt"));
		System.setOut(out);
		int[][] trainUser = new int[200][1000];
		for(int i=0;i<trainUser.length;i++){
			for(int j=0;j<trainUser[0].length;j++){
			trainUser[i][j]=-1;
			}
		}
		
		Scanner sc=new Scanner(new File("train.txt"));
		for(int row=0;row<trainUser.length;row++){
			for(int column=0;column<trainUser[0].length;column++){
				trainUser[row][column]=sc.nextInt();
				
			}
			
		}
		sc.close();
		
		for(int i=0;i<trainUser.length;i++){
			for(int j=0;j<trainUser[0].length;j++){
				System.out.print(trainUser[i][j]+" ");
			}
			System.out.println();
		}
	}
}
