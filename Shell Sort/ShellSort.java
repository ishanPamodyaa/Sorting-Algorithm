package Shell_sort;
public class ShellSort{


    public static void main(String[] args) {
        int array [] = {24,8,10,20,33,29,9,5,2};
        System.out.print("Before sorting : ");
        for (int i : array) {
            System.out.print(" "+ i);           
        }

        System.out.println();
        shellSort(array);

        System.out.print("After sorting : ");
        for (int i : array) {
            System.out.print(" "+ i);           
        }
        
    
    }

    public static void shellSort(int[] array) {

        int n = array.length;
        for (int gap=n/2; gap>=1; gap/=2){
            for(int j=gap ; j<n; j++){
                for(int i=j-gap; i>=0; i-=gap){
                    if(array[i]>array[i+ gap]){
                        int temp = array[i];
                        array[i]=array[i + gap];
                        array[i+gap]=temp;
                    
                    }else{
                        break;
                    }
                }
            }
        }
    }    
}



