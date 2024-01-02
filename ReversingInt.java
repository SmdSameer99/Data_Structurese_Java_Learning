import java.util.Random;

public class ReversingInt {

    public static int Rev(int no){
        System.out.print(no+" : ");
        int temp=0;
        while (no!=0) {
            temp *= 10;
            temp += no%10;
            
            no = no/10;
        }
        return (temp);
    }

    public static void main(String[] args) throws InterruptedException {

        Random rand = new Random();
        int HowManyTimes = 100;
        while (HowManyTimes>0) {

            System.out.println(ReversingInt.Rev(rand.nextInt(100000)));
            
            Thread.sleep(200);

            HowManyTimes--;
        }
       
    }
}
