package jjk.calendar;
import java.util.Scanner;

public class QuestionCalendar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("달을 입력하세요.");
		int inputValue = sc.nextInt();
		int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};
		if(inputValue <days.length) {				
			System.out.println(inputValue + "달은" + days[inputValue-1] + "일까지 있습니다");
		}
	}
}
