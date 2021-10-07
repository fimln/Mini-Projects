package github.fimln.kalkulator;
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        double angka1, angka2;

        // Input dari user
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan angka");

        // Proses input
        System.out.print("Angka 1 = ");
        angka1 = scan.nextDouble();
        System.out.print("Angka 2 = ");
        angka2 = scan.nextDouble();

        // Memasukkan operator artitmatika
        System.out.print("Masukkan operator perhitungan : ");
        char operator = scan.next().charAt(0);

        // Proses hitung
        double hasil = 0;
        switch (operator) {
            case '+' :
                hasil = angka1 + angka2;
                break;
            case '-' :
                hasil = angka1 - angka2;
                break;
            case '*' :
                hasil = angka1 * angka2;
                break;
            case '/' :
                hasil = angka1 / angka2;
                break;
        }
    System.out.println("Hasilnya adalah");
    System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
    }
}
