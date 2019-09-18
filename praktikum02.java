import java.util.Scanner;
public class praktikum02
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double luaslingkaran, jarijari;
		System.out.println("=====Menghitung Luas Lingkaran=====");
		System.out.print("inputkan jari-jari: ");
		jarijari=input.nextInt();
		System.out.println();
		
		luaslingkaran=3.14*jarijari*jarijari;
		System.out.println("luas Lingkaran adalah: "+luaslingkaran);
	}
	
}