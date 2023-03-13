import java.util.Scanner;

public class bmiCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz(72,4): ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Lütfen kilonuzu doğru giriniz");
            return;
        }
        double weight = scanner.nextDouble();

        System.out.println("Boyunuzu giriniz (1,93): ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Lütfen boyunuzu doğru giriniz");
            return;
        }
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("Vücut kitle endeksiniz: " + bmi);
    }
}
