package com.company;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        ExecutorService execute = Executors.newFixedThreadPool(4);

        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            array.add(i);
        }

        ThreadOperation thr = new ThreadOperation(array);

        execute.execute(thr);



    }
}
