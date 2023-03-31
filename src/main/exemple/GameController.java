package main.exemple;

import com.example.game.enums.House;
import com.example.game.models.Pet;
import com.example.game.models.Wand;
import com.example.game.models.Wizard;
import com.example.game.spells.Spell;
import com.example.game.utils.SortingHat;

import java.util.Scanner;

public class GameController {
    private Wizard wizard;

    public void start() {
        Scanner scanner = new Scanner(System.in);

        // Create new wizard
        System.out.println("What is your wizard's name?");
        String wizardName = scanner.nextLine();
        wizard = new Wizard(wizardName);

        // Assign wand to wizard
        System.out.println("Choose your wand:");
        Wand wand = Wand.selectWand();
        wizard.setWand(wand);

        // Assign pet to wizard
        System.out.println("Choose your pet:");
        Pet pet = Pet.selectPet();
        wizard.setPet(pet);

        // Assign house to wizard
        SortingHat sortingHat = new SortingHat();
        House house = sortingHat.assignHouse(wizard);
        wizard.setHouse(house);
        System.out.println("Congratulations! You have been assigned to " + house + " house.");

        // Start game loop
        boolean gameRunning = true;
        while (gameRunning) {
            System.out.println("What would you like to do?");
            System.out.println("1. View wizard info");
            System.out.println("2. Cast spell");
            System.out.println("3. Drink potion");
            System.out.println("4. Quit game");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    wizard.viewInfo();
                    break;
                case 2:
                    System.out.println("Choose a spell to cast:");
                    Spell spell = Spell.selectSpell(wizard);
                    wizard.castSpell(spell);
                    break;
                case 3:
                    System.out.println("Choose a potion to drink:");
                    wizard.drinkPotion();
                    break;
                case 4:
                    System.out.println("Quitting game...");
                    gameRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
