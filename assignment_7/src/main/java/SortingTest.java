public class SortingTest {
    public static void main(String[] args) {
        Bubblesort b = new Bubblesort();
        Selectionsort s = new Selectionsort();
        Mergesort m = new Mergesort();
        int[] i1 = {5,2,9,1,7};
        int[] i2 = {8,3,6,4,2};
        int[] i3= {10,6,3,8,1};

        Sorter st = new Sorter();
        st.sort(b,i1);
        st.sort(m,i2);
        st.sort(s,i3);
    }
}
