public class Bhaiya_An_Strings {
    public static void main(String[] args) {

        String s = "aaababbababaabbbabbbaaa";
        int k = 3;
        int flip_a = maximum(s, k, 'a');
        int flip_b = maximum(s, k, 'b');
        System.out.println(Math.max(flip_a, flip_b));
    }

    public static int maximum(String s, int k, char ch) {
        int si = 0, ei = 0, flip = 0, ans = 0;

        while (ei < s.length()) {
            // grow
            if (s.charAt(ei) == ch) {
                flip++;
            }

            // shrink only when flip > k
            while (flip > k) {
                if (s.charAt(si) == ch) {
                    flip--;
                }
                si++; // move start of window forward
            }

            // update answer
            ans = Math.max(ans, ei - si + 1);
            ei++;
        }

        return ans;
    }
}
