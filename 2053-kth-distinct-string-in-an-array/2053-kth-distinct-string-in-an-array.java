import java.util.*;

class Solution {
    public String kthDistinct(String[] arr, int k) {
        List<String> list = new ArrayList<>(Arrays.stream(arr).toList());
        List<String> distinct = list.stream()
        .filter(e -> Collections.frequency(list, e) == 1).toList();
        int size = distinct.size();
        if (size < k) {
            return "";
        }
        return distinct.get(k - 1);
    }
}