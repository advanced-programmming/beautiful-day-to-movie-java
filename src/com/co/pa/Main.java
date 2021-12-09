package com.co.pa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt(); // start
        int j = scanner.nextInt(); // end
        int k = scanner.nextInt(); // divisor
        System.out.println(beautifulDayAtTheMovies(i, j, k));
    }

    public static int beautifulDayAtTheMovies(int i, int j, int k){
        int count = 0;
        for(int y = i; y <= j; y++) {
            int num = y;
            int reverseNum = reverseNumber(num);
            int result = Math.abs(num - reverseNum);
            count = (result % k == 0) ? (count + 1) : count;
        }
        return count;
    }

    public static int reverseNumber(int number){
        int reverse = 0;
        while(number != 0) {
            int quo = number % 10;
            reverse = 10 * reverse + quo;
            number /= 10;
        }
        return reverse;
    }
}
