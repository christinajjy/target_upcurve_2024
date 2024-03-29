public class Bubblesort implements Sortable {

    public static void main(String[] args) {
        int[] arr= {5,2,9,1,7};
        Bubblesort b = new Bubblesort();
        b.sort(arr);

    }
    public void sort(int[] arr){
        int n=arr.length;
        int temp;
        //boolean s;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int k:arr){
            System.out.print(k+" ");
        }
        System.out.println();
    }
}
