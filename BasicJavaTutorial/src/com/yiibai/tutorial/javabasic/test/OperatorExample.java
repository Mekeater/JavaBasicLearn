package com.yiibai.tutorial.javabasic.test;

public class OperatorExample extends Student {
	
    public void eat() {
        System.out.println("eating bread...");
        super.eat();
    }
    
	public OperatorExample(int rollno, String name, String course) {
		super(rollno, name, course);
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]){  
		    short a = 10;
	        short b = 10;
	        // a+=b;//a=a+b internally so fine
	        a =(short)(a + b);// 编译时错误，因为 10+10=20 现在是 int 类型
	        System.out.println(a);
	     
	}
}
