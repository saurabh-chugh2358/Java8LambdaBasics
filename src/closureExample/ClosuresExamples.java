package closureExample;

public class ClosuresExamples {

	public static void main(String[] args) {
		int a= 10;
		int b= 20;
		
		// It will freeze the value of b (i.e. 20) and 
		// will refer to the same value whenever required.
		// Compiler doesn't enforces you to make b as a 'final' value 
		// but kind of trusts you that you will not change it's value
		doProcess(a, i -> System.out.println(a+b));
	}
	
	public static void doProcess(int i, Process p) {
		p.process(i);
	}

}
