import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado?");
        var isEmancipated = scanner.nextBoolean();
        var canDrive = age >= 18 || isEmancipated;
        System.out.printf("Você pode dirigir? (%s) \n", canDrive);
    }
}