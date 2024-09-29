import java.util.Scanner;

public class Bai_6 {
	static int i;
	static int [] a = new int [10];
	static Scanner sc;

	static boolean KiemTra( int n)
	{
		i = 1;
		while (n>0)
		{
			a[i++] = n%10;
			n = n/10;
		}
		for (int j=1; j<=i/2; j++)
		{
			if (a[j] == a[i-j+1])
				return true;
		}
		return false;
			
		//System.out.println(+n+" khong la so doi xung");

	}
	public static void main(String[] args) {
		sc = new Scanner (System.in);
		System.out.print("Nhap vao n: ");
		int n = sc.nextInt();
		if(KiemTra(n))
		{
			System.out.println(n+" la so doi xung");
		}
		else
		{
			System.out.println(n+" khong so doi xung");

		}

			

		
	}
}
