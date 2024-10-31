import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        double ntflx, ytprm, drpbx, sptf, total;
        Scanner in = new Scanner (System.in);
        System.out.print("Ingrese el valor a pagar de netflix: ");
        ntflx = in.nextDouble();
        System.out.print("Ingrese el valor a pagar de youtube premium: ");
        ytprm = in.nextDouble();
        System.out.print("Ingrese el valor a pagar de dropbox: ");
        drpbx = in.nextDouble();
        System.out.print("Ingrese el valor a pagar de spotify: ");
        sptf = in.nextDouble();
        total = ntflx + ytprm + drpbx + sptf;
        System.out.println("El total a pagar es de: " + total);
    }
}
