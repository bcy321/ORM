package ch14;
/*
* 배열
* 동일한 자료형의 순차적 자료구조
* 인덱스 연산자[]를 이용하여 빠른 참조가 가능
* 물리적 위치와 논리적위치 동일
* 배열의 순서는 0부터 시작
* 자바에서는 객체 배열을 구현한 ArrayList를 많이 활용함
* */
public class ArrayRunTest {
    public static void main(String[] args) {
        int[] list = new int[10];
        int total = 0;
        for(int i=0;i<list.length;i++){
            list[i] += (i+1);
        }
        for(int i : list){
           total += i;
        }
        System.out.println(total);
        ///////////////////////////////
        char[] alphabets = new char[26];
        char ch = 'A';
        for (int i=0; i<alphabets.length; i++){
            alphabets[i] = ch++;
        }

        for(char alpha : alphabets){
            System.out.println(alpha);
        }
    }
}
