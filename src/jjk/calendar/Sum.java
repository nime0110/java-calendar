package jjk.calendar;
import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		String inputValue = sc.nextLine();
		String[] splitedValue = inputValue.split(" ");
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		System.out.println("두 수의 합은 " + (first + second) + "입니다");
		sc.close();
	}
}
