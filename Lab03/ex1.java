import java.util.Scanner;
public class ex1
{
    public static void main(String[]args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer variable");
        int num = scan.nextInt();
        if (num % 2 == 0){
                      System.out.println("The integer is even");
        }
        else{
                      System.out.println("The integer is odd");
        }
    }
}