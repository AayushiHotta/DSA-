/*Logic & Approach:
Identify Vowel Words:

A word is considered a "vowel word" if its first and last characters are vowels.
Vowels are stored in a Set for quick lookup.
Build Prefix Sum Array (track):

track[i] stores the count of vowel words in the first i words.
As we iterate through the words, we check if the current word is a vowel word and update track.
Answer Queries Using Prefix Sums:

For each query (start, end), calculate the count of vowel words in the range [start, end] as:
ans[i]
=
track[end+1]
−
track[start]
ans[i]=track[end+1]−track[start]
This allows constant-time query computation after building the prefix sum.
Efficiency:
-> Time COmplexity: Building trakcs - O(n) - number of words
                    Answering queries - O(q) - number of queries
-> Space Complexity: O(n) - track array*/

class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length; // Number of words
        int[] track = new int[n + 1]; // Prefix sum array to track count of vowel words
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u')); // Set of vowels for quick lookup

        // Build the prefix sum array
        for (int i = 0; i < n; i++) {
            track[i + 1] = track[i]; // Carry forward the previous count
            char start = words[i].charAt(0); // First character of the word
            char end = words[i].charAt(words[i].length() - 1); // Last character of the word
            if (vowels.contains(start) && vowels.contains(end)) { // Check if both are vowels
                track[i + 1]++; // Increment the count if it's a vowel word
            }
        }

        int[] ans = new int[queries.length]; // Array to store results of queries
        for (int i = 0; i < queries.length; i++) {
            // For each query, compute the count of vowel words in the range [queries[i][0], queries[i][1]]
            ans[i] = track[queries[i][1] + 1] - track[queries[i][0]];
        }
        return ans; // Return the results
    }
}

