package com.phasha.IntermediateLevel;

import java.util.Arrays;

public class BinarySearch {

    public int run(int[] list, int target){
        int result = -1;
        int[] newList = Arrays.stream(list).sorted().toArray();
        int start = 0;
        int end = newList.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if (newList[mid] == target){
                return mid;
            }
            else if (target < newList[mid]){
                end = mid-1;
            }
            else{
                start = mid +1;
            }
        }
        return result;
    }
}
