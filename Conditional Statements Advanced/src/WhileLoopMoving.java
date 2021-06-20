import java.util.Scanner;

public class WhileLoopMoving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        int depth = Integer.parseInt(scan.nextLine());
        int size = width*height*depth;
        String input = scan.next();
        int sum = 0;
        while(!input.equals("Done")){
            int next = Integer.parseInt(input);
            sum+=next;
            if(sum>size) {
                System.out.printf("No more free space! You need %d Cubic meters more.",sum-size);
                break;
            }
            input = scan.next();
            if(input.equals("Done")) System.out.printf("%d Cubic meters left.",size-sum);
        }

    }
}
