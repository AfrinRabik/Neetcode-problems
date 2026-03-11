class Solution {
    public int lengthOfLastWord(String s) {
        String[] str=s.trim().split("\\s+");
       String word_length=str[str.length-1];
        
return word_length.length();
    }
}
