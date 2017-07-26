package exercise;

import java.util.Scanner;

public class project {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入消费金额：");
		double money = input.nextDouble();
		double exchange = 0;
		int goods = 0;
		if (money >= 50) {
			System.out.println("是否要参加优惠活动：");
			System.out.println("1:满50元，加两元换百事可乐一瓶");
			System.out.println("2:满100元，加三元换500ml可乐一瓶");
			System.out.println("3:满100元，加十元换五公斤面粉");
			System.out.println("4:满200元，加十元换一个苏泊尔炒菜锅一个");
			System.out.println("5:满200元，加二十元换欧莱雅爽肤水一瓶");
			System.out.println("0:不换购：");
			System.out.println("请选择:");
			if (input.hasNextInt()) {

				switch (goods) {
				case 1:
					if (money >= 50) {
						exchange = 2;
					}
					break;
				case 2:
					if (money >= 100) {
						exchange = 3;
					}
					break;
				case 3:
					if (money >= 100) {
						exchange = 10;
					}
					break;
				case 4:
					if (money >= 200) {
						exchange = 10;
					}
					break;
				case 5:
					if (money >= 200) {
						exchange = 20;
					}
					break;
				default:
					break;
				}
			} else {
				System.out.println("请输入正确的数字:");
			}
		}
		double all = money + exchange;
		System.out.println("本次的消费金额是:" + all);
		if (exchange == 2) {
			System.out.println("成功换购" + "百事可乐一瓶");

		} else if (exchange == 3) {
			System.out.println("成功换购" + "500ml可乐一瓶");
		} else if (exchange == 10 && goods == 3) {
			System.out.println("成功换购" + "五公斤面粉");
		} else if (exchange == 10 && goods == 4) {
			System.out.println("成功换购" + "苏泊尔炒菜锅一个");
		} else if (exchange == 20) {
			System.out.println("成功换购" + "欧莱雅爽肤水一瓶");
		} else {
			System.out.println("无换购项目!");
		}
	}
}
