
import java.util.Scanner;

public class Hello {
     public static void main(String[] args) {

       
        System.out.println("Hello World in new line");
        System.out.print("Hello World\n");
        System.out.println("Hello World in new line");

        String name ="Mehjabin";
        int age = 28;

        int a = 10;
        int b = 20;
        int sum = a + b;
        int diff = b - a;
        System.out.println(sum);
        System.out.println(diff);

        //Input
        Scanner sc = new Scanner(System.in);
        String namem = sc.nextLine();
        System.out.println(namem);
        

    }
}
