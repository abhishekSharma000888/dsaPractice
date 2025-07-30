package practice29;

public class DuplicateOccurenceOfElements {

    //print indices of duplicate elements
    public static void main(String[] args) {

        //find indices of duplicate elements
        int[] arr={1,1,4,5,7,4,6,1};

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println("The element: "+ arr[i] + " occured at: "+ i + j);
                }
            }
        }


    }
}
