
import java.util.*;

class Patern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int k =(2*n)-1;

        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
              if(i== n-1 || i+j== n-1 || j-1 ==n-1){System.out.println("*");}
              else if(i+j<n-1 || j-i>n-1){System.out.println("b");}
              else{System.out.println("i");}
            }
            System.out.println();
        }
    }
}
