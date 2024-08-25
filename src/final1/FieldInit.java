package final1;

public class FieldInit {

    static final int CONST_VALUE = 10; //대문자로 하는게 관례
    final int value = 10;

    //value에 이미 값이 들어가 있기 때문에 생성자도 안 됨
    /*public FieldInit(int value) {
        this.value = value;
    }*/
}
