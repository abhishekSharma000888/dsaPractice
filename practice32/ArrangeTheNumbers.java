package practice32;

public class ArrangeTheNumbers {

    public static void main(String[] args) {

        int[] arr = {-10,2,-1,3,10,1};

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println("The array elements after rotation are: ");

        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}
