package references.thisReference;

import references.Process;

public class ThisReferenceExample {

	public static void main(String[] args) {
		ThisReferenceExample thisReferenece = new ThisReferenceExample();
		thisReferenece.doProcess(10, new Process() {
			
			@Override
			public void process(int i) {
				System.out.println("Anonymous Inner Class | Value of i: "+i);
				System.out.println(this);
			}
			
			public String toString() {
				return "This is Anonymous Inner-Class";
			}
		});
		
		thisReferenece.doProcess(10, i -> {
			System.out.println("Lambda Expression | Value of i: "+i);
			
			// THIS WILL NOT WORK
			// that's where Lambda Expressions doesn't behave like anonymous inner-class.
			// Unlike the latter one Lambda Expressions doesn't have an instance of their own.
			// So it's like passing function as a value.
//			System.out.println(this);
			
		});
	}
	
	public void doProcess(int i, Process p) {
		p.process(i);
	}

}
