import java.util.Scanner;

public class BinaryToDecimal {

    public DecToBin(int no){
        int BinNo = 0;
        while (no>0) {
            BinNo += no%2;
            BinNo *= 10;
            no = no/2;
        }
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal no");
        int BinNo = 0 , no = sc.nextInt();
        BinNo = BinaryToDecimal.DecToBin(no);
        System.out.println("Binary No: "+ BinNo);
    }
}
