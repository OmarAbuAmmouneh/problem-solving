//https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroupAnagram {


    public static List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> list = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            boolean isAdded = false;
            if (i == 0) {
                ArrayList<String> l = new ArrayList<>();
                l.add(strs[i]);
                list.add(l);
            }
            else {
                for (int j = 0; j < list.size(); j++) {
                    Object[] arr = list.get(j).toArray();
                    boolean isAnagram = isAnagram(arr[0].toString(), strs[i]);
                    if (isAnagram) {
                        list.get(j).add(strs[i]);
                        isAdded = true;
                        break;
                    }
                }
                if (!isAdded) {
                    ArrayList<String> l = new ArrayList<>();
                    l.add(strs[i]);
                    list.add(l);
                }
            }
        }
        return list;
    }
    static boolean isAnagram(String s, String t) {
        if (t.length() != s.length()) return false;
        StringBuilder sb = new StringBuilder(t);

        for (int i = 0; i < s.length(); i++) {
            String str = String.valueOf(s.charAt(i));
            int index = sb.indexOf(str);
            if (index != -1) {
                sb.deleteCharAt(index);
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String a = "anagram";
        String b = "nagaram";
        String[] s = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ret = groupAnagrams(s);
    }
}
