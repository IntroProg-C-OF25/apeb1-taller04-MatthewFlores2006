import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        double costphora, kvpmes, costTot;
         Scanner in = new Scanner(System.in);
         System.out.print("Ingrese el costo de kilovatios por hora: ");
         costphora = in.nextDouble();
         System.out.println("Ingrese los kilovatios consumidos en el mes: ");
         kvpmes = in.nextDouble();
         costTot = (costphora * kvpmes);
         System.out.println("El costo total a pagar en un mes sera: " + costTot);
    }
}
