
//The total number of students in a class are 90 out of which 45 are boys. If 50% of the total students secured grade 'A' out of which 20 are boys, then write a program to calculate the total number of girls getting grade 'A'.

import java.util.*;
class q12{
	public static void main(String arg[]){
	int total=90;
	int boys=45;
	int girls =total-boys;
	int A_grade=(90*50)/100;
	int A_grade_girls=A_grade-20;
	System.out.println("A grade girls are = "+A_grade_girls);
	
	}
}