import java.util.Scanner;

public class binarySearchModifed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i=0; i<n; i++){
            int x = sc.nextInt();
            array[i] = x;
        }

        int key = sc.nextInt();
        binarySearch(array, key);
    }

    public static void binarySearch(int[] array, int key){
        int left = 0;
        int right = array.length-1;
        while(left+1<right){
            int middle = (left+right)/2;
            if (key<=array[middle]){
                right = middle;
            }
            else{
                left = middle;
            }
        }
        if (key-array[left]==0){
            System.out.println(left);
        }
        else if(array[right]-key == 0){
            System.out.println(right);
        }
    }
}