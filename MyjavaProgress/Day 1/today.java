public class today{
    public static void main(String[] args){
        int [] num = {90,88,95,66};
        int largest = num[0];
        for(int i=0; i<num.length;i++){
            if(num[i]>largest){
                largest = num[i];

            }
        }System.out.println(largest);
    }
}