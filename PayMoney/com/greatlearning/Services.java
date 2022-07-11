package com.greatlearning;

import java.util.Scanner;

public class Services {
    public void trnx() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Size of Transcations:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Please Enter the Transcations:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        System.out.println("Please enter the no of targets:");
        int numOfTarg = sc.nextInt();
        while (numOfTarg-- != 0) {
            int flag = 0;
            int target;
            System.out.println("Please Enter the Target:");
            target = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < size; i++) {
                sum += arr[i];
                if (sum >= target) {
                    System.out.println("Target achieved after " + (i + 1) + " Transcations");
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println("Target not achieved");
            }
        }
    }
}

