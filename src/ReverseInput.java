import java.util.Scanner;
public class ReverseInput {
private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a number or a String to reverse..");
		String str = s.nextLine();
		System.out.println(reverse(str));
	}
	public static String reverse(String number){
		StringBuilder sb = new StringBuilder(number);
		sb.reverse();
		String strReverse = sb.toString();
		return strReverse;
	}

}