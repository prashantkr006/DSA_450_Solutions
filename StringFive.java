import java.util.*;

import java.util. HashMap;

import java.util.Map.Entry;

import java.util.Set;

class StringFive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int maxChar = maxOccurenceChar(str);
        if (maxChar - (str.length() - maxChar) == 0) System.out.println("Yes");
        else System.out.println("No");
    }

    static int maxOccurenceChar(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (hm.containsKey(str.charAt(i))) {
                hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
            } else {
                hm.put(str.charAt(i), 1);
            }
        }

        Set<Entry<Character, Integer>> entrySet = hm.entrySet();
        int maxCount = 0;
        for (Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
            }
        }
        return maxCount;
    }
}
