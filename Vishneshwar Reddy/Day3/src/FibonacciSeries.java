import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		int num1=0, num2=1, num3, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to perform fibonacci series: ");
		int fibNum = sc.nextInt();
		System.out.print(num1 + " " + num2);
		for(i=2;i<fibNum;++i){
			num3 = num1 + num2;
			System.out.print(" "+num3);
			num1 = num2;
			num2 = num3;
		}
		sc.close();
	}

}
