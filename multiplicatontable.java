import java.util.Scanner;
public class multiplicatontable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to display its multiplication table");
        int number = input.nextInt();

        System.out.println("Multiplication table of"+number+":");
        for(int i=1; i<=10; i++){
            System.out.println(number + " x "+ i + " = "+(number*i));
        }
        input.close();
    }
}
