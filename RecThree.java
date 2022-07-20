import java.util.*;
class RecThree {
    static int isReachable(int x1, int y1, int x2, int y2) {

        int x=isReachable(x1,x1+y1,x2, y2);

        int y=isReachable(x1+y1, y1,x2, y2);

        if(y1==y2 || x1==x2) return 1;

        else if(y1== y2 || x1>x2) return 0;

        if(x==1 || y==1) return 1;
        else return 0;
    }
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        int x1=sc.nextInt();

        int y1=sc.nextInt();

        int x2=sc.nextInt ();

        int y2=sc.nextInt ();

        System.out.println(isReachable(x1,y1,x2,y2)==1?"True":"False");

    }

}
