package org.enricogiurin.interview.candidate.makeinterview;
/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
 */
public class FindTheLongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        int minLength = Integer.MAX_VALUE;
        for(String s:strs){
            minLength = Math.min(minLength, s.length());
        }
        StringBuilder sb = new StringBuilder();
        external:
        for(int indWord=0;indWord<minLength;indWord++){
            //iterate over the array
            for(int j=1;j<strs.length;j++){
                if(strs[j-1].charAt(indWord) != strs[j].charAt(indWord)){
                    break external;
                }
            }
            sb.append(strs[0].charAt(indWord));
        }
        return sb.toString();
    }
}
