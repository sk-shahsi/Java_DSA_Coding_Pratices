public class Lab06 {
    public static void main(String[] args) {
        int arr [] ={1,2,45,86,79,2,9};
        int count=0;
        for (int number:arr){
            if(number % 2 ==0){
                count ++;
                System.out.println("EvenNumber "+number+ " count "+count);
            }
            else {
                System.out.println("Odd Number"+number+" count"+ count);
            }
        }
    }
}
