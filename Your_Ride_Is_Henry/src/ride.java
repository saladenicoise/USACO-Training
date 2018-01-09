/*
ID: jules.l1
LANG: JAVA
TASK: ride
 */
import java.io.*;
import java.util.*;

public class ride {

	public static void main(String[] args) throws IOException{
		// Use BufferedReader rather than RandomAccessFile; it's much faster
		char []letters = new char[12];
		int b = 0;
		BufferedReader f = new BufferedReader(new FileReader("ride.in"));
		// input file name goes above
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
		// Use StringTokenizer vs. readLine/split -- lots faster
		for(int a = 0; a < 2; a++) {
			StringTokenizer st = new StringTokenizer(f.readLine());
			while (st.hasMoreTokens()) {
				System.out.println(st.nextToken());
				letters[b] = 
				b++;
			}	
		}
	}

}
