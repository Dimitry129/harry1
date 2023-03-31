package main.exemple;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Wizard extends Character {
    private List<Spell> knownSpells;
    private Wand wand;

    public Wizard(String name, int health, int strength, int defense, int speed, House house, List<Spell> knownSpells, Wand wand) {
        super(name, health, strength, defense, speed, house);
        this.knownSpells = knownSpells;
        this.wand = wand;
    }

    public void learnSpell(Spell spell) {
        knownSpells.add(spell);
    }

    @Override
    public void attack(Character target) {
        // Code to perform attack
    }

    @Override
    public void defend() {
        // Code to perform defense
    }
}
