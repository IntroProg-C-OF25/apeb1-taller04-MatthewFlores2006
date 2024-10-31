import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        double Lcuad, Lfigura, Acuad, Atri, Arec, Atot;
        Scanner in = new Scanner(System.in);
         System.out.print("Ingrese la longitud de los lados del cuadrado: ");
        Lcuad= in.nextDouble();
        System.out.print("Ingrese la altura de los triangulos: ");
        Lfigura = in.nextDouble();
        Acuad = Lcuad * Lcuad;
        Atri = (Lfigura * Lcuad / 2) * 3;
        Arec = (Lfigura * Lcuad);
        Atot = Acuad + Atri + Arec;
        System.out.println("El area total del poligono es: " + Atot);
                }
}
