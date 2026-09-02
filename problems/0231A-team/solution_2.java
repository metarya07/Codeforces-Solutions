/*
 * Codeforces Problem 231A: Team
 * Problem URL: https://codeforces.com/contest/231/problem/A
 * Submission URL: https://codeforces.com/contest/231/submission/389199945
 * Solution #2 (Java 21)
 * Verdict: Accepted
 * Time: 530 ms
 * Memory: 100 KB
 * Submission Date: 2026-09-02 14:56:28 UTC
 * Author: MetaryaJain
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int count = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = Integer.parseInt(st.nextToken()) 
                    + Integer.parseInt(st.nextToken()) 
                    + Integer.parseInt(st.nextToken());
            
            if (sum >= 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}