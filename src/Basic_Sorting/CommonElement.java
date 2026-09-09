package Basic_Sorting;
import java.util.ArrayList;
import java.util.Arrays;

public class CommonElement {
    public static void main(String[] args) {
        int[] a={1,2,3,1,1,2,4,2};int al=a.length;
        Arrays.sort(a);
        int[] b={3,1,5,6,71,2,4,102};int bl=b.length;
        Arrays.sort(b);
        ArrayList<Integer> arr=new ArrayList<>();
        int i=0,j=0;
        while(i<al && j<bl){
            if(a[i]==b[j]){
                arr.add(a[i]);
                i++;j++;
            } else if (a[i]<b[j]) {
                i++;
            } else if (a[i]>b[j]) {
                j++;
            }
        }
        System.out.println(arr);
    }
}
