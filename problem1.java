ProjectEuler
============

problem1
/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
The sum of these multiples is 23
Problem 1 Find the sum of all the multiples of 3 or 5 below 1000*/   
public class ProjectEuler   {
 public static void main (String args[]) {
System.out.println("All the natural numbers below 10 that are multiples of 3 or 5:");	
int sum=0;
		for(int j=0;j<1000;j++) {
			if(j%3==0 || j%5==0) {	
				sum=sum+j;
System.out.println(j);
			}
		}		
System.out.println("Sum of these multiples:"+sum);
	}
	 }
           
