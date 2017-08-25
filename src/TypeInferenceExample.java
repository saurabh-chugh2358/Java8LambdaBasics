
public class TypeInferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrLengthLambda myLambda = s -> s.length();
		System.out.println(myLambda.getLength("Hello Lambda World...!!!"));
		
		printLambda(myLambda);
		
	}

	public static void printLambda(StrLengthLambda l) {
		System.out.println(l.getLength("Hello in-Line lambda world...!!!"));
	}
	
	interface StrLengthLambda {
		int getLength(String s);
	}
}
