package bai1;
import java.util.Scanner;
public class bai4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double lai;
		double tiengui;
		int thanggui;
		System.out.println("nhap vào so tien lai xuat:");
		lai=sc.nextDouble();
		System.out.println("nhap vao so tien gui:");
		tiengui=sc.nextDouble();
		System.out.println("nhap vao so thang gui:");
		thanggui=sc.nextInt();
		double tienlai=((tiengui*thanggui)*(lai/12));
		System.out.println("tienlai="+ tienlai);
		double tiengoccuoiky=tiengui+tienlai;
		System.out.println("tien goc cuoi ki là :"+ tiengoccuoiky);
	}

}
