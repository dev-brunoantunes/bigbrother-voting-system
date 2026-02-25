import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte vote;

        System.out.println(
                        "\nDigite seu voto:" +
                        "\n1. Ana Paula" +
                        "\n2. Babu" +
                        "\n3. Jonas");

        vote = sc.nextByte();

        switch (vote) {
            case 1:
                System.out.println("\nSeu voto foi confirmado ( Ana Paula )");
                break;
            case 2:
                System.out.println("\nSeu voto foi confirmado ( Babu )");
                break;
            case 3:
                System.out.println("\nSeu voto foi confirmado ( Jonas )");
                break;
        }
    }

}