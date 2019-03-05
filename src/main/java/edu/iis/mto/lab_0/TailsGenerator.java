package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        if (value == null) {
            return new ArrayList<>(0);
        }
        ArrayList<String> listOfTrimmedStrings = new ArrayList<>();
        listOfTrimmedStrings.add(value);
        for (int i = 0; i < value.length(); i++) {
            listOfTrimmedStrings.add(value.substring(i + 1, value.length()));
        }
        System.out.println(listOfTrimmedStrings);
        return listOfTrimmedStrings;
    }

}
