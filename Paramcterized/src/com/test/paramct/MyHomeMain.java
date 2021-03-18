package com.test.paramct;

public class MyHomeMain {
	public static void main (String[] args){
		
		MyHome collection = new MyHome();
		collection.database("Tani",30,'f',5.2,"Bronx",10462,1234567);
		System.out.println("*****");
		collection.database("Shaharin",31,'F',3.1,"Queens", 11373,1234567);
		System.out.println("*******");
		collection.database("kimi",32,'F',3.1,"Yonker", 10708,1234567);
		System.out.println("*******");
		
	}

}
