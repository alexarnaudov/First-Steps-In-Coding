import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double dancers = Double.parseDouble(scan.nextLine());
        double points = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String place = scan.nextLine();

        double sum = dancers*points;
        if (place.equals("Abroad")){
            sum+=sum*0.5;
            if(season.equals("summer"))
            {
                sum-=sum*0.1;
            }else if(season.equals("winter"))
            {
                sum-=sum*0.15;
            }
        } else if (place.equals("Bulgaria"))
        {
            if(season.equals("summer"))
            {
                sum-=sum*0.05;
            }else if(season.equals("winter"))
            {
                sum-=sum*0.08;
            }
        }

        System.out.printf("Charity - %.2f\n", sum*0.75);
        sum-=sum*0.75;
        System.out.printf("Money per dancer - %.2f", sum/dancers);
    }
}
