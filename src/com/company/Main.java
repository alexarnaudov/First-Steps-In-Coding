package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Scanner scan = new Scanner(System.in);
    double a = Double.parseDouble(scan.nextLine());
    double inch = 2.54;
    double area = a*inch;
    System.out.println(area);
    }
}
