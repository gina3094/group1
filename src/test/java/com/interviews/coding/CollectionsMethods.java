package com.interviews.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethods {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1,2,3,4,51,0,15,1,1));
        ArrayList<Integer> listCopy = new ArrayList<>(Arrays.asList(15,20,25,30,50,60,70,80,90));

        Collections.copy(listCopy,list);
        System.out.println("listCopy = " + listCopy);

        System.out.println("Collections.frequency(list,1) = " + Collections.frequency(list, 1));

        System.out.println("Collections.binarySearch(listCopy,5) = " + Collections.binarySearch(list, 1));

        Collections.sort(list);
        System.out.println("list = " + list);
        Collections.swap(list,0,list.size()-1);
        System.out.println("list = " + list);
    }
}
