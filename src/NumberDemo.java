import java.util.Scanner;
public class NumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int a = 0, b = 0, total = 0;
		System.out.print("Number 1: ");
		a = in.nextInt();
		System.out.print("Number 2: ");
		b = in.nextInt();
			
		total = a + b;
		
		System.out.println("Total : " + total);
	}

}
