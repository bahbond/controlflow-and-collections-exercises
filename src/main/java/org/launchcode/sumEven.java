package org.launchcode;

import java.util.ArrayList;

public class sumEven {
    public static int addTheEvens(ArrayList<Integer> arr){
        int sumTotal = 0;
        for (int num : arr){
            if (num %2 == 0){
                sumTotal += num;
            }
        }
        return sumTotal;
    }
}
