package com.phasha;

import com.phasha.Easylevel.LinearSearch;

public class Main {

    public static void main(String[] args){

        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = i; // fill array with 0,1,2,...9
        }

        LinearSearch search = new LinearSearch();
        System.out.println(search.run(list, 4));
    }
}