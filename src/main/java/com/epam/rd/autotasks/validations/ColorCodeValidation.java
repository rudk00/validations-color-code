package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorCodeValidation {
    public static boolean validateColorCode(String color) {
        if (color == null||color == "\\s+") return false;
        Pattern pattern6 = Pattern.compile("#[0-9a-fA-F]{6}");
        Pattern pattern3 = Pattern.compile("#[0-9a-fA-F]{3}");
        Matcher matcher6 = pattern6.matcher(color);
        Matcher matcher3 = pattern3.matcher(color);
        if (color.length() <=4){
            return (matcher3.matches());
        } else {
            return (matcher6.matches());
        }
    }
}





