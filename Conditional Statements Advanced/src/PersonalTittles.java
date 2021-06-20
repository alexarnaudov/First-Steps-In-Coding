import java.util.Scanner;

public class PersonalTittles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        days-=1;
        String type = scan.nextLine();
        String grade = scan.nextLine();
        double finalPrice;
        if(days<10)
        {
           switch (type)
           {
               case "room for one person":
                   finalPrice=days*18;
                   if(grade.equals("positive"))
                   {
                       System.out.printf("%.2f",finalPrice+finalPrice*0.25);
                   }else if(grade.equals("negative"))
                   {
                       System.out.printf("%.2f",finalPrice-finalPrice*0.1);
                   }
                   break;
               case "apartment":
                   finalPrice=days*25;
                   finalPrice = finalPrice - finalPrice*0.30;
                   if(grade.equals("positive"))
                   {
                       System.out.printf("%.2f",finalPrice+finalPrice*0.25);
                   }else if(grade.equals("negative"))
                   {
                       System.out.printf("%.2f",finalPrice-finalPrice*0.1);
                   }
                    break;
               case "president apartment":
                   finalPrice=days*35;
                   finalPrice = finalPrice - finalPrice*0.10;
                   if(grade.equals("positive"))
                   {
                       System.out.printf("%.2f",finalPrice+finalPrice*0.25);
                   }else if(grade.equals("negative"))
                   {
                       System.out.printf("%.2f",finalPrice-finalPrice*0.1);
                   }
                   break;
               default:
                   break;
           }
        }else if(days<=15)
        {
            switch (type)
            {
                case "room for one person":
                    finalPrice=days*18;
                    if(grade.equals("positive"))
                    {
                        System.out.printf("%.2f",finalPrice+finalPrice*0.25);
                    }else if(grade.equals("negative"))
                    {
                        System.out.printf("%.2f",finalPrice-finalPrice*0.1);
                    }
                    break;
                case "apartment":
                    finalPrice=days*25;
                    finalPrice = finalPrice - finalPrice*0.35;
                    if(grade.equals("positive"))
                    {
                        System.out.printf("%.2f",finalPrice+finalPrice*0.25);
                    }else if(grade.equals("negative"))
                    {
                        System.out.printf("%.2f",finalPrice-finalPrice*0.1);
                    }
                    break;
                case "president apartment":
                    finalPrice=days*35;
                    finalPrice = finalPrice - finalPrice*0.15;
                    if(grade.equals("positive"))
                    {
                        System.out.printf("%.2f",finalPrice+finalPrice*0.25);
                    }else if(grade.equals("negative"))
                    {
                        System.out.printf("%.2f",finalPrice-finalPrice*0.1);
                    }
                    break;
                default:
                    break;
            }
        }else {
            switch (type)
            {
                case "room for one person":
                    finalPrice=days*18;
                    if(grade.equals("positive"))
                    {
                        System.out.printf("%.2f",finalPrice+finalPrice*0.25);
                    }else if(grade.equals("negative"))
                    {
                        System.out.printf("%.2f",finalPrice-finalPrice*0.1);
                    }
                    break;
                case "apartment":
                    finalPrice=days*25;
                    finalPrice = finalPrice - finalPrice*0.50;
                    if(grade.equals("positive"))
                    {
                        System.out.printf("%.2f",finalPrice+finalPrice*0.25);
                    }else if(grade.equals("negative"))
                    {
                        System.out.printf("%.2f",finalPrice-finalPrice*0.1);
                    }
                    break;
                case "president apartment":
                    finalPrice=days*35;
                    finalPrice = finalPrice - finalPrice*0.20;
                    if(grade.equals("positive"))
                    {
                        System.out.printf("%.2f",finalPrice+finalPrice*0.25);
                    }else if(grade.equals("negative"))
                    {
                        System.out.printf("%.2f",finalPrice-finalPrice*0.1);
                    }
                    break;
                default:
                    break;
            }
        }

            }
}
