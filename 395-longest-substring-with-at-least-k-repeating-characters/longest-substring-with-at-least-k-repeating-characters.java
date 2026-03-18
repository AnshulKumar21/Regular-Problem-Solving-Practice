class Solution {
    public int longestSubstring(String s, int k) {
        int maxLen = 0;
        int n = s.length();
        
        // Try for all possible unique characters count
        for (int targetUnique = 1; targetUnique <= 26; targetUnique++) {
            
            int[] freq = new int[26];
            int left = 0, right = 0;
            int unique = 0;       // total unique chars
            int atLeastK = 0;     // chars with freq >= k
            
            while (right < n) {
                
                // Expand window
                if (freq[s.charAt(right) - 'a'] == 0) {
                    unique++;
                }
                
                freq[s.charAt(right) - 'a']++;
                
                if (freq[s.charAt(right) - 'a'] == k) {
                    atLeastK++;
                }
                
                right++;
                
                // Shrink window if unique > target
                while (unique > targetUnique) {
                    
                    if (freq[s.charAt(left) - 'a'] == k) {
                        atLeastK--;
                    }
                    
                    freq[s.charAt(left) - 'a']--;
                    
                    if (freq[s.charAt(left) - 'a'] == 0) {
                        unique--;
                    }
                    
                    left++;
                }
                
                // Check valid window
                if (unique == targetUnique && unique == atLeastK) {
                    maxLen = Math.max(maxLen, right - left);
                }
            }
        }
        
        return maxLen;
    }
}