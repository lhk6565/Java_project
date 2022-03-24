import java.util.Scanner;

public class AboutMe {

	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 통학 여부를 빈칸으로 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.print("이름은 " + name + ", ");
		
		String city = scanner.next();
		System.out.print("도시는 " + city + ", ");
		
		int age = scanner.nextInt();
		System.out.print("나이는 " + age + "살, ");
				
		double weight = scanner.nextDouble();
		System.out.print("체중은 " + weight + "kg, ");
		
		boolean commute = scanner.nextBoolean();
		System.out.print("통학여부는 " + commute + "입니다.");
		
		scanner.close();

	}

}
