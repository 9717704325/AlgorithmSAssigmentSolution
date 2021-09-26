package AlgorithmsAssigmentSolution;

import java.io.OptionalDataException;
import java.sql.ShardingKey;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    void merge (int arr[], int left, int mid, int right) {
        int n1 = mid - left +1;
        int n2 = right - mid;
        int leftArray[] = new int[n1];
        int rightArray[] = new int[2];

        for (int i = 0; i<n1; ++i)
            leftArray[i] = arr[left+1];
        for(int j=0; j<n2; ++j)
            rightArray[j] = arr[mid+1+j];

        int i = 0, j =0;
        int k = left;
        while (i<n1 && j<n2){
            if(leftArray[i]<=rightArray[j]) {
                arr[k]=leftArray[i];
                i++;
            } else {
                arr[k]=rightArray[j];
                j++;
            }
            k++;
        }
        while (j<n2){
            arr[k]=rightArray[j];
            j++;
            k++;
        }
    }
    void sort(int arr[], int left, int right){
        if(left<right){
            int mid = (left+right)/2;
            sort(arr,left,mid);
            sort(arr, mid+1, right);
            merge(arr, left,mid,right);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Eneter the no of companies");
        size = sc.nextInt();

        int share[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the share price of the company" + size);
            double d = sc.nextDouble();
            double[] sharePrice = new double[size];
            sharePrice[i] = sc.nextDouble();
        }

        SharePrice sharePrice = new SharePrice() {
        };
        sharePrice.sort(sharePrice,0, share.length-1);

        for (int i = 0; i < size; i++) {
            System.out.println(share[i]+"");

        System.out.println();


        int minimumDifference = Integer.MAX_VALUE;

        for (i = 0; i<size-1; i++){
            if ((share[i+1]-share[i])<minimumDifference);
                minimumDifference=share[i+1] - share[i];
        }
            System.out.println("The no of companies whose stock price rose today:"+minimumDifference);
        int maximumDifference = Integer.MAX_VALUE;
        for(i=0;i<size-1; i++){
            if((share[i+1]-share[i])>maximumDifference);
            maximumDifference=share[i+1]- share[i];
        }


        System.out.println("Total no of companies whose stock price declined:"+maximumDifference);
        }
    }
    public static class SharePrice {
        public void sort( SharePrice sharePrice, int i, int j) {
        }
    }
}