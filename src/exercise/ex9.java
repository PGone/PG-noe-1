package exercise;

import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		int sum = 3;
		String name = "";
		int password = 0;
		int i ;
		Scanner input = new Scanner(System.in);
		for ( i = 0; i < 3; i++) {
			System.out.println("请输入用户名: ");
			name = input.next();
			System.out.println("请输入密码:");
			password = input.nextInt();
			if (("jim").equals(name) && password == 123456) {
				System.out.println("欢迎登陆Myshopping系统！");
				break;
			} else {
				sum--;
				System.out.println("输入错误您还有" + sum + "次机会");

				continue;

			}

		}
		if (i == 3) {
			System.out.println("对不起，您3次均输入错误！");
		}
	}
}
