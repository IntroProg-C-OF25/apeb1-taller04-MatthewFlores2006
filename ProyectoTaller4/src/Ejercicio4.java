import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {   
        double cantmin, costmin, costplan;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de minutos: ");
        cantmin = in.nextDouble();
        System.out.print("Ingrese el costo por minuto: ");
        costmin = in.nextDouble();
        costplan = cantmin * costmin;
        System.out.println("La cantidad a pagar de la planilla será: " + costplan);            
        }

}
