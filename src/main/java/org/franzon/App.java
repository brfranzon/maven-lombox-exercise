package org.franzon;

import Enums.Race;
import org.inteligencia.central.InteligenciaCentral;

public class App {
    public static void main( String[] args ) {

        InteligenciaCentral ic = new InteligenciaCentral("Bruno", 12, Race.Human);

        System.out.println(ic.isAdmitted());
    }
}
