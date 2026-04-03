import java.util.*;

class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        Map<String, Integer> map = new HashMap<>();
        int[] freq = new int[26];
        int unique = 0;
        int left = 0;
        int maxCount = 0;

        for (int right = 0; right < s.length(); right++) {
            // Add character
            char ch = s.charAt(right);
            if (freq[ch - 'a'] == 0) unique++;
            freq[ch - 'a']++;

            // Maintain window size = minSize
            if (right - left + 1 > minSize) {
                char leftChar = s.charAt(left);
                freq[leftChar - 'a']--;
                if (freq[leftChar - 'a'] == 0) unique--;
                left++;
            }

            // Check valid window
            if (right - left + 1 == minSize && unique <= maxLetters) {
                String sub = s.substring(left, right + 1);
                map.put(sub, map.getOrDefault(sub, 0) + 1);
                maxCount = Math.max(maxCount, map.get(sub));
            }
        }

        return maxCount;
    }
}