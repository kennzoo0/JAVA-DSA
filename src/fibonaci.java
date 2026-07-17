import java.util.*;

// fibonacci series

public class fibonaci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();
        sc.close();
        fibonaci(n);
    }

    public static void fibonaci(int n) {
        int a = 0, b = 1;
        for(int i = 0; i < n; i++){
            System.out.println(a);
            int c = a + b;
        a = b;
        b = c;


    }
    
}
}
