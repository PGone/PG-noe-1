package com.bosic.demo;

import java.util.Scanner;

public class xiangmu {
	public static void main(String[] args) {
		// 数据主体:一组订单信息
		String[] names = new String[4];// 订餐人确认
		String[] dishMegs = new String[4];// 所选物品
		int[] times = new int[4];// 送餐时间
		String[] addresses = new String[4];// 送餐地址
		int[] states = new int[4];// 订单状态:0:已预订1:已完成
		double[] sumPrices = new double[4];// 总额

		// 初始化2 个订单信息
		names[0] = "张帅";
		dishMegs[0] = "红烧带鱼2份";
		times[0] = 12;
		addresses[0] = "发展大厦五楼";
		sumPrices[0] = 76.0;
		states[0] = 1;

		names[1] = "张帅";
		dishMegs[1] = "鱼香肉丝2份";
		times[1] = 18;
		addresses[1] = "发展大厦五楼";
		sumPrices[1] = 20.0;

		// 供选的菜品信息
		String[] dishNames = { "红烧带鱼", "鱼香肉丝", "时令海带" };// 菜品名称
		double[] prices = new double[] { 38.0, 20.0, 10.0 };// 菜品单价
		int[] praiseNums = new int[3];
		Scanner input = new Scanner(System.in);
		int num = -1;// 用户输入0返回主菜单，否则退出系统
		boolean isExit = false;// 标志用户是否退出系统:true:退出系统
		System.out.println("欢迎使用我型我素购物系统");
		do {
			// 显示菜单
			System.out.println("*******************************************");
			System.out.println("1、我要订餐");
			System.out.println("2、查看餐袋");
			System.out.println("3、签收订单");
			System.out.println("4、删除订单");
			System.out.println("5、我要点赞");
			System.out.println("6、退出系统");
			System.out.println("*******************************************");
			System.out.println("请选择");
			int choice = input.nextInt();
			switch (choice) {
			case 2:
				// 查看餐袋
				System.out.println("***查看餐袋子***");
				System.out.println("序号\t订餐人\t餐品信息\t\t送餐日期\t送餐地址\t\t总金额\t订单状态");
				for (int i = 0; i < names.length; i++) {
					if (names[i] != null) {
						String state = (states[i] == 0) ? "已预订" : "已完成";
						String date = times[i] + "日";
						String sumPrice = sumPrices[i] + "元";
						System.out.println((i + 1) + "\t" + names[i] + "\t" + dishMegs[i] + "\t\t" + date + "\t"
								+ addresses[i] + "\t" + sumPrice + "\t" + state);
					}
				}
				break;
			case 6:
				// 退出系统
				isExit = true;
				break;
			default:
				// 退出系统
				isExit = true;
				break;

			}
			if (!isExit) {
				System.out.println("输入0返回菜单");
				num = input.nextInt();
			} else {
				break;
			}
		} while (num == 0);
		System.out.println("谢谢使用，欢迎下次光临！");
		System.out.println("雷吼啊");
	}
}
