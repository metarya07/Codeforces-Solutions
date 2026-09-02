/*
 * Codeforces Problem 71A: Way Too Long Words
 * Problem URL: https://codeforces.com/contest/71/problem/A
 * Submission URL: https://codeforces.com/contest/71/submission/389164092
 * Solution #1 (Java 21)
 * Verdict: Accepted
 * Time: 171 ms
 * Memory: 600 KB
 * Submission Date: 2026-09-02 06:42:53 UTC
 * Author: MetaryaJain
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine().trim());
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String word = br.readLine().trim();
            int len = word.length();
            
            if (len > 10) {
                sb.append(word.charAt(0))
                  .append(len - 2)
                  .append(word.charAt(len - 1))
                  .append("\n");
            } else {
                sb.append(word).append("\n");
            }
        }
        System.out.print(sb);
    }
}
