package com.ust;

import java.util.logging.Logger;

public class Calculator {
	public int add(int i1 ,int i2) {
	
	return i1+i2;
	}
	
	public String add(String s1,String s2,String s3) {
		return s1+s2+s3;
	}
	public int add(int i4 ,int i5,int i3) {
		System.out.println();
		return i4+i5+i3;
		
	}
	
	public static void main(String[] args) {
	 Logger logger=Logger.getLogger(Calculator.class.getName());
		Calculator c =new Calculator();
	 
	 logger.info( "result:"+c.add(3, 40));
		logger.info("result:"+c.add("swapna","parvathy","hiran"));
		logger.info( "result:"+c.add(3, 4,9));
	}

}
