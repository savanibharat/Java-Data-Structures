package com.HashCode.GeneratingHashCode;

import java.util.ArrayList;
import java.util.List;

public class NGram {

    public static List<String> ngrams(int n, String str) {
        List<String> ngrams = new ArrayList<String>();
        String[] words = str.split(" ");
        for (int i = 0; i < words.length - n + 1; i++)
            ngrams.add(concat(words, i, i+n));
        return ngrams;
    }

    public static String concat(String[] words, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++)
            sb.append((i > start ? " " : "") + words[i]);
        return sb.toString();
    }

    public static void main(String[] args) {
        for (int n = 1; n <= 6; n++) {
            for (String ngram : ngrams(n, "This is a program very good one wwith ngram working on it"))
                System.out.println(ngram);
            System.out.println();
        }
    }
}