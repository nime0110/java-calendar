package jjk.calendar;
import java.util.Scanner;

public class QuestionCalendar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("달을 입력하세요.");
		int inputValue = sc.nextInt();
		int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};
		if(inputValue <13) {
			System.out.println(inputValue + "달은" + days[inputValue-1] + "일까지 있습니다");
		} else {
			System.out.println("1월부터 12월까지 입력하세요.");			
		}
		sc.close();
	}
}
