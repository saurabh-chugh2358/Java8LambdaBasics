package references.thisReference;

import references.Process;

public class ThisReferenceExampleWithLambda {

	public static void main(String[] args) {
		ThisReferenceExampleWithLambda thisReferenece = new ThisReferenceExampleWithLambda();
		thisReferenece.execute();
	}
	
	public void doProcess(int i, Process p) {
		p.process(i);
	}
	
	public void execute() {
		// Here 'this' keyword will work because Lambda Expression is not
		// part of a static method rather class method, or a behavior attached to a particular object
		doProcess(10, i -> {
			System.out.println("Lambda Expression | Value of i: "+i);
			System.out.println(this);
			
		});
	}
	
	public String toString() {
		return "This is a reference example with lambda";
	}

}
