class IncertionSort{


    public static void main(String[] args) {
        int []array ={41,58,34,22,18,10,5,1};
        
        printArray(array);
        insertionSort(array);
        printArray(array);
        
    }
    public static void printArray(int[] array){
        System.out.print("{ ");
        for (int i : array) {
            System.out.print( i+", ");
        }
        System.out.println("\b\b }");
    }

    public static void insertionSort( int []array){

        int n = array.length;

        for(int i=1 ; i<n; i++){
            int temp = array[i];
            int j = i-1;

            while(j>=0 && array[j]>temp){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=temp;    
        }
    }
    

    
}