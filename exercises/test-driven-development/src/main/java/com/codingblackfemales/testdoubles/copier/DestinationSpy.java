//package com.cbfacademy;
package com.codingblackfemales.testdoubles.copier;

import java.util.ArrayList;
import java.util.List;

interface Destination {
    void setCharacter(final String character);
}

public class DestinationSpy implements Destination {

    private Integer numberOfcalls = 0;
    private final List<String> recordedCharacter = new ArrayList<>();

    public void setCharacter(final String character) {
        // this.numberOfcalls = this.numberOfcalls + 1;
        this.recordedCharacter.add(character);
        this.numberOfcalls = this.numberOfcalls + 1;
    }

    /*
     * Boolean wasCalled() {
     * return numberOfcalls > 0;
     * }
     */

    List<String> recordedCharacter() {
        return this.recordedCharacter;
    }

}
