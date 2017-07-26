package exercise;

import java.util.Scanner;

public class ex8 {
	public static void main(String[] args) {
		int kaHao = 0;
		String sR = "";
		int jiFen = 0;
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {

			System.out.println("请输入会员卡号（4位整数）");
			kaHao = input.nextInt();
			System.out.println("请输入会员生日（月/日<用两位整数表示>）");
			sR = input.next();
			System.out.println("请输入会员积分");
			jiFen = input.nextInt();
			if (kaHao < 1000 || kaHao > 9999) {
				System.out.println("输入的是错误的会员卡号，请重新输入！");
				continue;
			}
			System.out.println("您录入的会员信息是:" + "会员卡号" + kaHao + "会员生日" + sR + "会员积分" + jiFen);
		}
		System.out.println("程序结束！");
	}
}
