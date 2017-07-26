package exercise;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		int i = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("\t1、客户信息管理");
		System.out.println("\t2、购物结算");
		System.out.println("\t3、真情回顾");
		System.out.println("\t4、注销");
		System.out.println("请选择，输入数字:");
		i = input.nextInt();
		while (i <= 4) {
			if (i == 1) {
				System.out.println("\t1、客户信息管理");
			} else if (i == 2) {
				System.out.println("\t2、购物结算");
			} else if (i == 3) {
				System.out.println("\t3、真情回顾");
			} else if (i == 4) {
				System.out.println("\t4、注销");

			}else{
				System.out.println("请输入正确编号！");
			}
			System.out.println("程序结束！");
		}
	}
}
