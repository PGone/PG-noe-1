package exercise;

import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		System.out.println("听明白了吗？（y/n）");
		Scanner sc=new Scanner(System.in);
		String answer=sc.next();
		String result="y".equals(answer)?"好，下课":"我再讲一遍";
		System.out.println(result);
	}

}
