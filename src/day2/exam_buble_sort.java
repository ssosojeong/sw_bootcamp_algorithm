package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam_buble_sort {
    public static void main(String[] args) throws IOException {

        int[] arr = {8,1,4,2,5,7,6,3};
        int n = arr.length;

        for(int i=0; i<n; i++){
            for(int j=1; j<n; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    printArr(arr);
                }
            }
            System.out.println();
        }
    }
    public static void printArr(int[] arr){
        for(int i:arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
