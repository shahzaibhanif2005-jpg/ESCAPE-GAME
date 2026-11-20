import java.util.Scanner;

public class Escape {
  public static int playerCoin = 50;

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your name:");
    String name = input.nextLine();

    System.out.println("Welcome, " + name + "!");
    int playerHealth = 100;
    int playerAttack = 20;
    int enemyHealth = 40;
    int enemyAttack = 15;

    System.out.println("Your health = " + playerHealth);
    System.out.println("Enemy name = ali..");
    System.out.println("Enemy health = " + enemyHealth);

    while (enemyHealth > 0 && playerHealth > 0) {
      System.out.println("Enemy is in front of you. What do you want to do?");
      System.out.println("1: attack\n2: run away");
      int choice = input.nextInt();

      if (choice == 1) {
        System.out.println("You attacked the enemy.");
        enemyHealth -= playerAttack;
        System.out.println("Your coins = " + playerCoin);
        System.out.println("Enemy health = " + enemyHealth);

        if (enemyHealth > 0) {
          System.out.println("The enemy attacked you.");
          playerHealth -= enemyAttack;
          System.out.println("Your health = " + playerHealth);
        }
      } else if (choice == 2) {
        System.out.println("You ran away from the enemy. You lost.");
        break;
      } else {
        System.out.println("Invalid choice.");
      }
    }

    if (enemyHealth <= 0) {
      System.out.println("You defeated the enemy!");
    } else if (playerHealth <= 0) {
      System.out.println("You lost!");
    }

    input.close();
  }
}
