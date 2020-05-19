public class Mergesort {
    private int[] data;

    public Mergesort(int n) {
        this.data = new int[n];
    }

    public void setData(int index, int value) {
        if (index >= 0 && index < this.data.length) {
            this.data[index] = value;
        }
    }

    public void printData() {
        String out = "Data Array = ";
        for (int a= 0; a<this.data.length; a++) {
            out += this.data[a] + ", ";
        }
        System.out.println(out);
    }

    public void Sort() {
        int i = 0;
        int j = this.data.length -1;

        Mergesort(i,j);
    }

    private void Mergesort(int start, int end) {
        int n = (end - start + 1);

        if (n > 1) {
            int mid = (start + end) / 2;

            Mergesort(start, mid);
            Mergesort(mid + 1, end);

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

            for (int a = 0; a < n; a++) {
                this.data[start + a] = temp[a];
            }
        }
    }

    private void ort(int start, int mid) {
    }


    public static void main(String[] args) {
        Mergesort ms = new Mergesort(13);

        ms.setData(0, 82);
        ms.setData(1, 12);
        ms.setData(2, 41);
        ms.setData(3, 38);
        ms.setData(4, 19);
        ms.setData(5, 26);
        ms.setData(6, 9);
        ms.setData(7, 48);
        ms.setData(8, 20);
        ms.setData(9, 55);
        ms.setData(10, 8);
        ms.setData(11, 32);
        ms.setData(12, 3);

        ms.printData();
        ms.Sort();
        ms.printData();
    }
}