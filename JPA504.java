import java.util.Scanner;

public class JPA504 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input the number :");
        int m = scn.nextInt();
        System.out.println("Ans:" + sum2(m));
        scn.close();
    }
    static int sum2(int m){
        int sum = 0;
        if (m == 1)
            return 2;
        else{
            sum += sum2(m - 1) + 2 * m;
            return sum;
        }
    }

    
}
