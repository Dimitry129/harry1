package main.exemple;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pet {
    private String name;
    private String type;
    private int health;

    public Pet(String name, String type, int health) {
        this.name = name;
        this.type = type;
        this.health = health;
    }

    public void feed(Potion potion) {
        health += potion.getHealthRestoreAmount();
    }
}
