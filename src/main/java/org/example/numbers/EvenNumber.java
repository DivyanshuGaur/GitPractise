package org.example.numbers;

public class EvenNumber {
    public boolean checkEven(int ipNum){
            return ipNum%2==0;
    }
    public static void main(String[] args) {
        EvenNumber num = new EvenNumber();
        boolean response=num.checkEven(12);
        System.out.println(response);
    }
}
