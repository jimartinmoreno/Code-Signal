package codesignal.interview.hashTables;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ContainsCloseNums {

   static boolean solution(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get(nums[i]);
            if (index != null && Math.abs(index - i) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

    static boolean solution3(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) map.put(nums[i], i);
            else if (Math.abs(map.get(nums[i]) - i) <= k) return true;
            else map.put(nums[i], i);
        }
        return false;

    }
}
