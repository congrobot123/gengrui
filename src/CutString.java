import java.util.Scanner;

public class CutString 
{
	public static void main(String[] args) 
	{
		System.out.println("ÇëÊäÈë´ø½ØÈ¡×Ö·û´®");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();

		System.out.println(str1.substring(2,4));
		System.out.println(str1.charAt(1));
		System.out.println(str1.charAt(5));
	}
}
