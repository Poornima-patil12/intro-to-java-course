//package com.cbfacademy;
package com.codingblackfemales.testdoubles.copier;

interface Source {
    String getCharacter();
}

public class SourceSpy implements Source {

    private Integer numberOfcalls = 0;

    @Override
    public String getCharacter() {
        this.numberOfcalls = this.numberOfcalls + 1;
        return null;

    }

    Boolean wasCalled() {
        return this.numberOfcalls > 0;
    }

}
