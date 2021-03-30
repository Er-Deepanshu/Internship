//Take a 4 digit number. Write a program to display a number whose digits are 2 greater than the corresponding digits of the number TAKEN.
//For example, if the number which was taken is 5696, then the displayed number should be 7818

import java.util.*;
class q14
{
public static void main(String agr[]){
   int n,a,b, c, d, sum,rev=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    a = (n/1000);    

    if (a==8){
       a=0;
}
    else if(a==9)
    {
     a=1;
    }
    else
    {
        a=a+2;
    }
    n = n%1000;
    b = (n/100);  
    if (b==8)
    {
     b=0;
   }

    else if(b==9)
    {
     b=1;
    }
    else
    {
     b=b+2;
    }
    n = n%100;
    c = (n/10);  
    if (c==8)
    {
        c=0;
    }
    else if(c==9)
    {
     c=1;
    }
    else
    {
      c=c+2;
    }
    d = (n%10);       
    if (d==8)
    {
       d=0;
    }
    else if(d==9)
    {
     d=1;
    }
    else
    {
      d=d+2;
    }
  rev=((a*1000)+(b*100)+(c*10)+(d));
    System.out.println(rev);    
}
}