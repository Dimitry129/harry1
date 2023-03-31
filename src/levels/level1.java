package levels;

import java.util.ArrayList;
import java.util.List;
import main.exemple.Character;
import main.exemple.Potion;
import main.exemple.Wand;
import main.exemple.Spell;

public class PhilosopherStoneLevel {

    private List<Potion> potions;
    private List<Spell> spells;
    private Character player;
    private int score;
    private boolean trollDefeated;

    public PhilosopherStoneLevel(Character player) {
        this.potions = new ArrayList<>();
        this.spells = new ArrayList<>();
        this.player = player;
        this.score = 0;
        this.trollDefeated = false;
    }

    public void startLevel() {
        // Display level intro
        System.out.println("Welcome to the first level: The Philosopher's Stone!");
        System.out.println("You must defeat the troll in the toilets next to the dungeon.");
        System.out.println("To do this, you need to lift objects and drop them on the troll's head.");

        // Equip player with wand
        Wand wand = new Wand();
        player.setWand(wand);

        // Fill potions list
        potions.add(new Potion("Potion of Healing", 10));
        potions.add(new Potion("Potion of Strength", 5));
        potions.add(new Potion("Potion of Invisibility", 2));

        // Spells list
        
        spells.add(new Spell("Expelliarmus", 10));
        spells.add(new Spell("Stupefy", 15));
        spells.add(new Spell("Lumos", 5));

        // Start gameplay loop
        while(!trollDefeated) {
            // Display troll status
            System.out.println("The troll has " + trollHealth + " health remaining.");

            // Get player action
            String action = getPlayerAction();

            // Handle player action
            if(action.equals("lift")) {
                // Lift object and check if it hits troll
                if(liftObject()) {
                    // Object hit the troll, decrement its health
                    trollHealth -= 10;

                    // Check if troll is defeated
                    if(trollHealth <= 0) {
                        trollDefeated = true;
                        System.out.println("Congratulations, you defeated the troll!");
                    }
                }
            } else if(action.equals("drink")) {
                // Drink potion and add its effect to player
                Potion potion = selectPotion();
                player.addEffect(potion.getEffect());
                potions.remove(potion);
            } else if(action.equals("cast spell")) {
                // Cast spell and check if it hits troll
                Spell spell = selectSpell();
                if(spell.cast(player)) {
                    // Spell hit the troll, decrement its health
                    trollHealth -= spell.getDamage();

                    // Check if troll is defeated
                    if(trollHealth <= 0) {
                        trollDefeated = true;
                        System.out.println("Congratulations, you defeated the troll!");
                    }
                }
            }
        }

        // Display end of level stats
        System.out.println("End of level stats:");
        System.out.println("Score: " + score);
        System.out.println("Potions remaining: " + potions.size());
    }

    private String getPlayerAction() {
        // Display player options and
