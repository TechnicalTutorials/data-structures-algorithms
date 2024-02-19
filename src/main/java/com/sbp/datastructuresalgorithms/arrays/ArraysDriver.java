package com.sbp.datastructuresalgorithms.arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArraysDriver {
    private static final Logger Log = LoggerFactory.getLogger(ArraysDriver.class);
    public static void main(String[] args){
        trappingRainWater();
    }

    private static void trappingRainWater(){
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        trappingRainWater.getTrappedRainwater();
    }
}
