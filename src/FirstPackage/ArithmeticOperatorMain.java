package FirstPackage;


public class ArithmeticOperatorMain {

	public static void main(String[] args) {

        
        
		ArithmeticOperations ao = new ArithmeticOperations();
		System.out.println("ADDITION");
		ao.addTwoNumbers();
		System.out.println("SUBTRACTION");
		ao.subtractTwoNumbers();
		System.out.println("MULTIPLICATION");
		ao.multiplyTwoNumbers();
		System.out.println("DIVISION");
		ao.divideTwoNumbers();
		System.out.println("ASSIGNMENT OPERATION");
		
		AssignmentOperation ao1 = new AssignmentOperation();
		ao1.assignmentOpereationAddition();
		ao1.assignmentOpereationSubtraction();
		ao1.assignmentOpereationMultiplication();
	}

}
