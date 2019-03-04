public class MergeSort implements SortingAlgorithm {
    public void sort(int[] a){
        sort(a, a.length);
    }
    public void sort(int [] a, int n){
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        sort(l, mid);
        sort(r, n - mid);

        merge(a, l, r);
    }
    public void merge(int[] a, int[] left, int[] right){
        int ai=0;
        int lefti=0;
        int righti=0;
        while(lefti<left.length && righti<right.length){
            if(left[lefti]<=right[righti]){
                a[ai]=left[lefti];
                ai++;
                lefti++;
            }
            else{
                a[ai]=right[righti];
                ai++;
                righti++;
            }
        }
        while(lefti<left.length){
            a[ai++]=left[lefti++];
        }
        while(righti<right.length){
            a[ai++]=right[righti++];
        }

    }
}
