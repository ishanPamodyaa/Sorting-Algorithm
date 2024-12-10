class BubleSort{


    public static void main(String[] args) {
        
        int array [] = {24,8,10,20,33,29,9,5,2};
        
        printArray(array);

        bubleSort(array);

        printArray(array);

    }

    public static void printArray(int[] array){
        System.out.print("{ ");
        for (int i : array) {
            System.out.print( i+", ");
        }
        System.out.println("\b\b }");
    }


    public static void  bubleSort(int[] array){

        int n = array.length;
        for(int i = 0; i < n-1 ; i++ ){
            for(int j = 0; j < n-1-i ; j++ ){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

    }
}