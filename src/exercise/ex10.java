package exercise;

import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		System.out.println("���������𣿣�y/n��");
		Scanner sc=new Scanner(System.in);
		String answer=sc.next();
		String result="y".equals(answer)?"�ã��¿�":"���ٽ�һ��";
		System.out.println(result);
	}

}
