package com.sbp.datastructuresalgorithms.strings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
 *
 * Note that after backspacing an empty text, the text will continue empty.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "ab#c", t = "ad#c"
 * Output: true
 * Explanation: Both s and t become "ac".
 * Example 2:
 *
 * Input: s = "ab##", t = "c#d#"
 * Output: true
 * Explanation: Both s and t become "".
 * Example 3:
 *
 * Input: s = "a#c", t = "b"
 * Output: false
 * Explanation: s becomes "c" while t becomes "b".
 *
 *
 * Constraints:
 *
 * 1 <= s.length, t.length <= 200
 * s and t only contain lowercase letters and '#' characters.
 *
 */
public class BackspaceStringsCompare {

    private static final Logger Log = LoggerFactory.getLogger(BackspaceStringsCompare.class);

    public void backspaceCompare() {

        String string1 = "ab#z";
        String string2 = "az#z";
        String string3 = "az##z#";
        String string4 = "##z#";
        String string5 = "#";
        String string6 = "#";

        Log.info("1. " + backspaceCompare(string1, string2));
        Log.info("2. " + backspaceCompare(string3, string4));
        Log.info("3. " + backspaceCompare(string5, string6));
    }

    private boolean backspaceCompare(String str1, String str2) {
        int p1 = str1.length() - 1, p2 = str2.length() - 1;

        while (p1 >= 0 || p2 >= 0) {
            if (str1.charAt(p1) == '#' || str2.charAt(p2) == '#') {
                if (str1.charAt(p1) == '#') {
                    int backCount = 2;
                    while (backCount > 0 ) {
                        p1--;
                        backCount--;

                        if (p1>=0 && str1.charAt(p1) == '#') {
                            backCount += 2;
                        }
                    }
                }

                if (str2.charAt(p2) == '#') {
                    int backCount = 2;
                    while (backCount > 0 ) {
                        p2--;
                        backCount--;

                        if (p2>=0 && str2.charAt(p2) == '#') {
                            backCount += 2;
                        }
                    }
                }
//                if (str1.charAt(p1) == str2.charAt(p2)) {
//                    return true;
//                }
//                else
//                    return false;

            } else {
                if (str1.charAt(p1) != str2.charAt(p2)) {
                    return false;
                } else {
                    p1--;
                    p2--;
                }
            }

//            if (p1==0 && p2==0 && (str1.charAt(p1) == str2.charAt(p2))) {
//                return true;
//            }
//            else
//                return false;
        }
        return true;
    }
}
