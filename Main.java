package me.progamer260.enchant;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		System.out.println("Do a coin flip?");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
if (sc.hasNext("Yes"))
	if (Math.random() > 0.5)
		System.out.println("Heads");
		else {
			System.out.println("Tails");
		}
	
	} 
	}


