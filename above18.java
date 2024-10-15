import java.util.Scanner;

public class above18 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age :");
        int age = sc.nextInt();
        if ( age >= 18){
            System.out.println("Your are eligible to vote");
        }else{
            System.out.println("You are not eligble to vote");
        }
    }
}
