package org.example.numbers;

public class OddNumber {
    public boolean checkOdd(int ipNum){
        return ipNum%2==1;
    }
    public static void main(String[] args) {
        OddNumber num = new OddNumber();
        boolean response=num.checkOdd(12);
        System.out.println(response);
    }
}
