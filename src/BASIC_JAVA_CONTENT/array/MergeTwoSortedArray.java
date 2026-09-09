package BASIC_JAVA_CONTENT.array;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7}, arr2 = {2, 4, 6, 8, 10, 12};
        int[] arr3=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length && j< arr2.length){
            arr3[k++]=(arr1[i]<arr2[j])?arr1[i++]:arr2[j++];
        }
        while(i<arr1.length)arr3[k++]=arr1[i++];
        while(j<arr2.length)arr3[k++]=arr2[j++];
        for(int ele:arr3){
            System.out.print(ele+ " ");
        }
        System.out.println();

    }
}
