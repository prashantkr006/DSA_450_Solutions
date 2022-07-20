import javax.swing.*;
import java.net.SocketOption;
import java.util.Scanner;

class Range {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int low =sc.nextInt();
        int high =sc.nextInt();
        sc.close();
        int count =0;
        for(int i=low;i<=high;i++){
            int divisor=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    divisor++;
                }
            }
            if(divisor==4){
                count++;
            }
        }
        System.out.println(count);

    }
}
