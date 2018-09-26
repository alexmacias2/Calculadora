
package calculadora;
import java.util.Scanner;

public class Calculadora {
 
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce dos numeros");
        int numero1=sc.nextInt();
        int numero2=sc.nextInt();
        System.out.println("La suma de tus dos numero "+numero1+" + "+numero2+" es: "+suma(numero1, numero2));
        System.out.println("La resta de tus dos numero "+numero1+" - "+numero2+" es: "+resta(numero1, numero2));
    }
    
    public  static int suma(int numero1,int numero2){
        return numero1+numero2;
    }
    
    public  static int resta(int numero1,int numero2){
        return numero1-numero2;
    }
    
    
    
}
