package com.phasha.Easylevel;

public class LinearSearch {

    public int run(int[] list, int target){
        int result = -1;
        for(int x = 0; x<list.length; x++){
            if (list[x] == target){
                result = x;
                break;
            }
        }
        return result;
    }
}
