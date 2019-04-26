import java.util.*;
import java.io.*;
// 2n algorithm
public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(long[] numbers) {

        int index1 = 0;
        int index2;

        int n = numbers.length;

        for (int i = 1; i < n; ++i) {
            if (numbers[i] > numbers[index1]) {
                index1 = i;
            }
        }

        if (index1 == 0) {
            index2 = 1;
        }
        else {
             index2 = 0;
        }

        for(int i = 0; i < n; i++){
            if(i != numbers[index1] && numbers[i] > numbers[index2]){
                index2 = i;
            }
        }

        return numbers[index1] * numbers[index2];

    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                        InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}