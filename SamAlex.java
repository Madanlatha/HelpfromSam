package helpSam;

import java.util.Scanner;

public class SamAlex {
	public static int samhelp(int n) {
		if(n%2==0) {
			return 1;
		}
		else {
			return 2;
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int values=samhelp(n);
		System.out.println(values);
	}

}
