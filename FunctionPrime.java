import java.util.Scanner;

public class FunctionPrime {

    public static boolean funPrime( int num){
        int temp;
        boolean isPrime=true;

        for(int i=2;i<=num/2;i++)
        {
               temp=num%i;
           if(temp==0)
           {
              isPrime=false;
              break;
           }
        }

        if(isPrime)
        System.out.println(num + " is a Prime Number");
     else
        System.out.println(num + " is not a Prime Number");
        
        return isPrime;
    }


    public static void main(String[] args) {
        

        
        Scanner scan= new Scanner(System.in);
        int num=scan.nextInt();
            
        
        funPrime(num);
       



    }
    
}
