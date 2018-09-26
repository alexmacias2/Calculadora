
package calculadora;
import java.util.Scanner;

public class Calculadora {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce dos numeros");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("La suma de tus dos numeros "+n1+" + "+n2+" es: "+suma(n1, n2));
        System.out.println("La resta de tus dos numeros "+n1+" - "+n2+" es: "+resta(n1, n2));
        System.out.println("La multiplicacion de tus dos numeros "+n1+" * "+n2+" es: "+multiplicacio(n1, n2));
        System.out.println("La division de tus dos numeros "+n1+" / "+n2+" es: "+divisio(n1, n2));
    }
    
    public  static int suma(int numero1,int numero2){
        return numero1+numero2;
    }
    
    public  static int resta(int numero1,int numero2){
        return numero1-numero2;
    }
    
    public  static int multiplicacio(int numero1,int numero2){
        return numero1*numero2;
    }
    
    public  static int divisio(int numero1,int numero2){
        return numero1/numero2;
    }
    
    
    
    
}
