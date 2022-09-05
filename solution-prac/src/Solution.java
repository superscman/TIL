package com.codestates.coplit;

public class Solution {
    public int getMaxNumberFromString(String str) {
        // TODO:
        int max = 0;
        for (int i=0; i<str.length(); i++){
            int a = Character.getNumericValue(str.charAt(i));
            if (max<=a){
                max = a;
            }
        }
        return max;
    }
}