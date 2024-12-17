class MergeSort{



    public static void main(String[] args) {
        
        int arr[] = {9,8,7,6,5,4,3,2,1};
        
        int upperBound = arr.length-1;
        int lowerBound = 0; 
        printArray(arr);
        mergeSort(arr , lowerBound , upperBound);
        printArray(arr);
    }
        
            private static void mergeSort(int[] arr, int lowerBound, int upperBound) {

                int middle = (lowerBound + upperBound)/2;

                if(lowerBound < upperBound){
                    mergeSort(arr, lowerBound, middle );
                    mergeSort(arr, middle+1, upperBound);
                    mearge(arr, lowerBound, middle, upperBound);
                }
            }
                    
            private static void mearge(int[] arr, int lowerBound, int middle, int upperBound) {

                int leftArrayLength  = middle + 1 -lowerBound;
                int rightArrayLength = upperBound - middle;

                int leftArray[] = new int[leftArrayLength];
                int rightArray[] = new int[rightArrayLength];


                for (int i = 0; i< leftArrayLength; i++) {
                    leftArray[i]=arr[lowerBound+i];
                }
                for ( int j = 0; j< rightArrayLength; j++){
                    rightArray[j]=arr[middle+1+j];
                }

                int i = 0;
                int j = 0;
                int k = lowerBound;

                while( i < leftArrayLength && j < rightArrayLength ){
                    if(leftArray[i]< rightArray[j]){
                        arr[k] = leftArray[i];
                        k++;
                        i++;
                    }else{
                        arr[k] = rightArray[j];
                        k++;
                        j++;
                    }
                }

                while(i < leftArrayLength){
                    arr[k] = leftArray[i];
                    k++;
                    i++;
                }

                while(j < rightArrayLength){
                    arr[k] = rightArray[j];
                    k++;
                    j++;
                } 
            }

            public static void printArray(int[] array){
                System.out.print("{ ");
                for (int i : array) {
                    System.out.print( i+", ");
                }
                System.out.println("\b\b }");
            }

}