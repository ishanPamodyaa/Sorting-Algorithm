class SelectionSort {

    
    public static void main(String[] args) {
      
        int [] array = {7,4,5,9,8,2,1};

        printArray(array);

        selectionSort(array);

        printArray(array);

        
    }
    public static void printArray(int[] array){
        System.out.print("{ ");
        for (int i : array) {
            System.out.print( i+", ");
        }
        System.out.println("\b\b }");
    }

    public static void selectionSort(int[] array){

        int n = array.length;
        
        for(int i = 0 ; i <n-1 ; i++){
            int min = i;
            for(int j = i+1; j<n; j++){

                if(array[min]>array[j]){
                    min =j;
                    int temp = array[i];
                    array[i]=array[min];
                    array[min]=temp;
                }
            }
        
        }
    }

}