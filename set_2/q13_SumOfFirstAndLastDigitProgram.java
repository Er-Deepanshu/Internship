import java.util.Scanner;

public class q13_SumOfFirstAndLastDigitProgram
{
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.print("Enter an integer number:: ");
		int number = scan.nextInt();
		int lastDigit, firstDigit, divisor;
		int totalDigits = 0;
		int sum = 0;
		lastDigit = number%10;
		int count = 0;
		int  temp=number;
		while(temp!=0) {
			count++;
			temp = temp/10;
		}
		divisor = (int)Math.pow(10, count-1);
		firstDigit = number / divisor;
		sum = firstDigit + lastDigit;
		System.out.println("The sum of first & last"+" digit of the number "+number+" = "+ sum);
		scan.close();
	}
}