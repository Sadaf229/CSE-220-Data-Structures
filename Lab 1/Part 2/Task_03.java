import java.util.Scanner;
public class Task_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, n = sc.nextInt();
		
		try {
			int a[] = new int[n];
			a[5] = 99;
			x = n / 0;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("BackUP");
		}
		catch (ArithmeticException e){
			System.out.println("Error");
		}
		finally{
			System.out.println("THE END!");
		}
		
		
		sc.close();
	}
}
