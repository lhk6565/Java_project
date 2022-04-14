import java.util.Scanner;

public class SwitchToif {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char grade;
		System.out.println("점수를 입력하세요.(0~100)");
		int score = scan.nextInt();
		score = score/10;
		if(score >= 6) {
			if(score >= 9)
				grade = 'A';
			else if(score >= 8)
				grade = 'B';
			else if(score >= 7)
				grade = 'C';
			else
				grade = 'D';
		}
		else
			grade = 'F';
		System.out.println("학점은 "+grade+"입니다.");
		scan.close();

	}

}
