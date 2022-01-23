package org.franzon;

import Enums.Race;
import org.inteligencia.central.InteligenciaCentral;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class App {
    public static void main( String[] args ) throws FileNotFoundException, UnsupportedEncodingException {

       // InteligenciaCentral ic = new InteligenciaCentral("Bruno 1", 18, Race.Human);
       // InteligenciaCentral ic2 = new InteligenciaCentral("Bruno 2", 18, Race.Human);

       // ic.printAdmittedList();
       // ic2.printAdmittedList();

        // Utilizando @Builder
        InteligenciaCentral ic = InteligenciaCentral.builder().
                name("Chuck Noris").
                idade(98).
                race(Race.Human).
                build();

        ic.createAdmittedList();
        ic.printAdmittedList();
    }
}
