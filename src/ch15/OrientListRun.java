package ch15;
/*
* 객체 배열 선언과 구현
* 기본 자료형 배열은 선언과 동시에 배열의 크기만큼의 메모리가 할당 되지만
* 객체 배열의 경우엔 요소가 되는 객체의 주소가 들어갈 메모리만 할당 되고 각 요소 객체는 생성하여 저장해야함
*
* 객체 배열 복사하기
* System.arrayCopy(src, srcPos, destPos, length) 자바에서 제공되는 배열 복사 메서드
* 얕은 복사
* 객테 주소만 복사되어 한쪽 배열의 요소를 수정하면 같이 수정됨 즉 두 배열이 같은 주소를 가리킴
* */
public class OrientListRun {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];


        for (int i=0; i<library.length; i++){
            library[i] = new Book("태백산맥" + i, "조정래");
        }

        for (int i=0; i<copyLibrary.length; i++){
            //copyLibrary[i] = new Book("태백산맥" + i, "조정래");
            copyLibrary[i] = new Book(); // 깊은 복사
            copyLibrary[i].setAuthor(library[i].getAuthor());
            copyLibrary[i].setTitle(library[i].getTitle());

        }

        //System.arraycopy(library,0,copyLibrary,0,library.length); // 얕은 복사
        for(Book book : library){
            book.showInfo();
        }
        System.out.println("/////////////////////////////");
        library[0].setTitle("changeTitle");
        library[0].setAuthor("changeAuth");
        for(Book book : copyLibrary){
            book.showInfo();
        }

    }
}
