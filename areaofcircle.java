import java.util.Scanner;

public class areaofcircle{
    public static void main(String[] args){
        Scanner radiusSc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius = radiusSc.nextDouble();
        double area = Math.PI * radius * radius;
        int typecastedarea = (int) area;
        System.out.println("Area in int is "+typecastedarea+" Area in double is "+area);

    }
}