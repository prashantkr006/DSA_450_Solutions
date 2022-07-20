import java.util.Scanner;
class RecOne {
    static int reverse(int num) {

        if (num == 0) return 0;

        int count =String.valueOf(num).length();
        int d = (int) Math.pow(10, count - 1);

        int rev = reverse(num % d) * 10 + (num / d);
        return rev;

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(reverse(n));

    }
}
