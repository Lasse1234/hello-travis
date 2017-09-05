
public class Casting {

	static void printChars() {
	int start = 33;
	while(start <127) {
		char akkchar;
		akkchar = (char) start;
		//System.out.printf("Als Zahl: %d, als Char: %c\n", start, start);
		System.out.println("Als int: " + start + ", als Char: " + akkchar);
		start++;
	}
	}
	
	static int stringToInt(String number) {
		int x = Integer.parseInt(number);
		return x;
	}
	
	static boolean containsPattern(char[] chars, char[] pattern) {
		String pat = new String(pattern);
		String st = new String(chars);
		return pat.contains(st);
	}
	static long convertBinaryToDecimal(String binaryNumber) {
	    double x=0;
	    for(int i=0;i<binaryNumber.length();i++){
	        if(binaryNumber.charAt(i)== '1'){
	         x=x+ Math.pow(2,binaryNumber.length()-1-i);
	     }

	    }
	    return (int) x;
	}
	
	public static void main(String[] args) {
	printChars();
	System.out.println(stringToInt("445"));
	System.out.println(containsPattern(new char[] {'a','b','c'},new char[] {'a','b','c'}));
	System.out.println(convertBinaryToDecimal("1010"));	
	}
}
