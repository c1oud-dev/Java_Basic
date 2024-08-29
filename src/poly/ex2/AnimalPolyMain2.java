package poly.ex2;

//배열과 for문을 사용하여 중복을 제거한 코드
public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        //Animal[] animal = new Animal[]{dog, cat, cow}; 아래와 같은 코드
        Animal[] animalArr = {dog, cat, cow};
        //이제 배열에 Dog, Cat, Cow의 인스턴스가 들어가 있음

        //변하지 않는 부분
        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }
}
//배열은 같은 타입의 데이터를 나열할 수 있다.
//Dog, Cat, Cow는 모두 Animal의 자식이므로 Animal 타입이다.
