package accepta16;
import java.util.Scanner;

public class Accepta16 {


    public static void main(String[] args) {
  
         int num;
         double sum,r;
         
         Scanner teclat = new Scanner(System.in);
      
         System.out.print("Ingrese Numero:");
         num = Integer.parseInt(teclat.nextLine());
      
         sum = Math.sqrt(num);
         r = sum;
         
      
         if(r%2 ==0)
         {
            if(sum*sum == num)
            {
               System.out.print("Es cuadrado Perfecto");
            }
         }
         else
         {
            System.out.print("No es");
         }
         
      }   
        
    }

