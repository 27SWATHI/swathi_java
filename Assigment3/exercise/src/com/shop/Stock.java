package com.shop;

public class Stock extends Product {
	
	private double tax;
	
	public Stock (String name,double price,double discountPrice,double tax)super(name,price,discountPrice);
	this.tax=tax;
}

public double findPrice() {
	
	double price= this.getdiscountPrice();
	double doscountPrice = this.getDiscountPercent();
	
	double discountAmount = price * (discountPrice/100);
	double discountPrice = price - discountAmount;
	
	double  taxAmount = discountPrice*(tax/100);
	double finalPrice= discountPrice+taxAmount;
	
	

}
