class Solution {
    public long countValidSubstrings(String s) {
      int n = s.length();
        int last = -1; 
        long ans = 0;
        for (int r = 0; r < n; r++) {
            if (r >= 2 && s.charAt(r - 2) == 'a'
                       && s.charAt(r - 1) == 'b'
                       && s.charAt(r) == 'c') {
                last = r - 2;
            }
            ans += r - last;
        }
        return ans;
    }
}
