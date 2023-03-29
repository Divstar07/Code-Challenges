import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringTokenizer str = new StringTokenizer(in.nextLine()," ");
        int N = Integer.parseInt(str.nextToken());
        int Q = Integer.parseInt(str.nextToken());
        int M = Integer.parseInt(str.nextToken());
        int K = Integer.parseInt(str.nextToken());
        // Create a counter
        int streakCount = 0;
// Loop Q times
        for (int x =0; x < Q; x ++) {
            // Make a scanner input for either AC or WA
            String input  = in.nextLine();
            // if AC Increase N by 1 and increase a counter by 1
            if (input.equals("AC")) {
               N ++;
               streakCount ++;
                // if counter equal to M, increase N by K, and set the streak back to zero
                if (streakCount == M) {
                    N += K;
                    streakCount = 0;
                }
            }
            // if WA decrease N by 3 and set the counter to 0
            if (input.equals("WA")) {
                N -= 3;
                streakCount = 0;
            }
            // If N is less than or equal to zero set N = 0 and break from the loop (N should remain 0 no matter what)
            if (N <= 0) {
                N = 0;
                break;
            }
        }
        // Print N
        System.out.println(N);
    }

}
