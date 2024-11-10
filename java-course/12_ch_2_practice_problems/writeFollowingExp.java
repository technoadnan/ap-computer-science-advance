import java.lang.Math;
import java.util.Scanner;
public class writeFollowingExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v,u,a,s;
        v = sc.nextInt();
        u = sc.nextInt();
        a = sc.nextInt();
        s = sc.nextInt();
        double equation = (Math.pow(v,2) - Math.pow(u,2)) / 2*a*s;
        System.out.println(equation);

    }
}
