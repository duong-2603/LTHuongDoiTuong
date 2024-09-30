package bai1;
import java.util.Scanner;
public class bai3 {

	public static void main(String[] args) {
	int a;
	int b;
	Scanner sc= new Scanner(System.in);
	System.out.println("nhap vào a:");
	a=sc.nextInt();
	System.out.println("nhap vào b:");
	b=sc.nextInt();
	System.out.println("tong a+b="+ (a+b));
	System.out.println("hieu a-b="+ (a-b));
	System.out.println("tich a*b="+ (a*b));
	System.out.println("thuong a/b="+ (a*1.0/b));
	System.out.println("phan du a%b="+(a%b));
	}

}
