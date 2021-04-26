package week2;

public class Product {
	
	int id;
	String name;
	double unitPrice;
	String detail;
	Product(){
		System.out.println("Default Constructor");
	}
	Product(int id, String name, double unitPrice, String detail){//overloading like functions but this is constructor overloading
		this();//calling Product() constructor!!!!
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
}
