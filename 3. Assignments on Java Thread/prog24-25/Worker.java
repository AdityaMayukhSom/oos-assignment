public class Worker implements Runnable {
    private int start;
    private int end;
    private int target;
    private int[] arr;
    private Answer ans;

    Worker(int[] arr, int target, int start, int end, Answer ans) {
        this.arr = arr;
        this.target = target;
        this.start = start;
        this.end = end;
        this.ans = ans;
    }

    private int binarySearch() {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public void run() {
        int pos = binarySearch();
        if (pos != -1) {
            ans.found(pos);
        }
    }

}
