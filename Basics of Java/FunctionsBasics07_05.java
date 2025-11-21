
public class FunctionsBasics07_05 {
    public static void BintoDec(int BinNum){
        int myNum = BinNum;
        int pow = 0;
        int decNum = 0;
        while(BinNum > 0){
            int lastDigit = BinNum % 10; //to extract the last digit
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            BinNum = BinNum / 10; //to remove the last digit;
        }
        System.out.println("Decimal of "+myNum+" is = "+decNum);


    }
    public static void main(String args[]){
        BintoDec(101001110);
        
    }
}
