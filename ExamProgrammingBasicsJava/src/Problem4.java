import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int salesPossible;
        double salesMade = 0;
        int rating;
        double ratingAverage = 0;

        for(int i = 0;i<n;i++)
        {
            int next = Integer.parseInt(scan.nextLine());
            String s=next+""; // Puts `+` into concatenation mode.
            rating = next%10;
            salesPossible = Integer.parseInt(s.charAt(0)+""+s.charAt(1));
            switch (rating)
            {
                case 2:
                    salesMade+=0;
                    break;
                case 3:
                    salesMade+=salesPossible*0.5;
                    break;
                case 4:
                    salesMade+=salesPossible*0.7;
                    break;
                case 5:
                    salesMade+=salesPossible*0.85;
                    break;
                case 6:
                    salesMade+=salesPossible;
                    break;
                default:
                    break;
            }
            ratingAverage+=rating;

        }

        System.out.printf("%.2f\n",salesMade);
        System.out.printf("%.2f",ratingAverage/n);

    }
}
