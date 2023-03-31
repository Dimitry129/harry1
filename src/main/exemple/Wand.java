package main.exemple;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Wand {
    private String woodType;
    private String coreType;

    public Wand(String woodType, String coreType) {
        this.woodType = woodType;
        this.coreType = coreType;
    }
}
