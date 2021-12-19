package jjk.calendar;
import java.util.Scanner;

public class MaxCalendars {
	public static void main(String[] args) {
		int a,b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 수를 입력하시오.");
		a = scanner.nextInt();
		b = scanner.nextInt();
		System.out.printf("두 수의 합은 %d입니다.", a + b);
		scanner.close();
	}
}
