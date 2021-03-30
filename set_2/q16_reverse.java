import java.util.*;
class q16_reverse{
  public static void main(String[] args) {

    int num, reversed = 0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number: " );
num=sc.nextInt();
    while(num != 0) {
    
      int digit = num % 10;
        reversed = reversed * 10 + digit;
        num /= 10;
    }

    System.out.println("Reversed Number: " + reversed);
  }
}