import java.util.Scanner;

public class VacationBookList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());
        int pagesHours = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());

        System.out.printf("%d",count/pagesHours/days);
    }
}
