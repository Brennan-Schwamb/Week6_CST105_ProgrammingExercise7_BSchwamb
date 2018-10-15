import java.util.*;
import java.util.Formatter;
public class PrimePalindromeChecker 
{
    public static void main (String[] args)  {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter a value:");
        //int n =scanner.nextInt();
        int n = 100000;
        for(int i=2;i<=n;i++){
            //comparing both methods to find numbers that are both prime and palindrome
        	if (prime(i) && pal(i)) {
                System.out.println(i);                         
        }
        }
    }
    //method to find prime numbers
    public static boolean prime(int n) { 
        int x = 2;
        while (n%x>0) {
            x+=1;
        } 
        if (x==n) {
               return true;
        } 
        else {
               return false;
        }
    }
   //method to find palindromes
    public static boolean pal(int n) { 
       int rev = 0;
       int rmd = 0;
       int temp = n;
       while (n>0) {
                rmd = n%10;
                rev = rev*10 + rmd;
                n = n/10;
       }
       if (rev==temp){
               return true;
       }
       else{
      
    	       return false;
      }
   }
}