import java.util.*;

class conversion {

    public static int conv(int n, int b){

        int ans = 0;
        int p = 1;

        while(n>0) {
            int dig = n%b;
            n=n/b;

            ans = ans + dig*p;
            p = p*10;

        }
        return ans; 
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter the base: ");
        int b = sc.nextInt();

        System.out.print("The converted number is: " + conv(n,b));
    }
    
}
