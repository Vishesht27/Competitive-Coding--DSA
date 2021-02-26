class Solution {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int next = result * 10 + x % 10;
            if (next / 10 != result) return 0;

            result = next;
            x /= 10;
        }

        return result;
    }
}
