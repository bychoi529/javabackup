package com.human.ex;
import java.util.Arrays;
import java.util.Scanner;
public class JavaStart05 {

	public static void main(String[] args) {
//		System.out.println(Math.sqrt(9)); //������ ���ϴ� ��
		
		int arr1[]= {1,2,3,4,8};
		System.out.println(java.util.Arrays.toString(arr1));
		int arr2[]= {2,4,6,8,10};
		System.out.println(Arrays.toString(arr2));
		
		//���Ǳ� ����
		
		Scanner sc=new Scanner(System.in);
		String str="";
		
		System.out.println("���� �������ּ���");
		
		int deposit=Integer.parseInt(sc.nextLine());
		while(!str.equals("4")) {
		System.out.println("1.���̴� 2.�ݶ� 3.ȯŸ 4.���� �� �ϳ� ����>>");
		str=sc.nextLine();
		switch(str) {
		case "1":
			if(deposit<700) {
				System.out.println("�ܾ׺���");}
			else{
				
				System.out.println("�ܵ���"+(deposit-700)+"�Դϴ�");
				deposit=deposit-700;
				
			}
			break;
		case "2":
			if(deposit<500) {
				System.out.println("�ܾ׺���");}
			else{
				deposit=deposit-500;
			System.out.println("�ܵ���"+deposit+"�Դϴ�");
		
			}
			break;
		case "3":
			if(deposit<350) {
				System.out.println("�ܾ׺���");}
			else{
				deposit=deposit-350;
				System.out.println("�ܵ���"+deposit+"�Դϴ�");
				break;
				}
			break;
		case "4":
			System.out.println("����off");
			
			int d1=deposit/1000;
			int d2=deposit/500;
			int d3=deposit%500/100;
			int d4=deposit%500%100/50;
			System.out.printf("�Ž������� 1000�� %d��,500�� %d��, 100�� %d��, 50�� %d�� �Դϴ�",d1,d2,d3,d4);
			break;
			
			default:
				break;
			
		}
			
		}
		
	}

}
