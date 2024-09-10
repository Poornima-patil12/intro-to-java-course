//package com.cbfacademy;
package com.codingblackfemales.testdoubles.copier;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("The character Copier should")
public class CharacterCopierTests {
    @Test
    @DisplayName("copy a character from source to destination")

    void copyFromSourceToDestination() {

        final SourceFake source = new SourceFake();
        final DestinationSpy destination = new DestinationSpy();
        final CharacterCopier copier = new CharacterCopier(source, destination);

        copier.copy();

        // assertTrue(source.wasCalled());
        // assertTrue(destination.wasCalled());
        final List<String> characters = List.of("a", "b", "c");
        assertEquals(characters, destination.recordedCharacter());
    }

}
