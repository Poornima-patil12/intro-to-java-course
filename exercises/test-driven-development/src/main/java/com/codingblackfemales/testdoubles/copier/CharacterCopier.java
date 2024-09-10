//package com.cbfacademy;
package com.codingblackfemales.testdoubles.copier;

public class CharacterCopier {
    private final Source source;
    private final Destination destination;

    public CharacterCopier(final Source source, final Destination destination) {
        this.source = source;
        this.destination = destination;
    }

    public void copy() {
        while (true) {
            final String character = this.source.getCharacter();
            if (character.equals("\n"))
                break;
            this.destination.setCharacter(character);
        }

        // throw new RuntimeException("Not Implemented");
    }
}
