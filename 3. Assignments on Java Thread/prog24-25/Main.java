/*
 * Name : Aditya Mayukh Som
 * Roll Number : 002111001123
 * 
 * 24) Consider the following parallel binary search algorithm for series a1, a2…an sorted in increasing order such that n mod 10 = 0. Element to be searched is e.

*  a) Create n/10 threads t1, t2,..,tn/10.
*  b) Distribute the numbers among threads such that ti will have numbers ai, ai+1, ….a2i-1. 
*  c) Distribute the element e to all threads.
*  d) Each thread searches the element e in its sub-array using binary search algorithm.

*  25) Write a Java program using threading technology and print the thread index and location where the element has been found.
 * 
 */

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.err.println("Insufficient arguments provided :: 4 arguments required.");
            System.out.println(
                    "TRY :: java <Main Class Name> <Input File Name> <Delimiter> <Target> <Elements Per Thread>");
            System.exit(1);
        }
        int[] arr = readTextFileToArray(args[0], args[1]);
        int target = Integer.parseInt(args[2]);
        int elemsPerThread = Integer.parseInt(args[3]);

        Answer ans = new Answer();
        int threadCount = arr.length / elemsPerThread;
        Thread[] threads = new Thread[threadCount];

        for (int cnt = 0, idx = 0; cnt < arr.length; cnt += elemsPerThread, idx++) {
            threads[idx] = new Thread(new Worker(arr, target, cnt, cnt + elemsPerThread - 1, ans));
            threads[idx].start();
        }
        try {
            for (Thread thread : threads) {
                thread.join();
            }

            if (ans.getPos() != -1) {
                System.out.println("Element " + target + " found at index " + ans.getPos());
                System.out.println("Element was found by thread with id " + ans.getThreadId());
            } else {
                System.out.println("Element " + target + " not found in the array.");
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public static int[] readTextFileToArray(String filePath, String delimiter) {
        ArrayList<Integer> nums = new ArrayList<>();

        try (FileReader fr = new FileReader(filePath);
                BufferedReader reader = new BufferedReader(fr)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] numbers = line.split(delimiter);
                for (String number : numbers) {
                    number = number.trim();
                    if (!number.equals("")) {
                        nums.add(Integer.parseInt(number));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[] returnArray = new int[nums.size()];

        for (int i = 0; i < nums.size(); i++) {
            returnArray[i] = nums.get(i);
        }

        return returnArray;
    }
}
