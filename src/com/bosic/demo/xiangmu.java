package com.bosic.demo;

import java.util.Scanner;

public class xiangmu {
	public static void main(String[] args) {
		// ��������:һ�鶩����Ϣ
		String[] names = new String[4];// ������ȷ��
		String[] dishMegs = new String[4];// ��ѡ��Ʒ
		int[] times = new int[4];// �Ͳ�ʱ��
		String[] addresses = new String[4];// �Ͳ͵�ַ
		int[] states = new int[4];// ����״̬:0:��Ԥ��1:�����
		double[] sumPrices = new double[4];// �ܶ�

		// ��ʼ��2 ��������Ϣ
		names[0] = "��˧";
		dishMegs[0] = "���մ���2��";
		times[0] = 12;
		addresses[0] = "��չ������¥";
		sumPrices[0] = 76.0;
		states[0] = 1;

		names[1] = "��˧";
		dishMegs[1] = "������˿2��";
		times[1] = 18;
		addresses[1] = "��չ������¥";
		sumPrices[1] = 20.0;

		// ��ѡ�Ĳ�Ʒ��Ϣ
		String[] dishNames = { "���մ���", "������˿", "ʱ���" };// ��Ʒ����
		double[] prices = new double[] { 38.0, 20.0, 10.0 };// ��Ʒ����
		int[] praiseNums = new int[3];
		Scanner input = new Scanner(System.in);
		int num = -1;// �û�����0�������˵��������˳�ϵͳ
		boolean isExit = false;// ��־�û��Ƿ��˳�ϵͳ:true:�˳�ϵͳ
		System.out.println("��ӭʹ���������ع���ϵͳ");
		do {
			// ��ʾ�˵�
			System.out.println("*******************************************");
			System.out.println("1����Ҫ����");
			System.out.println("2���鿴�ʹ�");
			System.out.println("3��ǩ�ն���");
			System.out.println("4��ɾ������");
			System.out.println("5����Ҫ����");
			System.out.println("6���˳�ϵͳ");
			System.out.println("*******************************************");
			System.out.println("��ѡ��");
			int choice = input.nextInt();
			switch (choice) {
			case 2:
				// �鿴�ʹ�
				System.out.println("***�鿴�ʹ���***");
				System.out.println("���\t������\t��Ʒ��Ϣ\t\t�Ͳ�����\t�Ͳ͵�ַ\t\t�ܽ��\t����״̬");
				for (int i = 0; i < names.length; i++) {
					if (names[i] != null) {
						String state = (states[i] == 0) ? "��Ԥ��" : "�����";
						String date = times[i] + "��";
						String sumPrice = sumPrices[i] + "Ԫ";
						System.out.println((i + 1) + "\t" + names[i] + "\t" + dishMegs[i] + "\t\t" + date + "\t"
								+ addresses[i] + "\t" + sumPrice + "\t" + state);
					}
				}
				break;
			case 6:
				// �˳�ϵͳ
				isExit = true;
				break;
			default:
				// �˳�ϵͳ
				isExit = true;
				break;

			}
			if (!isExit) {
				System.out.println("����0���ز˵�");
				num = input.nextInt();
			} else {
				break;
			}
		} while (num == 0);
		System.out.println("ллʹ�ã���ӭ�´ι��٣�");
		System.out.println("�׺�");
	}
}
