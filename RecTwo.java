import java.util.*;
class RecTwo {
    static int summation (int n, int m) {
        if(m==0)
            return n;
        int sum=0;
        for(int i=1;i<=n;i++) {
            sum += i;
            n = sum;
          }
        return summation(n,m-1);

    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt ();
        int m=sc.nextInt ();
        System.out.println(summation(n,m));}
}
