package org.franzon;

import Enums.Race;
import org.inteligencia.central.InteligenciaCentral;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class App {
    public static void main( String[] args ) throws FileNotFoundException, UnsupportedEncodingException {

        InteligenciaCentral ic = new InteligenciaCentral("Bruno", 18, Race.Human);
        ic.printAdmittedList();

    }
}
