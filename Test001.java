package com.human.ex;

public class Test001 {

	public static void main(String[] args) {
		//1������
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.print("�¼��� :");
		String str=scanner.next();
		int i1 =Integer.parseInt(str);
		double d1=(double)i1;
		System.out.print("���尴��:");
		String str2=scanner.next();
		int i2=Integer.parseInt(str2);
		double d2=(double)i2;
		double d3=(d2/d1)*100;
		String a=String.format("%.1f", d3);
		System.out.println(a);
		
		
		//2������
		
		
		
		//����2
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("�� ���� ���ǰ��� �Է��ϼ��� : ");
		String str3=sc.next();
		int i3= Integer.parseInt(str3);
		int i4= Integer.parseInt(str3);
		int i5= Integer.parseInt(str3);
		System.out.println("�Ž������� " +(10000-(3000+200+10))+"�� �Դϴ�.");
		int i6=6790;
		String s7=((((i6-6000)%500)%100)%50)+"��";
		
		System.out.println("��õ����"+ (i6/5000)+"��");
		System.out.println("õ����"+ ((i6-5000)/1000)+"��");
		System.out.println("�������"+ ((i6-6000)/500)+"��");
		System.out.println("�����"+ (((i6-6000)%500)/100)+"��");
		System.out.println("���ʿ���"+ ((((i6-6000)%500)%100)/50)+"��");
		System.out.println("�ʿ���"+ s7);
		
		
		
		
		
		
		
	}

}
