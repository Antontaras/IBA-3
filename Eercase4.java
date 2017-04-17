/*
 Write a program that uses two nested for loops and the modulus operator (%)
  to detect and print prime numbers (integral numbers that are not evenly divisible
   by any other numbers except for themselves and 1).
 */
public class Eercase4{
    public static void main(String ...args) {

        boolean simple = false;

        for(int i = 2; i < 100; i++){
            if(i % 2 ==0) continue;

            for(int j = 2; j < i; j++)
             if(i % j !=0) simple = true;
            else {
                simple = false;
                break;
            }
            if(simple) System.out.println(i + " is prime number.");
        }

    }
}
