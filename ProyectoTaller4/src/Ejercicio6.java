import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        double montPrest, intrMens, costTot;
        Scanner in = new Scanner (System.in);
        System.out.print("Ingrese el monto del prestamo: ");
        montPrest = in.nextDouble();
        System.out.print("Ingrese el interes mensual: ");
        intrMens = in.nextDouble();
        costTot = montPrest * intrMens;
        System.out.println("El valor a pagar sera: "+ costTot);
    }
}
