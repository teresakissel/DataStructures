//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Teresa Kissel
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("hello, world!");

        Lab1 lab = new Lab1();

        int[] numbers = {5, 9, 3, 12, 7, 3, 11, 5};

        // While Loop
        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i] + " ");
            i++;
        }

        // Reverse
        for (int j = numbers.length - 1; j >= 0; j--) {
            System.out.println(numbers[j] + " ");
        }

        // First and Last
        System.out.println("First: " + numbers[0]);
        System.out.println("Last: " + numbers[numbers.length - 1]);

        // Calls
        System.out.println(lab.max(3, 9));
        System.out.println(lab.min(3, 9));
        System.out.println(lab.sum(numbers));
        System.out.println(lab.average(numbers));
        System.out.println(lab.max(numbers));
        System.out.println(lab.min(numbers));

        System.out.println(lab.increment(1));
    }
}


// Add all of the methods here
class Lab1 {

    public int increment(int num) {
        return ++num;
    }

    // Max 
    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Min 
    public int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    // Sum
    public int sum(int[] numbers) {
        int total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total = total + numbers[i];
        }

        return total;
    }

    // Average 
    public double average(int[] numbers) {
        int total = 0;

        for (int num : numbers) {
            total = total + num;
        }

        return (double) total / numbers.length;
    }

    // Max 
    public int max(int[] numbers) {
        int maximum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        return maximum;
    }

    // Min 
    public int min(int[] numbers) {
        int minimum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }

        return minimum;
    }
}