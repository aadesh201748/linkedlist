package main;

import java.util.ArrayList;

public class ArrayTry {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i,i+1);
        }
        list.remove(0);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
