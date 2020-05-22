package ch07;

public class MergeSort {
  

    // Data Array yang akan diurutkan
    private int[] data = {1,3,3,8,5,3,6};

    // Method Print
    private void printData() {
        StringBuilder out = new StringBuilder("Data Array = ");
        for (int datum : this.data) {
            out.append(datum).append(", ");
        }
        System.out.println(out);
    }

    private void Sort() {
        int i = 0;
        int j = this.data.length -1;

        mergeSort(i,j);
    }

    private void mergeSort(int start, int end) {
        int n = (end - start + 1);

        if (n > 1) {
            int mid = (start + end) / 2;

            mergeSort(start, mid);
            mergeSort(mid + 1, end);

            int[] temp = new int[n];
            int x = start;
            int y = mid + 1;

            for (int a = 0; a < n; a++) {
                if (x <= mid && y <= end) {
                    if (this.data[x] < this.data[y]) {
                        temp[a] = this.data[x];
                        x++;
                    } else {
                        temp[a] = this.data[y];
                        y++;
                    }
                } else  if (x <= mid) {
                    temp[a] = this.data[x];
                    x++;
                } else {
                    temp[a] = this.data[y];
                    y++;
                }
            }

            System.arraycopy(temp, 0, this.data, start, n);
        }
    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        ms.printData();
        ms.Sort();
        ms.printData();
    }
}