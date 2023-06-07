/*
Time complexity is calculated by number of iterations in the loop
iteration 1 n
iteration 2 n/2
iteration 3 n/4
.
.
.
n/2^k=1
n=2^k
k=logn


O(log n) Time complexity of binary search

Time complexity of binary search is better than linear search and is also faster
 */



public class binary_search {
    public static int Binary(int number[], int key) {
        int start = 0, end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (number[mid] == key) {
                return mid;
            }

            if (number[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = {1, 3, 5, 7, 9, 13, 15, 17, 19};
        int key = 15;

        System.out.println("Index for key is: " + Binary(number, key));
    }
}
