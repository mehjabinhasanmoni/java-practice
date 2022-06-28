import java.util.Scanner;

public class Condition {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        // if(button == 1){
        //     System.out.println("Hello");
        
        // }else if (button == 2){
        //     System.out.println("Hi");
        // }else if(button ==3){
        //     System.out.println("Good");
        
        // }
        // else{
        //     System.out.println("invaild");
        // }


            switch(button){
                case 1:System.out.println("Hi");
                break;
                case 2:System.out.println("Hello");
                break;
                case 3:System.out.println("Good");
                break;
                default:System.out.println("Invaild");

            }

        }



    }
    

 