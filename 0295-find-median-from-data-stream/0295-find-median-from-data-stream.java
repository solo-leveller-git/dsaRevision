class MedianFinder {

    PriorityQueue<Integer> pq;
    PriorityQueue<Integer> pq1;

    public MedianFinder() {

        pq = new PriorityQueue<>((a, b) -> b - a);
        pq1 = new PriorityQueue<>();
    }

    public void addNum(int num) {
        pq.add(num);

        pq1.add(pq.poll());

        if (pq1.size() > pq.size()) {

            pq.add(pq1.poll());
        }
    }

    public double findMedian() {

        if (pq.size() != pq1.size()) {

            return pq.peek();
        }
        else {

            int first = pq.peek();
            int second = pq1.peek();

            return (first + second) / 2.0;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna