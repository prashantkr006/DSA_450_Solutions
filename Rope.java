import java.util.Scanner;

class Rope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int Length=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(a>=2 || a<=100){
            Length=Length+a;}
        }
        sc.close();
       Length =Length -(n-1)*(2*k);
       System.out.println(Length);
    }
}
