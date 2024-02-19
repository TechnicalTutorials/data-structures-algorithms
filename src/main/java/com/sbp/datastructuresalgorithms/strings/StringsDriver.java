package com.sbp.datastructuresalgorithms.strings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringsDriver {
    private static final Logger Log = LoggerFactory.getLogger(StringsDriver.class);
    public static void main(String[] args){
        //Backspace String Compare
        backspaceStringsCompare();
    }

    private static void backspaceStringsCompare(){
        BackspaceStringsCompare backspaceStringsCompare = new BackspaceStringsCompare();
        backspaceStringsCompare.backspaceCompare();
    }
}
