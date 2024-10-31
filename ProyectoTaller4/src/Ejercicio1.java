import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        //Declaración de datos o cariables
        double area, base, altura;
       Scanner in1 = new Scanner(System.in);
       //Ingreso de datos de entrada
        System.out.print("ingrese la base: "); 
       base = in1.nextDouble();
        System.out.print("ingrese la altura: ");
       altura = in1.nextDouble();
       //procesamiento de datos de entrada
       area = (base * altura) / 2;
       //presentación de datos de salida
        System.out.println("El area del triangulo es: " + area);
    }
}
