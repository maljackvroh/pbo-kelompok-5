package percobaan_7.acc;

import java.util.Scanner;

public class acc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Username Anda: ");
        String username = scanner.next();
        human player = new human(username, 50, 50);
        while (true) {
            System.out.println("\n1. Menu Select Class");
            System.out.println("2. Menu Status");
            System.out.println("3. Menu Attack");
            System.out.println("4. Menu Walk");
            System.out.println("5. Menu Jump");
            System.out.println("6. Menu Exit");
            System.out.print("Masukkan pilihan Anda: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Human");
                    System.out.println("2. SwordMan");
                    System.out.println("3. Archer");
                    System.out.println("Masukkan pilihan class Anda: ");
                    int classChoice = scanner.nextInt();
                    if (classChoice == 1) {
                        player = new human(username, 50, 50);
                    } else if (classChoice == 2) {
                        player = new swordman(username, 75, 150);
                    } else if (classChoice == 3) {
                        player = new archer(username, 150, 100);
                    }
                    break;
                case 2:
                    player.getStatus();
                    break;
                case 3:
                    player.attack();
                    break;
                case 4:
                    player.walk();
                    break;
                case 5:
                    player.jump();
                    break;
                case 6:
                    System.out.println("Terima kasih telah bermain!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
    }
}

