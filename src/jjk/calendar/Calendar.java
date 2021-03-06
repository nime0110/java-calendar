package jjk.calendar;
import java.util.Scanner;

public class Calendar {
	//로직을 재사용하기 위해 함수로 만들어줌. 
	private static final int[] MAX_DAYS = {31,29,31,30,31,30,31,31,30,31,30,31};
	public int getmaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	} 
	public void printSampleCalendar() {
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8 9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}
	//이 메소드 -> 인트로 입력받아서 인트로 되돌려준다.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력하세요.");
		Calendar cal = new Calendar();
		int month = scanner.nextInt();
		System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getmaxDaysOfMonth(month));
		//함수라고 부를때도 있고 메소드라고 할때도 있음.
		cal.printSampleCalendar();
		scanner.close();
	}
}