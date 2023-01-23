package dsa;
import java.util.*;

public class WordBreak {
    static List<String> wordBreak(String s, Set<String> dict) {
        List<String> dp[] = new ArrayList[s.length()+1];
        dp[0] = new ArrayList<String>();
        for(int i=0;i<s.length();i++) {
            if(dp[i] == null) {
                continue;
            }
            for(String word: dict) {
                int len = word.length();
                int end = i + len;
                if(end > s.length()) {
                    continue;
                }
                if(s.substring(i,end).equals(word)) {
                    if(dp[end] == null) {
                        dp[end] = new ArrayList<String>();
                    }
                    dp[end].add(word);
                }
            }
        }
        List<String> result = new LinkedList<String>();
        if(dp[s.length()] == null) {
            return result;
        }
        ArrayList<String> temp = new ArrayList<String>();
        return result;
    }

    public static void main(String[] args) {
        String s = "catsanddog";
        Set<String> dict = new HashSet<>();
        dict.add("cat");
        dict.add("cats");
        dict.add("and");
        dict.add("sand");
        dict.add("dog");
        System.out.println(wordBreak("catsanddog",dict));
    }
}
