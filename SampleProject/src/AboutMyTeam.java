import java.util.Scanner;

public class AboutMyTeam {

	public static void main(String[] args) {
		System.out.println("팀명, 팀장, 조원, 팀원수, 통학 여부를 빈칸으로 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		
		String teamname = scanner.next();
		System.out.print("팀명은 " + teamname + ", ");
		
		String name = scanner.next();
		System.out.print("팀장은 " + name + ", ");
		
		String name2 = scanner.next();
		System.out.print("조원은 " + name2 + "이고, ");
		
		int member = scanner.nextInt();
		System.out.print("팀원수는 " + member + "명, ");
		
		boolean commute = scanner.nextBoolean();
		System.out.print("통학 여부는 모두 " + commute + "입니다.");
		
		scanner.close();

	}

}
