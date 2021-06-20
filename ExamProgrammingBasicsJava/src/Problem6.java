import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int K = Integer.parseInt(scan.nextLine());
        int L = Integer.parseInt(scan.nextLine());
        int M = Integer.parseInt(scan.nextLine());
        int N = Integer.parseInt(scan.nextLine());
          int count = 0;
        //първия номер
        for(int i = K;i<=8;i++){ // първото число от първия номер в интервала [0..8]
            for(int j = 9;j>=L;j--) { //второто число от първия номер в интервала [9..0]

                for(int o=M;o<=8;o++){ //първото число от втория номер в интервала [0..8]
                    for(int p = 9;p>=N;p--)//второто число от втория номер в интервала [9..0]{
                        if((i%2==0)&&(o%2==0)&&(j%2==1)&&(p%2==1)){ //проверка четно||нечетно
                            if(count==6) break;
                            if((i==o)&&(j==p)){ //проверка еднакви числа
                                System.out.println("Cannot change the same player.");
                            } else{
                                System.out.println(i+""+j+" - "+o+p);
                                count++;
                            }

                        }

                }
                if(count==6) break;
            }
        }

        //втория номер

    }
}
