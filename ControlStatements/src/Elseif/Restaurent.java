package Elseif;

import java.util.Scanner;
public class Restaurent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("1.Veg");
System.out.println("2.Non-Veg");
System.out.println("3.No Order");
int Choice=in.nextInt();
if(Choice==1) {
	System.out.println("1.Panner");
	System.out.println("2.Veg-Biryani");
	System.out.println("3.Sambar");
	Choice=in.nextInt();
	if(Choice==1) {
		System.out.println("Panneer has been Selected");
		int price=60;
		System.out.println("No of Plates");
		Choice=in.nextInt();
		price=price*Choice;
		System.out.println("Total Price----"+price);
	}
	if(Choice==2) {
		System.out.println("Veg Biryani has been Selected");
		int price=70;
		System.out.println("No of Plates");
		Choice=in.nextInt();
		price=price*Choice;
		System.out.println("Total Price----"+price);
	}
	if(Choice==3) {
		System.out.println("Sambar has been Selected");
		int price=30;
		System.out.println("No of Plates");
		Choice=in.nextInt();
		price=price*Choice;
		System.out.println("Total Price----"+price);
	}
	else {
		System.out.println("No Order");
	}
}
else if(Choice==2) {
	System.out.println("1.Cihcken-Biryani");
	System.out.println("2.Mutton-Biryani");
	System.out.println("3.Chicken Friedrice");
	Choice=in.nextInt();
	if(Choice==1) {
		System.out.println("Chicken Biryani has been Selected");
		int price=130;
		System.out.println("No of Plates");
		Choice=in.nextInt();
		price=price*Choice;
		System.out.println("Total Price----"+price);
	}
	else if(Choice==2) {
		System.out.println("Mutton Biryani has been Selected");
		int price=200;
		System.out.println("No of Plates");
		Choice=in.nextInt();
		price=price*Choice;
		System.out.println("Total Price----"+price);
	}
	else if(Choice==3) {
		System.out.println("Chicken Friedrice has been Selected");
		int price=80;
		System.out.println("No of Plates");
		Choice=in.nextInt();
		price=price*Choice;
		System.out.println("Total Price----"+price);
	}
	else {
		System.out.println("No Order");
	}

	}
else {
	System.out.println("No Order");
}
	}
}
