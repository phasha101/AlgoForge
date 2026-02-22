package com.phasha.IntermediateLevel;

import java.util.Arrays;

public class BinarySearch {

    public int run(int[] list, int target){
        int result = -1;
        int[] newList = Arrays.stream(list).sorted().toArray();
        int start = 0;
        int end = newList.length-1;
        while(result != target){
            int mid = (int) (start+end)/2;
            if (newList[mid] == target){
                result = list[mid];
            }
            else if (target < list[mid]){
                end = mid;
            }
            else{
                start = mid;
            }
        }
        return result;
    }
}
