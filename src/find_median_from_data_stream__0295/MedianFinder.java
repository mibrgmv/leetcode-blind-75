package find_median_from_data_stream__0295;

import java.util.Comparator;
import java.util.PriorityQueue;

class MedianFinder {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public void addNum(int num) {
        if (maxHeap.isEmpty() || num < maxHeap.peek()) {
            maxHeap.add(num);
        } else {
            minHeap.add(num);
        }

        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.peek());
            maxHeap.poll();
        } else if (minHeap.size() > maxHeap.size()) {
            maxHeap.add(minHeap.peek());
            minHeap.poll();
        }
    }

    public double findMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return (double) (maxHeap.peek() + minHeap.peek()) / 2;
        } else {
            return maxHeap.peek();
        }
    }
}
