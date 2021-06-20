import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int goals;
        String topName = name;
        boolean trick = false;
        int topGoals = 0;

        while(!name.equals("END"))
        {
            goals=Integer.parseInt(scan.nextLine());
            if(goals>=10)
            {
                topGoals=goals;
                topName=name;
                trick=true;
                break;
            } else if(goals>topGoals)
            {
                if(goals>=3) trick=true;
                topGoals=goals;
                topName=name;
                name=scan.nextLine();
            } else
            {
                name=scan.nextLine();
            }

        }

        System.out.println(topName+" is the best player!");
        if(trick)
        {
            System.out.printf("He has scored %d goals and made a hat-trick !!!",topGoals);
        }
        else {
            System.out.printf("He has scored %d goals.",topGoals);

        }

    }
}
