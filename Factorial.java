public class Factorial
//��дһ��Java��������Ļ�����1!+2!+3!+4!+5!+6!+7!+8!+9!+10!�ĺ͡�
{
	public static void main(String[] args) 
	{
		int sum = 0;

		for (int i = 1; i <= 10; i++)
		{
			int fac = 1;
			for (int j = 1; j <= i; j++)
			{
				fac = fac * j;
			}
			sum = sum + fac;
		}

		System.out.println("1! + 2! + 3! + 4! + 5! + 6! + 7! + 8! + 9! + 10! = " + sum);
	}
}