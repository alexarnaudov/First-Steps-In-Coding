import java.util.Scanner;

public class TimePlus15Mins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        int minute = Integer.parseInt(scan.nextLine());

        if((minute+15)>=60){

            hour++;

            if(hour==24)
            {

                    hour = 0;
            }
            if((minute+15)==60)
            {
                minute=0;
            }
            else{
                minute = minute-45;
            }
            System.out.printf("%d:%02d",hour,minute);


        }else
        {
            minute+=15;
            System.out.printf("%d:%02d",hour,minute);
        }
    }
}
