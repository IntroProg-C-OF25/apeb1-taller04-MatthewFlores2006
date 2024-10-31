import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        double hijo1, hijo2, hijo3, gastoT;
        Scanner in = new Scanner (System.in);
        System.out.print("ingrese los gastos del primer hijo: ");
        hijo1 = in.nextDouble();
        System.out.print("ingrese los gastos del segundo hijo: ");
        hijo2 = in.nextDouble();
        System.out.print("ingrese los gastos del tercer hijo: ");
        hijo3 = in.nextDouble();
        gastoT = hijo1 + hijo2 + hijo3;
        System.out.println("los gastos totales son: " + gastoT);
    }
}
