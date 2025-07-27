package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesi prvi broj: ");
        double broj1 = scanner.nextDouble();

        System.out.print("Unesi operaciju (+, -, *, /): ");
        char operacija = scanner.next().charAt(0);

        System.out.print("Unesi drugi broj: ");
        double broj2 = scanner.nextDouble();

        double rezultat;

        switch (operacija) {
            case '+':
                rezultat = broj1 + broj2;
                break;
            case '-':
                rezultat = broj1 - broj2;
                break;
            case '*':
                rezultat = broj1 * broj2;
                break;
            case '/':
                if (broj2 != 0) {
                    rezultat = broj1 / broj2;
                } else {
                    System.out.println("Greška: Deljenje nulom nije dozvoljeno.");
                    return;
                }
                break;
            default:
                System.out.println("Nepoznata operacija.");
                return;
        }

        System.out.println("Rezultat: " + rezultat);
    }
}


