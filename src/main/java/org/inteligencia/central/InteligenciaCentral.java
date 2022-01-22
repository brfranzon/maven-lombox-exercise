package org.inteligencia.central;

import Enums.Race;

import java.util.Objects;

public class InteligenciaCentral {

    private String name;
    private Integer idade;
    private Race race;

    public  InteligenciaCentral(String _name, Integer _idade, Race _race){
        this.name = _name;
        this.idade = _idade;
        this.race = _race;
    }

    public String isAdmitted(){
        return "result..." + this.name + " - " + this.idade + " " + this.race;
    }

}
