import java.net.Inet4Address;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for(int i =0; i<=n;i+=2)
        {

            System.out.printf("%.0f\n",Math.pow(2,i));
        }
    }
}
