import java.util.Scanner;

public class SpeedConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = Double.parseDouble(scan.nextLine());
        String first = scan.nextLine();
        String second = scan.nextLine();

        if(first.equals("m")){
            if(second.equals("cm")){
                System.out.printf("%.3f", num*100);
            } else if(second.equals("mm"))
            {
                System.out.printf("%.3f", num*1000);
            } else{
                System.out.printf("%.3f", num);
            }
        } else if(first.equals("cm")){
            if(second.equals("m")){
                System.out.printf("%.3f", num/100);
            } else if(second.equals("mm"))
            {
                System.out.printf("%.3f", num*10);
            } else{
                System.out.printf("%.3f", num);
            }

        } else if(first.equals("mm")){
            if(second.equals("m")){
                System.out.printf("%.3f", num/1000);
            } else if(second.equals("cm"))
            {
                System.out.printf("%.3f", num/10);
            } else{
                System.out.printf("%.3f", num);
            }
        }
    }
}
