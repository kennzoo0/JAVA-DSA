import java.util.*;

// frequency of a number

public class frequency {

    public static int freq(long n, int d) {
        int ans = 0;

        while(n > 0) {
            long dig = n%10;
            n = n/10;
            if(dig == d) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long n = sc.nextLong();
        System.out.print("Enter the digit to find frequency: ");
        int d = sc.nextInt();

        System.out.print("Frequency of " + d + " in " + n + " is: " + freq(n,d));
    }
    
}
