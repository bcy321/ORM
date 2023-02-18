package ch17;

import java.util.ArrayList;

/*
* 객체 배열을 구현한 클래스 ArrayList
* java.util 패키지에서 제공
* boolean add(E e) 요소 하나를 배열에 추가 합니다. E 는 자료형
* int size() 배열의 추가된 요소 전체 개수를 반환
* E get(int index) 배열의 index 위ㅣ에 있는 요소 값을 반환 합니다.
* E remove(int index) 배열의 index 위치에 있는 요소 값을 제거하고 그 값을 반환합니다.
* boolean isEmpty() 배열이 비어 있는지 확인 합니다.
* */
public class ArrayListRun {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();
        library.add(new Book("1","kim"));
        library.add(new Book("2","kim"));
        library.add(new Book("3","kim"));
        library.add(new Book("4","kim"));
//        for (int i = 0; i<library.size(); i++){
//            library.get(i).showInfo();
//        }
        for (Book book : library){
            book.showInfo();
        }
    }
}
