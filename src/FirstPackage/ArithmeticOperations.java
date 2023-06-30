package FirstPackage;
public class ArithmeticOperations {
	int num1;
	int num2;
	void addTwoNumbers() {
		num1=30;
		num2=24;
		
        	//num1 += num2;
			double sum = num1 + num2;//in his case we can store value of int variable in double since double can store both whole number and decimal
    		System.out.println("Sum of "+num1+" and "+num2+" is "+sum);
	}
	void subtractTwoNumbers() {
		num1=12;//reassigning
		num2=4;
		int difference = num1-num2;
		System.out.println("Difference of "+num1+" and "+num2+" is "+difference);
}
	void multiplyTwoNumbers() {
		num1=56;
		num2=5;
		int product = num1*num2;
		System.out.println("The product of "+num1+" and "+num2+" is "+product);
	}
	
	void divideTwoNumbers() {
		num1=62;
		num2=9;
		double quotient = num1/num2;
		double remainder = num1%num2;
		System.out.println("The quotient of "+num1+" and "+num2+" is "+quotient);
		System.out.println("The remainder of "+num1+" and "+num2+" is "+remainder);
	}
	
}
