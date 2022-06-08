import java.util.List;
import java.util.PriorityQueue;

/**
 * For sorting elements of ArrayList which k away the actual sorted location.
 */
public class KSorting {
    /**
     * This method takes ArrayList, K, and ArrayList Size as input.
     * @param numberList Arraylist of Integer.
     * @param kNear K nearest indices.
     * @return numberList return ArrayList of Integer.
     */
    public List<Integer> kSort(final List<Integer> numberList,
                               final int kNear) {
        final int size = numberList.size();
        //for Min-heap
        PriorityQueue<Integer> priorityQueue;
        priorityQueue = new PriorityQueue<>(numberList.subList(0, (kNear + 1)));
        int indexOfNuberList = 0;
        int indexOfRemaining;
        // for pop in root element of min-heap to re
        for (indexOfRemaining = kNear + 1; indexOfRemaining < size;
             indexOfRemaining++) {
            numberList.set(indexOfNuberList++, priorityQueue.poll());
            priorityQueue.add(numberList.get(indexOfRemaining));
        }
        while (!priorityQueue.isEmpty()) {
            numberList.set(indexOfNuberList++, priorityQueue.poll());
        }
        return numberList;
    }
}


