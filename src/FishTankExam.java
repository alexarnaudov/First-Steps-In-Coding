import java.util.Scanner;

public class FishTankExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      double depth = Double.parseDouble(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        System.out.printf("%.2f", (depth*width*height*0.001)*(1-percent*0.01));
    }
}
