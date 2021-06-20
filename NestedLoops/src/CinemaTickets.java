import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        double space;
        int standardCount;
        int totalStandard = 0;
        int studentCount;
        int totalStudent = 0;
        int kidCount;
        int totalKid = 0;
        double total = 0;
        double totalMovies = 0;

        while(!command.equals("Finish")){
             String movie = command;
             space = Integer.parseInt(scan.nextLine());
             standardCount=0;
             kidCount=0;
             studentCount=0;
             total = 0;
             command = scan.nextLine();
             while(!command.equals("End")) {
                 switch (command){
                     case "standard": standardCount+=1; totalStandard+=1;
                     total+=1;
                         break;
                     case "kid": kidCount+=1; totalKid+=1;
                     total+=1;
                         break;
                     case "student": studentCount+=1; totalStudent+=1;
                     total+=1;
                         break;
                 }
                 if((standardCount+kidCount+studentCount)==space) break;
                 command = scan.nextLine();
             }
             totalMovies+=standardCount+kidCount+studentCount;
             if(command.equals("End")){
                 System.out.print(movie+" - ");
                 System.out.printf("%.2f%%",total/space*100);
                 System.out.print(" full.\n");
             } else if(standardCount+kidCount+studentCount==space){
                 System.out.println(movie+" - 100.00% full.");
             }
            command = scan.nextLine();
        }
        System.out.printf("Total tickets: %.0f\n",totalMovies);
        System.out.printf("%.2f%% student tickets.\n",totalStudent/totalMovies*100);
        System.out.printf("%.2f%% standard tickets.\n",totalStandard/totalMovies*100);
        System.out.printf("%.2f%% kids tickets.",totalKid/totalMovies*100);
    }
}
