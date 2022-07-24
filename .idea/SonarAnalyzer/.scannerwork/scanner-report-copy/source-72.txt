package dsa.dp.buysellstock;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxHeapImpl {
    public static void main(String[] args) {
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((y,x) -> Integer.compare(x.getKey(), y.getKey()));
        maxHeap.offer(new Pair(-2,2));
        maxHeap.offer(new Pair(-2,21));
        maxHeap.offer(new Pair(-2,12));
        maxHeap.offer(new Pair(-1,121));
        maxHeap.offer(new Pair(-2,21));
        System.out.println(maxHeap);
    }
}



class Pair{
    int key, value;

    public Pair(int key, int value){
        this.key = key;
        this.value = value;
    }
    public int getKey(){
        return this.key;
    }
    public int getValue(){
        return this.value;
    }
    public String toString(){
        return "( key : " + key + ", value : "+  value+" )";
    }
}

class sort2DArray{
    public static void main(String[] args) {
        int[][] B = new int[5][2];

        Arrays.sort(B, Comparator.comparingInt(value -> value[0]));

    }
}
