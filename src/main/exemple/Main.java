package main.exemple;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Wizard
        System.out.println("Enter wizard's name : ");
        String name = scanner.nextLine();

        //PET
        System.out.println("Choose your pet ," + name);
        System.out.println("1. Hedwig");
        System.out.println("2. Fawkes");
        System.out.println("3. Dog");
        System.out.println("4. Cat");
        int choicePet = scanner.nextInt();
        Pet pet = null;
        switch (choicePet) {
            case 1:
                pet = Pet.Hedwig;
                break;
            case 2:
                pet = Pet.Fawkes;
                break;
            case 3:
                pet = Pet.Dog;
                break;
            case 4:
                pet = Pet.Cat;
                break;
            default:
                System.out.println("Invalid input, pet will be set to default Hedwig");
                pet = pet.Hedwig;
                break;
        }


        // Create a Wand
        System.out.println("Choose wand's core : ");
        System.out.println("1. PHOENIX FEATHER");
        System.out.println("2. DRAGON HEARTHSTRING");
        System.out.println("3. UNICORN HAIR");
        int choice = scanner.nextInt();
        Core core = null;
        switch (choice) {
            case 1:
                core = Core.PHOENIX_FEATHER;
                break;
            case 2:
                core = Core.DRAGON_HEARTSTRING;
                break;
            case 3:
                core = Core.UNICORN_HAIR;
                break;
        }


        System.out.println("Choose wand's size : ");
        int size = scanner.nextInt();

        //Sorting Hat
        SortingHat sortingHat = new SortingHat();

        int health = 100;
        int damage = 15;

        Wand wand = new Wand(core, size);
        Wizard wizard = new Wizard(name, health, damage, wand, pet);



        System.out.println("Wizard Name : " + wizard.getName());
        System.out.println("Wizard Health : " + wizard.getHealth());
        System.out.println("Wizard Damage : " + wizard.getDamage());
        System.out.println("Size Wand : " + wizard.getWand().getSize());
        System.out.println("Core Wand : " + wizard.getWand().getCore());
        System.out.println("Your Pet : " + wizard.getPet());
        System.out.println("Good luck " + name);

        // Houses
        String houses = SortingHat.assignHouse(wizard);
        System.out.println(wizard.getName() + "'s house is " + houses);

        Enemy enemy = new Enemy("Troll", 50, 10);

        Fight fight = new Fight(wizard, enemy);
        fight.startLevel1();

    }

}

