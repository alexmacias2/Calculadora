
package calculadora;
import java.util.Scanner;

public class Calculadora {
    static boolean bueno=false;
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=0;
        int n2=0;
            
         do {    
               try {
            System.out.println("Introduce el primer numero");
            n1=sc.nextInt(); 
            bueno=true;
        } catch (Exception e) {
            System.out.println("Debes introducir un numero");
            bueno=false;
            sc.next();
        }
        } while (!bueno);
         
        do { 
            try {
                System.out.println("Introduce el segundo numero (no puede ser 0)");
                n2=sc.nextInt();
                bueno=true;
            } catch (Exception e) {
                System.out.println("Debes introducir un numero y no puede ser 0");
                bueno=false;
                sc.next();
            }
            
        } while (!bueno||n2==0);
        
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
