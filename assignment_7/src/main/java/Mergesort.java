public class Mergesort implements Sortable{
    public static void main(String[] args) {
        int[] arr= {10,6,3,8,1};
        Mergesort m = new Mergesort();
        m.sort(arr);
    }
    public void sort(int[] arr){
        int l=0;
        int r=arr.length-1;
        srted(arr,l,r);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static void srted(int arr[],int l,int r){
        if (l < r) {

            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            srted(arr, l, m);
            srted(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
    static void merge(int[] arr,int l,int m,int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R= new int[n2];

        for(int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for(int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

}
