package com.codingblackfemales.testdoubles.copier;

import java.util.List;

//interface Source {
//  String getCharacter();
//}

public class SourceFake implements Source {

    private Integer numberOfcalls = 0;
    private final List<String> characters = List.of("a", "b", "c", "\n");

    @Override
    public String getCharacter() {
        final String character = this.characters.get(this.numberOfcalls);
        this.numberOfcalls = this.numberOfcalls + 1;

        return character;

    }

    Boolean wasCalled() {
        return this.numberOfcalls > 0;
    }
}
