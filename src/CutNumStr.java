import java.util.Scanner;

public class CutNumStr
{
	public static void main(String[] args) 
	{
		System.out.println("please enter the string");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();

		System.out.println(str1.replaceAll("\\d+", ""));
		System.out.println(str1.replaceAll("\\D+", ""));

	}
}
