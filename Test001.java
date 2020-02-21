package com.human.ex;

public class Test001 {

	public static void main(String[] args) {
		//1번문제
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.print("좌석수 :");
		String str=scanner.next();
		int i1 =Integer.parseInt(str);
		double d1=(double)i1;
		System.out.print("입장객수:");
		String str2=scanner.next();
		int i2=Integer.parseInt(str2);
		double d2=(double)i2;
		double d3=(d2/d1)*100;
		String a=String.format("%.1f", d3);
		System.out.println(a);
		
		
		//2번문제
		
		
		
		//도전2
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("세 개의 물건값을 입력하세요 : ");
		String str3=sc.next();
		int i3= Integer.parseInt(str3);
		int i4= Integer.parseInt(str3);
		int i5= Integer.parseInt(str3);
		System.out.println("거스름돈은 " +(10000-(3000+200+10))+"원 입니다.");
		int i6=6790;
		String s7=((((i6-6000)%500)%100)%50)+"장";
		
		System.out.println("오천원권"+ (i6/5000)+"장");
		System.out.println("천원권"+ ((i6-5000)/1000)+"장");
		System.out.println("오백원권"+ ((i6-6000)/500)+"장");
		System.out.println("백원권"+ (((i6-6000)%500)/100)+"장");
		System.out.println("오십원권"+ ((((i6-6000)%500)%100)/50)+"장");
		System.out.println("십원권"+ s7);
		
		
		
		
		
		
		
	}

}
