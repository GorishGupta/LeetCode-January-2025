import java.util.*;
public class DS2948 {
    class Solution {

        public int[] lexicographicallySmallestArray(int[] nums, int limit) {
            int[] numsSorted = new int[nums.length];
            for (int i = 0; i < nums.length; i++) numsSorted[i] = nums[i];
            Arrays.sort(numsSorted);
    
            int currGroup = 0;
            HashMap<Integer, Integer> numToGroup = new HashMap<>();
            numToGroup.put(numsSorted[0], currGroup);
    
            HashMap<Integer, LinkedList<Integer>> groupToList = new HashMap<>();
            groupToList.put(
                currGroup,
                new LinkedList<Integer>(Arrays.asList(numsSorted[0]))
            );
    
            for (int i = 1; i < nums.length; i++) {
                if (Math.abs(numsSorted[i] - numsSorted[i - 1]) > limit) {
                    // new group
                    currGroup++;
                }
    
                // assign current element to group
                numToGroup.put(numsSorted[i], currGroup);
    
                // add element to sorted group list
                if (!groupToList.containsKey(currGroup)) {
                    groupToList.put(currGroup, new LinkedList<Integer>());
                }
                groupToList.get(currGroup).add(numsSorted[i]);
            }
    
            // iterate through input and overwrite each element with the next element in its corresponding group
            for (int i = 0; i < nums.length; i++) {
                int num = nums[i];
                int group = numToGroup.get(num);
                nums[i] = groupToList.get(group).pop();
            }
    
            return nums;
        }
    }
    public static void main(String[] args) {
        DS2948 d = new DS2948();
        DS2948.Solution s = d.new Solution();
        int[] nums = {1, 2, 3, 4, 5};
        int limit = 1;
        System.out.println(Arrays.toString(s.lexicographicallySmallestArray(nums, limit))); // [1, 2, 3, 4, 5]
        nums = new int[] {1, 2, 3, 4, 5};
        limit = 2;
        System.out.println(Arrays.toString(s.lexicographicallySmallestArray(nums, limit))); // [1, 3, 2, 5, 4]
        nums = new int[] {1, 2, 3, 4, 5};
        limit = 3;
        System.out.println(Arrays.toString(s.lexicographicallySmallestArray(nums, limit))); // [1, 4, 2, 5, 3]
    }
}
