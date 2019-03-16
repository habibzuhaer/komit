import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[]args) {
        Scanner k = new Scanner(System.in);

        System.out.println("Color ?");
        String color = k.nextLine();


        System.out.println("Price?");
        int price = k.nextInt();

        System.out.println("Drzwi?");
        int drzwi = k.nextInt();


        System.out.println("Marka?");
        String marka = k.next();


        System.out.println("Rok ?");
        int rok = k.nextInt();

       // ArrayList.class
           // ArrayList.class
           // ArrayList.class   

        Car car = new Car();
        car.getColor();
        car.getDrzwi();
        car.getMarka();
        car.getPrice();
        car.getRok();



    }

}
