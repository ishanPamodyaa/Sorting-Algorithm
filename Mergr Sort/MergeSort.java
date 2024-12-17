class MergeSort{



    public static void main(String[] args) {
        
        int arr[] = {9,8,7,6,5,4,3,2,1};
        
        int upperBound = arr.length-1;
        int lowerBound = 0; 
        
        mergeSort(arr , lowerBound , upperBound);
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

                int leftArrayLength =  middle + 1 -lowerBound;
                int 
            }

}