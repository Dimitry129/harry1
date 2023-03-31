package main.exemple;


public abstract class AbstractSpell {
    protected String name;
    protected int powerLevel;

    public AbstractSpell(String name, int powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
    }

    public String getName() {
        return name;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public abstract void cast(Character target);
}
