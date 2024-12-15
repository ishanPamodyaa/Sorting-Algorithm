public class QuickSort{

    public static int partion( int arr[] , int lb , int ub){

        int pivot = arr[lb];
        int start = lb;
        int end = ub;

        while(start < end){
            while ( arr[start] <= pivot && start < ub){
                start++; 
            }
            while (arr[end] > pivot && end > lb){
                end--;
            }
            if(start < end){

                int temp  = arr[end];
                arr[end]  = arr[start];
                arr[start]= temp;
            }

        } 

        int temp = arr[end];
        arr[end] = arr[lb];
        arr[lb] = temp;

        return end;
    }



    public static void quickSort(int arr[] ,int lb ,int ub){

        if(lb<ub){

            int loc = partion(arr , lb ,ub);
            quickSort(arr, lb, loc-1);
            quickSort(arr, loc+1, ub);
        }

    }


    public static void printArray(int[] array){
        System.out.print("{ ");
        for (int i : array) {
            System.out.print( i+", ");
        }
        System.out.println("\b\b }");
    }


    public static void main(String[] args) {
        int arr[] = {7,11,14,6,9,4,3,12};

        int ub = arr.length-1;
        int lb = 0;
        
        printArray(arr);

        quickSort(arr,lb,ub);

        printArray(arr);

    }


}