package hu.nive.ujratervezes.kepesitovizsga.addigits;

import java.util.HashSet;
import java.util.Set;

public class AddDigits {

    public int addDigits(String input) {

        if (input == null || input.equals("")) {
            return -1;
        }
        int result = 0;
        for (char c : input.toCharArray()) {
            if (checkLetter(c)) {
                result += Integer.parseInt("" + c);
            }
        }
        return result;
    }

    private boolean checkLetter(char c) {
        return c >= '0' && c <= '9';
    }

}


