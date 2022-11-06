public class Number1 {
    public String displayString(String str, int n) {
        if (n > 0) {
            return str + displayString(str, n - 1);
        } else {
            return "";

        }

    }


}