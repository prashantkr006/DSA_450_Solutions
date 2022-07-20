import java.util.*;
class StringOne {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        peterWon(str);
    }
        static void peterWon (String str) {
            char[] ch= str.toCharArray ();
            int countWin = 0;
            for(int i = 0; i < ch.length; i++) {
                if (ch[i] =='1') {countWin++;}
            }

            if (countWin >= 11) System.out.println("Win");

            else System.out.println("Lose");
        }
}
