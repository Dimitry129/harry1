package main.exemple;

import java.util.List;
import java.util.Random;

public class SortingHat {
    private List<House> houses;

    public SortingHat(List<House> houses) {
        this.houses = houses;
    }

    public void assignHouse(Character character) {
        Random random = new Random();
        int index = random.nextInt(houses.size());
        character.setHouse(houses.get(index));
    }
}
