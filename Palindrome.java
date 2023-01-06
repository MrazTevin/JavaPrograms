import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int n = value.nextInt();
        int copy = n;
        int r=0,d=0;

        while(n>0)
        {
            d = n % 10;
            r = 10*r+d;
            n=n/10;
        }
        if (r==copy)
        { 
            System.out.println(copy+ " is a palindrome number");
        } 
        else {
            System.out.println(copy+ " is not a palindrome number");
        }
    }
}
