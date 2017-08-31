package FirstExample.TypeInference;

public class TypeInferenceExample {

	public static void main(String[] args) {
		// Type inference is done by compiler itself
		// It is automatically inferred by compiler that
		// input argument is String & return parameter is Integer.
		StrLengthLambda myLambda = s -> s.length();
		System.out.println(myLambda.getLength("Hello Lambda World...!!!"));
		
		printLambda(myLambda);
		
	}

	public static void printLambda(StrLengthLambda l) {
		System.out.println(l.getLength("Hello in-Line lambda world...!!!"));
	}
}
