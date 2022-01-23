package Interfaces;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public interface PrintList {
    public Object createAdmittedList();
    public void printAdmittedList() throws FileNotFoundException, UnsupportedEncodingException;

}
