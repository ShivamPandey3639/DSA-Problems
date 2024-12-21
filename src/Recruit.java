import java.util.*;

 class PowerOfTwoMaxHeap {
    private final int powerOfTwo; // Number of children for each parent (2^powerOfTwo)
    private final int childrenPerNode;
    private final List<Integer> heap;

    public PowerOfTwoMaxHeap(int powerOfTwo) {
        if (powerOfTwo < 0) {
            throw new IllegalArgumentException("powerOfTwo must be non-negative");
        }
        this.powerOfTwo = powerOfTwo;
        this.childrenPerNode = (int) Math.pow(2, powerOfTwo);
        this.heap = new ArrayList<>();
    }

    // Insert a value into the heap
    public void insert(int value) {
        heap.add(value);
        siftUp(heap.size() - 1);
    }

    // Pop the maximum value from the heap
    public int popMax() {
        if (heap.isEmpty()) {
            throw new NoSuchElementException("Heap is empty");
        }

        int max = heap.get(0);
        int lastValue = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, lastValue);
            siftDown(0);
        }
        return max;
    }

    // Sift up to maintain the heap property
    private void siftUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / childrenPerNode;
            if (heap.get(index) <= heap.get(parentIndex)) {
                break;
            }
            Collections.swap(heap, index, parentIndex);
            index = parentIndex;
        }
    }

    // Sift down to maintain the heap property
    private void siftDown(int index) {
        while (true) {
            int largest = index;
            for (int i = 1; i <= childrenPerNode; i++) {
                int childIndex = childrenPerNode * index + i;
                if (childIndex < heap.size() && heap.get(childIndex) > heap.get(largest)) {
                    largest = childIndex;
                }
            }

            if (largest == index) {
                break;
            }

            Collections.swap(heap, index, largest);
            index = largest;
        }
    }

    // Returns the size of the heap
    public int size() {
        return heap.size();
    }

    // Checks if the heap is empty
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public static void main(String[] args) {
        // Example usage
        PowerOfTwoMaxHeap heap = new PowerOfTwoMaxHeap(2); // 4 children per node

        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
        heap.insert(15);
        heap.insert(25);
        heap.insert(30);

        System.out.println("Heap size: " + heap.size());
        while (!heap.isEmpty()) {
            System.out.println("Popped max: " + heap.popMax());
        }
    }
}
