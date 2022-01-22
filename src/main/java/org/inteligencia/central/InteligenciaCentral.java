package org.inteligencia.central;

import Enums.Race;
import Interfaces.PrintList;
import lombok.Cleanup;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Objects;

public class InteligenciaCentral implements PrintList {

    private String name;
    private Integer idade;
    private Race race;

    public  InteligenciaCentral(String _name, Integer _idade, Race _race){
        this.name = _name;
        this.idade = _idade;
        this.race = _race;
    }

    public Boolean isAdmitted(){
        return this.idade >= 18;
    }

    @Override
    public void printAdmittedList() throws FileNotFoundException, UnsupportedEncodingException{

        if(this.isAdmitted()){
            @Cleanup PrintWriter writer = new PrintWriter("RebelsList.txt", "UTF-8");
            writer.println("Admitted Rebels List");
            writer.println("Name: " + this.name);
            writer.println("Idade: " + this.idade);
            writer.println("Race: " + this.race);
        }
    }
}
