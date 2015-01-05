ProjectEuler
============

problem1
// Problem 1 Find the sum of all the multiples of 3 or 5 below 1000//   
public class ProjectEuler   {
            public static void main(String[] args) {
                int sum =0; 
                for (int i=1; i <1000;i++) {
                    if (i%3==0 || i%5==0){
                        sum += i;
                    }                   
                }
                        System.out.println("The answer is"+ " "+sum);
    }    
}
