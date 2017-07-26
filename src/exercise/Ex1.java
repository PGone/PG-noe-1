package exercise;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		System.out.println("\t我行我素购物管理系统");
		System.out.println("\n");
		System.out.println("\t\t1、登录系统");
		System.out.println("\n");
		System.out.println("\t\t2、退出");
		System.out.println("\n");
		System.out.println("*  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *");
		Scanner sc = new Scanner(System.in);
		System.out.println("请选择登陆或者退出：");
		int dengLu = sc.nextInt();
		switch (dengLu) {
		case 1:
			System.out.println("\t\t1、客户信息管理");
			System.out.println("\n");
			System.out.println("\t\t2、购物结算");
			System.out.println("\n");
			System.out.println("\t\t3、真情回馈");
			System.out.println("\n");
			System.out.println("\t\t4、注销");
			break;
		case 2:
			System.out.println("\t谢谢使用");
			break;
		default:
			System.out.println("\t谢谢使用");
			break;
		}
	}
}
