package construct.ex;

public class Book {
    String title; //제목
    String author; //저자
    int page; //페이지 수

    //TODO 코드를 완성하세요.
    void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }
    //기본 생성자 생성해야 함
    //이미 개발자가 생성자를 생성했기 때문에 기본 생성자 작성해줘야 함
    Book() {
        this("", "", 0); //0 생략 가능
        /*this.title = " ";
        this.author = " ";
        this.page = 0;*/
    }
    Book(String title, String author) {
        this(title, author, 0);
    }
    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
        //this()를 사용하면 에러가 난다. 이유는?
        //아마 중복 오류 때문에 그러는 듯
        //page가 생략된 생성자에서 매개변수 3개를 넣은 생성자를 또 호출하기 때문에.
        //아아!! 완벽 이해.
        //자기 자신의 인스턴스를 호출한다고 했으니깐, 매개변수 3개가 있는 생성자를 호출하는 거임
        //따라서 이 생성자는 this.title 등 이라고 해줘야 함.
    }

}
