public class Lab02 {
    public static void main(String[] args) {
        int [] arr={10,56,48,23,47};
        int indexposition = 2;
        int element =100;

        int [] newarr =new int[arr.length+1];
        for (int i=0;i<indexposition;i++){
            newarr[i]= arr[i];
        }
        newarr[indexposition] = element;
        for (int i = indexposition; i <arr.length ; i++) {
            newarr[i+1] = arr[i];
            
        }
        for (int no:newarr){
            System.out.print(no+" ");
        }
    }
}
