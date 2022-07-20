import java.util.Scanner;
public class StringFour {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println (paintBalloons (str));

    }

    static int paintBalloons (String str) {
        int a = 0, b = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a') a++;
            else b++;

    }

        return Math.min(a,b);
    }
}
