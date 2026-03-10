import java.util.*;

/*
============================================================
Problem Solving & Data Structures with Java

Topics Covered
1. Heaps and Priority Queue
2. Heap Complexity Analysis
3. Top K Frequent Elements
4. Task Scheduler (Minimum time to execute tasks)
5. Sliding Window Maximum
6. Hashing Problems
7. Longest Consecutive Sequence
8. Group Anagrams
9. First Duplicate Element in Array
10. Subarray Sum = K
11. Minimum Window Substring
============================================================
*/

public class Day32_M1_Heaps_Hashing_SlidingWindow_Practice {


    /*
    ============================================================
    Example 1 : Top K Frequent Elements using Heap
    ============================================================
    */

    public static List<Integer> topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums)
            map.put(num, map.getOrDefault(num,0)+1);

        PriorityQueue<Integer> pq =
                new PriorityQueue<>((a,b)->map.get(a)-map.get(b));

        for(int n : map.keySet()){

            pq.add(n);

            if(pq.size()>k)
                pq.poll();
        }

        return new ArrayList<>(pq);
    }



    /*
    ============================================================
    Example 2 : Task Scheduler Problem
    Minimum time required to execute tasks
    ============================================================
    */

    public static int taskScheduler(char[] tasks, int n){

        int[] freq = new int[26];

        for(char c : tasks)
            freq[c-'A']++;

        Arrays.sort(freq);

        int max = freq[25]-1;

        int idle = max*n;

        for(int i=24;i>=0;i--){

            idle -= Math.min(freq[i], max);
        }

        return idle<0 ? tasks.length : tasks.length + idle;
    }



    /*
    ============================================================
    Example 3 : Sliding Window Maximum
    ============================================================
    */

    public static int[] slidingWindowMax(int[] nums, int k){

        Deque<Integer> dq = new LinkedList<>();

        int[] result = new int[nums.length-k+1];

        int index = 0;

        for(int i=0;i<nums.length;i++){

            while(!dq.isEmpty() && dq.peek()<i-k+1)
                dq.poll();

            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i])
                dq.pollLast();

            dq.offer(i);

            if(i>=k-1)
                result[index++] = nums[dq.peek()];
        }

        return result;
    }



    /*
    ============================================================
    Example 4 : Longest Consecutive Sequence
    ============================================================
    */

    public static int longestConsecutive(int[] nums){

        Set<Integer> set = new HashSet<>();

        for(int n : nums)
            set.add(n);

        int longest = 0;

        for(int n : nums){

            if(!set.contains(n-1)){

                int current = n;
                int streak = 1;

                while(set.contains(current+1)){

                    current++;
                    streak++;
                }

                longest = Math.max(longest, streak);
            }
        }

        return longest;
    }



    /*
    ============================================================
    Example 5 : Group Anagrams
    ============================================================
    */

    public static List<List<String>> groupAnagrams(String[] strs){

        Map<String,List<String>> map = new HashMap<>();

        for(String s : strs){

            char[] arr = s.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            map.putIfAbsent(key,new ArrayList<>());

            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }



    /*
    ============================================================
    Example 6 : First Duplicate Element
    ============================================================
    */

    public static int firstDuplicate(int[] nums){

        Set<Integer> set = new HashSet<>();

        for(int n : nums){

            if(set.contains(n))
                return n;

            set.add(n);
        }

        return -1;
    }



    /*
    ============================================================
    Example 7 : Number of Subarrays with Sum = K
    ============================================================
    */

    public static int subarraySum(int[] nums, int k){

        Map<Integer,Integer> map = new HashMap<>();

        map.put(0,1);

        int sum = 0;
        int count = 0;

        for(int n : nums){

            sum += n;

            if(map.containsKey(sum-k))
                count += map.get(sum-k);

            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        return count;
    }



    /*
    ============================================================
    Example 8 : Minimum Window Substring
    ============================================================
    */

    public static String minWindow(String s, String t){

        if(s.length()==0 || t.length()==0)
            return "";

        Map<Character,Integer> map = new HashMap<>();

        for(char c : t.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);

        int left = 0;
        int right = 0;

        int required = map.size();
        int formed = 0;

        Map<Character,Integer> window = new HashMap<>();

        int[] ans = {-1,0,0};

        while(right < s.length()){

            char c = s.charAt(right);

            window.put(c,window.getOrDefault(c,0)+1);

            if(map.containsKey(c) &&
                    window.get(c).intValue()==map.get(c).intValue())
                formed++;

            while(left<=right && formed==required){

                c = s.charAt(left);

                if(ans[0]==-1 || right-left+1 < ans[0]){

                    ans[0] = right-left+1;
                    ans[1] = left;
                    ans[2] = right;
                }

                window.put(c,window.get(c)-1);

                if(map.containsKey(c) &&
                        window.get(c) < map.get(c))
                    formed--;

                left++;
            }

            right++;
        }

        return ans[0]==-1 ? "" :
                s.substring(ans[1], ans[2]+1);
    }



    /*
    ============================================================
    MAIN METHOD
    Running multiple algorithm examples
    ============================================================
    */

    public static void main(String[] args) {

        System.out.println("Day 32 - Heaps, Sliding Window & Hashing Practice");


        // Top K Frequent
        int[] arr = {1,1,1,2,2,3};
        System.out.println("Top K Frequent: " +
                topKFrequent(arr,2));


        // Task Scheduler
        char[] tasks = {'A','A','A','B','B','B'};
        System.out.println("Minimum Time for Task Scheduler: " +
                taskScheduler(tasks,2));


        // Sliding Window Maximum
        int[] nums = {1,3,-1,-3,5,3,6,7};
        System.out.println("Sliding Window Maximum: " +
                Arrays.toString(slidingWindowMax(nums,3)));


        // Longest Consecutive Sequence
        int[] seq = {100,4,200,1,3,2};
        System.out.println("Longest Consecutive Sequence: " +
                longestConsecutive(seq));


        // Group Anagrams
        String[] words = {"eat","tea","tan","ate","nat","bat"};
        System.out.println("Grouped Anagrams: " +
                groupAnagrams(words));


        // First Duplicate
        int[] dup = {2,1,3,5,3,2};
        System.out.println("First Duplicate: " +
                firstDuplicate(dup));


        // Subarray Sum = K
        int[] sub = {1,1,1};
        System.out.println("Subarrays with sum=2: " +
                subarraySum(sub,2));


        // Minimum Window Substring
        System.out.println("Minimum Window: " +
                minWindow("ADOBECODEBANC","ABC"));
    }
}
