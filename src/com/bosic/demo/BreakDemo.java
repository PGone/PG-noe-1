package com.bosic.demo;

import java.util.Scanner;

public class BreakDemo {
	/**
	 * ѭ��¼��ѧ���ɼ������븺�����˳�
	 */
	public static void main(String[] args) {
		double score=0; // ÿ�ſεĳɼ�
		double sum = 0; // �ɼ�֮��
		double avg = 0.0; // ƽ����
		boolean isNegative = false; // �Ƿ�Ϊ����
		Scanner input = new Scanner(System.in);
		System.out.print("����ѧ������: ");
		String name = input.next(); // ��������
		
		System.out.println("������γ�������");
		int count=input.nextInt();
		for (int i = 0; i < count; i++) { // ѭ��5��¼��5�ſγɼ�
			System.out.print("�������" + (i + 1) + "�ſεĳɼ��� ");
			score = input.nextDouble();
			if (score < 0) { // ���븺��
				isNegative = true;
				break;
			}
			sum = sum + score; // �ۼ����
		}
		if (isNegative) {
			System.out.println("��Ǹ������¼����������½���¼�룡");
		} else {
			avg = sum / count; // ����ƽ����
			System.out.println(name + "��ƽ�����ǣ�" + avg);
		}
	}
}

