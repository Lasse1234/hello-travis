
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
	
	public static void main(String[] args) {
	printChars();
	System.out.println(stringToInt("445"));
		
	}
}
