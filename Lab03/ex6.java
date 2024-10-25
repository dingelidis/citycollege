import java.util.Scanner;
public class ex6{
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter assignment grade");
        int agrade = scan.nextInt();
        System.out.println("Enter final exam grade");
        int bgrade = scan.nextInt();
        double modulegrade = ((agrade*0.4)+(bgrade*0.6));
        System.out.println("Your final grade is: "+ modulegrade);



    }
}