import java.util.Scanner;
public class ex2{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your grade");
        int grade = scan.nextInt();
        if ((grade>=0)&&(grade<=100));{

            if (grade>=40) System.out.println("Congratulations");
            else System.out.println("I am sorry but you failed");}

        else {
            System.out.println("Please enter a number from 0-100");
            int grade = scan.nextInt;}
        } 
    }