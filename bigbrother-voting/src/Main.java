import participants.Participant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Participant participant = new Participant();

        byte vote;

        System.out.println(
                        "\nDigite seu voto:" +
                        "\n1. Ana Paula" +
                        "\n2. Babu" +
                        "\n3. Jonas");

        vote = sc.nextByte();

        switch (vote) {
            case 1:
                participant.setParticipantName("Ana Paula");
                System.out.println("\nSeu voto foi confirmado ( Ana Paula )");
                participant.voteFunction();
                break;
            case 2:
                participant.setParticipantName("Babu");
                System.out.println("\nSeu voto foi confirmado ( Babu )");
                participant.voteFunction();
                break;
            case 3:
                participant.setParticipantName("Jonas");
                System.out.println("\nSeu voto foi confirmado ( Jonas )");
                participant.voteFunction();
                break;
        }
    }

}