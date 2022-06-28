import java.util.Scanner;

public class Loops {
    public static void main(String args[]){ 
        //---For Loop---
            // for(int counter = 0;counter <=5;counter = counter+1)
            // {
            //  System.out.print(counter +" ");
            
            // }
        //---End For Loop---
        
        //---While Loop---
            // int i=0;
            // while(i<11){
            //     System.out.println(i);
            //     i++;
            // }
        //---End While Loop---


        //---Do While  Loop---
            // int i=0;
            // do{
            //     System.out.println(i);
            //     i++;
            // }
            // while(i<11);
        //---End Do While Loop---

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
       
        for(int i=1;i<11;i++){
            System.out.println(n*i);
        }

        



}

}