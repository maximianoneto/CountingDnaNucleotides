package com.example.CountingDnaNucleotides;

public class DNASequenceCounter {

    private String sequence;

    public DNASequenceCounter(String sequence) {
        this.sequence = sequence;
    }

    public int[] countNucleotides() {
        if (sequence == null || !sequence.matches("[ACGT]+")) {
            throw new IllegalArgumentException("Invalid DNA sequence");
        }

        int[] counts = new int[4]; // Index 0 = A, 1 = C, 2 = G, 3 = T
        for (char nucleotide : sequence.toUpperCase().toCharArray()) {
            switch (nucleotide) {
                case 'A' -> counts[0]++;
                case 'C' -> counts[1]++;
                case 'G' -> counts[2]++;
                case 'T' -> counts[3]++;
                default -> throw new IllegalArgumentException("Invalid DNA sequence");
            }
        }
        return counts;
    }
}

