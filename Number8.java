public class Number8 {
    int getNumberOfZerosLoop(int n) {
        int k, count = 0;
        while (n > 0) {
            k = n % 10;
            if (k == 0)
                count = count + 1;
            n = n / 10;

        }
        return count;

    }
}