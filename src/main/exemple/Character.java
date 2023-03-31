package main.exemple;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Character {
    private String name;
    private int health;
    private int strength;
    private int defense;
    private int speed;
    private House house;

    public Character(String name, int health, int strength, int defense, int speed, House house) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
        this.speed = speed;
        this.house = house;
    }

    public abstract void attack(Character target);

    public abstract void defend();
}
