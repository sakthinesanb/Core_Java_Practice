package org.javabasics;

import java.util.Scanner;

public class ScannerOrPredefinedClass {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your name here");
	String name = scan.nextLine();
	scan.close();
	System.out.println("Hello"+" "+name+" "+ ":)");
}
}
