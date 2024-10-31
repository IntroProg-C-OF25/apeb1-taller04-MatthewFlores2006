import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
         double cGPU, cTec, cPant, cRat, cTot;
         Scanner in = new Scanner(System.in);
         System.out.print("Ingrese el costo del GPU: ");
         cGPU = in.nextDouble();
         System.out.print("Ingrese el costo del teclado: ");
         cTec = in.nextDouble();
         System.out.print("Ingrese el costo de la pantalla: ");
         cPant = in.nextDouble();
         System.out.print("Ingrese el costo del Raton: ");
         cRat = in.nextDouble();
         cTot = cGPU + cTec + cPant + cRat;
         System.out.println("El costo total del computador es: " + cTot);
        }
    }
