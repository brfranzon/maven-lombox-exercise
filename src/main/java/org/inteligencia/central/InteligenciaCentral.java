package org.inteligencia.central;

import Enums.Race;
import Interfaces.PrintList;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Cleanup;
import lombok.Data;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@Builder
public class InteligenciaCentral implements PrintList {

    private String name;
    private Integer idade;
    private Race race;

    //public  InteligenciaCentral(String _name, Integer _idade, Race _race){
    //    this.name = _name;
    //    this.idade = _idade;
    //    this.race = _race;
    // }

    public Boolean isAdmitted(){
        return this.idade >= 18;
    }

    @Override
    public ArrayList createAdmittedList(){
        ArrayList admittedList = new ArrayList();

        if(this.isAdmitted()) {
            admittedList.add(this.name);
            admittedList.add(this.idade);
            admittedList.add(this.race);
            System.out.println(admittedList);
            return admittedList;
        }else {
            return null;
        }

    }
    @Override
    public void printAdmittedList() throws FileNotFoundException, UnsupportedEncodingException{
          @Cleanup PrintWriter writer = new PrintWriter("RebelsList.txt", "UTF-8");
          writer.println("Admitted Rebels List");
          writer.println("____________________");

         for (Object item: createAdmittedList()) {
               writer.println(item);
         }


    }




}
