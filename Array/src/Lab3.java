public class Lab3 {
    public static void main(String[] args) {
        int [] arr ={10,12,52,89};

        int indexposition =2;
        int [] newArr = new int[arr.length-1];

        int j =0;
        for (int i =0;i<arr.length; i++){
            if(i == indexposition){
                continue;
            }
            newArr[j] = arr[i];
            j++;
        }
        for (int number:newArr){
            System.out.print(number+" ");
        }
    }
}
