package main.exemple;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Potion {
    private String name;
    private int healthRestoreAmount;

    public Potion(String name, int healthRestoreAmount) {
        this.name = name;
        this.healthRestoreAmount = healthRestoreAmount;
    }
}
