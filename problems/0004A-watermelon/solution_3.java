/*
 * Codeforces Problem 4A: Watermelon
 * Problem URL: https://codeforces.com/contest/4/problem/A
 * Submission URL: https://codeforces.com/contest/4/submission/389199837
 * Solution #3 (Java 21)
 * Verdict: Accepted
 * Time: 436 ms
 * Memory: 1500 KB
 * Submission Date: 2026-09-02 14:55:08 UTC
 * Author: MetaryaJain
 */

public class Main {
    public static void main(String[] args) throws Exception {
        int w = 0, b = System.in.read();
        
        // Skip any whitespace
        while (b <= 32 && b != -1) {
            b = System.in.read();
        }
        
        // Parse the integer directly from bytes
        while (b >= '0' && b <= '9') {
            w = w * 10 + (b - '0');
            b = System.in.read();
        }
        
        System.out.println((w > 2 && (w & 1) == 0) ? "YES" : "NO");
    }
}