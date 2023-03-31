package main.exemple;

public enum House {
    GRYFFINDOR("Griffondor"),
    HUFFLEPUFF("Poufsouffle"),
    RAVENCLAW("Serdaigle"),
    SLYTHERIN("Serpentard");

    private final String name;

    House(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
