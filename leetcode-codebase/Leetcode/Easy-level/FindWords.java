//Leetcode-1160
//we have an array of strings where each element contain the word now we have on chars variable 
//as another parameter and now we have to look by using this chars can we able to make such word which are  available in the strings.
class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charCount = new int[26];
        int result = 0 ;
       
       for(char ch : chars.toCharArray()){
            charCount[ch-'a']++;
       } 
       //["cat","bt","hat","tree"], cat
       for(String word : words){
        int[] wordCount = new int[26]; // aabced
        boolean flag =true ;
        for(char ch : word.toCharArray()){
        wordCount[ch-'a']++;
        if(wordCount[ch-'a'] > charCount[ch -'a']){
            flag=false;
            break;
            }
        }
        if(flag){
            result+=word.length();
        }
       }
       return result;
    }
}
