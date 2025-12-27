public class Lab05 {
    public static void main(String[] args) {
        int target = 16;
        int []arr = {9, 7, 16, 16, 4};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                System.out.println(i);
            }

        }
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum  +=  arr[i];

        }
        System.out.println(sum);

    }
    }

