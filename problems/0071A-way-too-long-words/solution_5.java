/*
 * Codeforces Problem 71A: Way Too Long Words
 * Problem URL: https://codeforces.com/contest/71/problem/A
 * Submission URL: https://codeforces.com/contest/71/submission/389164619
 * Solution #5 (Java 21)
 * Verdict: Accepted
 * Time: 203 ms
 * Memory: 1100 KB
 * Submission Date: 2026-09-02 07:09:24 UTC
 * Author: MetaryaJain
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        new BufferedReader(new InputStreamReader(System.in))
            .lines()
            .skip(1) // Skip the first line containing 'n'
            .map(s -> s.length() > 10 ? s.charAt(0) + "" + (s.length() - 2) + s.charAt(s.length() - 1) : s)
            .forEach(System.out::println);
    }
}