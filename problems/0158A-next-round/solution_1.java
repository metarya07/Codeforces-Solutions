/*
 * Codeforces Problem 158A: Next Round
 * Problem URL: https://codeforces.com/contest/158/problem/A
 * Submission URL: https://codeforces.com/contest/158/submission/389417399
 * Solution #1 (Java 21)
 * Verdict: Accepted
 * Time: 436 ms
 * Memory: 1400 KB
 * Submission Date: 2026-09-05 04:42:33 UTC
 * Author: MetaryaJain
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        
        int threshold = a[k - 1];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= threshold && a[i] > 0) {
                count++;
            } else {
                break;
            }
        }
        
        System.out.println(count);
    }
}