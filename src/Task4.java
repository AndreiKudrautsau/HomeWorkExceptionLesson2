import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {

//		anyText = anyText.trim();
		try {
			System.out.println("Введите какой-нибудь текст: ");
			Scanner sc = new Scanner(System.in);
			String anyText = sc.nextLine();
			if (anyText.isEmpty()){
				throw new RuntimeException();
			}
			System.out.println("Вы ввели текст: " + anyText);
		} catch (RuntimeException e){
			System.err.println("Пустые строки вводить нельзя!");
		}

	}
}
