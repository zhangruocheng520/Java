public class Chu {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<=10;i++){
            sum+=i;
            if (sum>20){
                System.out.println(i);
                break;
            }


        }
    }
}
