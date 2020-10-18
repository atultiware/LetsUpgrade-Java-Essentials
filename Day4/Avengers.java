package com.Assignment3;

import java.util.Scanner;

public class Avengers {

	private String name;
	private int age;
	private String power;
	private String weapon;
	private String planet;
	Scanner sc;
	
	/*Avengers(String name, int age, String power, String weapon, String planet)
	{
		this.name=name;
		this.age =age;
		this.power = power;
		this.planet = planet;
		this.weapon = weapon;
	}
	*/
	
	public void getDetails()
	{
		sc = new Scanner(System.in);
		System.out.println("Enter name");
		name = sc.nextLine();
		System.out.println("Enter age");
		age = sc.nextInt();
		System.out.println("Enter power");
		power = sc.nextLine();
		System.out.println("Enter weapon");
		weapon = sc.nextLine();
		System.out.println("Enter planet");
		planet = sc.nextLine();
		
	}
	
	
	public void displayDetails()
	{
		System.out.println("Name is : "+name+"Age is :"+age+"power is:"+power+"Weapon is:"+weapon+"Planet is :"+planet);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
			Avengers []a = new Avengers[5];
			for(int i = 0;i<5; i++)
			{
				a[i] = new Avengers();
				a[i].getDetails();
			}
			for(int i = 0;i<5; i++)
			{
				a[i].displayDetails();
			}
		
		
		

	}

	

}
