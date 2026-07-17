import java.util.*;

public class rotate {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int temp = n;
        int nod = 0;

        while(temp >0){
            temp = temp/10;
            nod++;
        }

        int div = 1;
        int mult = 1;

        for(int i = 1; i <= nod; i++){
            if(i <= k){
                div = div * 10;
            }else{
                mult = mult * 10;
            }
        }

        k = k % nod;
        if(k < 0){
            k = k + nod;
        }

        int q = n / div;
        int rem = n % div;
        int res = rem * mult + q;
        System.out.print(res);

    }
    
}
