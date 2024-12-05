package com.example.CountingDnaNucleotides;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CountingDnaNucleotidesApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the DNA sequence:");
		String dnaSequence = scanner.nextLine();

		try {
			DNASequenceCounter counter = new DNASequenceCounter(dnaSequence);
			int[] counts = counter.countNucleotides();

			System.out.println("Nucleotide count:");
			System.out.println("A: " + counts[0]);
			System.out.println("C: " + counts[1]);
			System.out.println("G: " + counts[2]);
			System.out.println("T: " + counts[3]);
		} catch (IllegalArgumentException ex) {
			System.out.println("Invalid DNA sequence: " + ex.getMessage());
		} finally {
			scanner.close();
		}
	}


}
