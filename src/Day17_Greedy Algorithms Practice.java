import java.util.*;

/*
============================================================
Problem Solving & Data Structures with Java

Topics Covered
1. Greedy Programming Concept
2. Activity Selection Problem
3. Fractional Knapsack Problem
4. Huffman Coding
5. Prim's Algorithm (Minimum Spanning Tree)
6. Job Scheduling with Deadlines
============================================================
*/

public class Day31_M1_GreedyAlgorithms_Practice {

    /*
    ============================================================
    Example 1 : Activity Selection Problem
    Select maximum number of activities that don't overlap
    ============================================================
    */

    static void activitySelection(int start[], int finish[]) {

        int n = start.length;

        System.out.println("\nSelected Activities:");

        int i = 0;
        System.out.println("Activity: " + i);

        for (int j = 1; j < n; j++) {

            if (start[j] >= finish[i]) {

                System.out.println("Activity: " + j);

                i = j;
            }
        }
    }



    /*
    ============================================================
    Example 2 : Fractional Knapsack Problem
    Greedy approach using value/weight ratio
    ============================================================
    */

    static class Item {

        int value;
        int weight;

        Item(int v, int w) {
            value = v;
            weight = w;
        }
    }

    static double fractionalKnapsack(int capacity, Item arr[]) {

        Arrays.sort(arr, (a, b) ->
                Double.compare((double)b.value/b.weight,
                               (double)a.value/a.weight));

        double totalValue = 0;

        for (Item item : arr) {

            if (capacity >= item.weight) {

                capacity -= item.weight;
                totalValue += item.value;
            }
            else {

                totalValue += item.value *
                        ((double) capacity / item.weight);

                break;
            }
        }

        return totalValue;
    }



    /*
    ============================================================
    Example 3 : Huffman Coding
    Used in data compression
    ============================================================
    */

    static class HuffmanNode {

        int freq;
        char ch;
        HuffmanNode left, right;
    }

    static class MyComparator implements Comparator<HuffmanNode> {

        public int compare(HuffmanNode x, HuffmanNode y) {
            return x.freq - y.freq;
        }
    }

    static void printCode(HuffmanNode root, String s) {

        if (root.left == null && root.right == null) {

            System.out.println(root.ch + " : " + s);
            return;
        }

        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }



    /*
    ============================================================
    Example 4 : Prim's Algorithm
    Minimum Spanning Tree
    ============================================================
    */

    static int primMST(int graph[][]) {

        int V = graph.length;

        int key[] = new int[V];
        boolean mstSet[] = new boolean[V];

        Arrays.fill(key, Integer.MAX_VALUE);

        key[0] = 0;

        int result = 0;

        for (int i = 0; i < V; i++) {

            int u = -1;

            for (int v = 0; v < V; v++) {

                if (!mstSet[v] &&
                        (u == -1 || key[v] < key[u]))
                    u = v;
            }

            mstSet[u] = true;

            result += key[u];

            for (int v = 0; v < V; v++) {

                if (graph[u][v] != 0 &&
                        !mstSet[v] &&
                        graph[u][v] < key[v]) {

                    key[v] = graph[u][v];
                }
            }
        }

        return result;
    }



    /*
    ============================================================
    Example 5 : Job Scheduling with Deadlines
    ============================================================
    */

    static class Job {

        int id, deadline, profit;

        Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    static void jobScheduling(Job arr[]) {

        Arrays.sort(arr, (a,b) -> b.profit - a.profit);

        int n = arr.length;

        boolean slot[] = new boolean[n];
        int result[] = new int[n];

        for (int i = 0; i < n; i++) {

            for (int j = Math.min(n, arr[i].deadline) - 1; j >= 0; j--) {

                if (!slot[j]) {

                    slot[j] = true;
                    result[j] = arr[i].id;

                    break;
                }
            }
        }

        System.out.println("\nScheduled Jobs:");

        for (int i = 0; i < n; i++) {

            if (slot[i])
                System.out.print(result[i] + " ");
        }
    }



    /*
    ============================================================
    MAIN METHOD
    Running all algorithms
    ============================================================
    */

    public static void main(String[] args) {

        System.out.println("Day 31 - Greedy Algorithms Practice");


        // Activity Selection Example
        int start[] = {1,3,0,5,8,5};
        int finish[] = {2,4,6,7,9,9};

        activitySelection(start, finish);


        // Fractional Knapsack Example
        Item items[] = {
                new Item(60,10),
                new Item(100,20),
                new Item(120,30)
        };

        System.out.println("\nMaximum Knapsack Value: " +
                fractionalKnapsack(50, items));


        // Huffman Coding Example
        char charArray[] = {'a','b','c','d','e','f'};
        int charfreq[] = {5,9,12,13,16,45};

        PriorityQueue<HuffmanNode> pq =
                new PriorityQueue<>(new MyComparator());

        for (int i = 0; i < charArray.length; i++) {

            HuffmanNode node = new HuffmanNode();

            node.ch = charArray[i];
            node.freq = charfreq[i];

            pq.add(node);
        }

        HuffmanNode root = null;

        while (pq.size() > 1) {

            HuffmanNode x = pq.poll();
            HuffmanNode y = pq.poll();

            HuffmanNode f = new HuffmanNode();

            f.freq = x.freq + y.freq;

            f.left = x;
            f.right = y;

            root = f;

            pq.add(f);
        }

        System.out.println("\nHuffman Codes:");
        printCode(root, "");


        // Prim's Algorithm Example
        int graph[][] = {
                {0,2,0,6,0},
                {2,0,3,8,5},
                {0,3,0,0,7},
                {6,8,0,0,9},
                {0,5,7,9,0}
        };

        System.out.println("\nMinimum Spanning Tree Cost: " +
                primMST(graph));


        // Job Scheduling Example
        Job jobs[] = {
                new Job(1,2,100),
                new Job(2,1,19),
                new Job(3,2,27),
                new Job(4,1,25),
                new Job(5,3,15)
        };

        jobScheduling(jobs);
    }
}
