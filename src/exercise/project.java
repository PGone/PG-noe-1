package exercise;

import java.util.Scanner;

public class project {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���������ѽ�");
		double money = input.nextDouble();
		double exchange = 0;
		int goods = 0;
		if (money >= 50) {
			System.out.println("�Ƿ�Ҫ�μ��Żݻ��");
			System.out.println("1:��50Ԫ������Ԫ�����¿���һƿ");
			System.out.println("2:��100Ԫ������Ԫ��500ml����һƿ");
			System.out.println("3:��100Ԫ����ʮԪ���幫�����");
			System.out.println("4:��200Ԫ����ʮԪ��һ���ղ������˹�һ��");
			System.out.println("5:��200Ԫ���Ӷ�ʮԪ��ŷ����ˬ��ˮһƿ");
			System.out.println("0:��������");
			System.out.println("��ѡ��:");
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
				System.out.println("��������ȷ������:");
			}
		}
		double all = money + exchange;
		System.out.println("���ε����ѽ����:" + all);
		if (exchange == 2) {
			System.out.println("�ɹ�����" + "���¿���һƿ");

		} else if (exchange == 3) {
			System.out.println("�ɹ�����" + "500ml����һƿ");
		} else if (exchange == 10 && goods == 3) {
			System.out.println("�ɹ�����" + "�幫�����");
		} else if (exchange == 10 && goods == 4) {
			System.out.println("�ɹ�����" + "�ղ������˹�һ��");
		} else if (exchange == 20) {
			System.out.println("�ɹ�����" + "ŷ����ˬ��ˮһƿ");
		} else {
			System.out.println("�޻�����Ŀ!");
		}
	}
}
