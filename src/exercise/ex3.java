package exercise;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i;
		int suiSu;
		double tongJi = 0;
		for (i = 1; i <= 10; i++) {
			System.out.println("第" + i + "位年龄是:");
			suiSu = input.nextInt();
			if(suiSu<=0){
				System.out.println("你输入的年龄是非法值，请重新输入:");
			}
			if (suiSu > 30) {
				tongJi++;
			}
		}
		System.out.println("30岁以上人群比例为:" + tongJi * 10 + "%");
		System.out.println("30岁以下人群比例为:" + (100 - tongJi * 10) + "%");
	}
}