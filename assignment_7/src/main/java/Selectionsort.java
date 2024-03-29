public class Selectionsort implements Sortable{
    public static void main(String[] args) {
        int[] arr= {8,3,6,4,2};
        Selectionsort s = new Selectionsort();
        s.sort(arr);
    }
    public void sort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min_index = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index])
                    min_index=j;
            }
            int temp = arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
