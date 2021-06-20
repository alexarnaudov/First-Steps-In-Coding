import java.util.Scanner;

public class AreasFigures {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();

        switch (type) {
            case "square": {
                double side = Double.parseDouble(scan.nextLine());
                System.out.println(side * side);
            }
            case "rectangle": {
                double side = Double.parseDouble(scan.nextLine());
                double side2 = Double.parseDouble(scan.nextLine());
                System.out.println(side * side2);
            }
            case "circle": {
                double side = Double.parseDouble(scan.nextLine());
                System.out.println(side * side * Math.PI);
            }
            case "triangle": {
                double side = Double.parseDouble(scan.nextLine());
                double side2 = Double.parseDouble(scan.nextLine());
                System.out.println(side * side2 / 2);
            }
        }

    }
}
