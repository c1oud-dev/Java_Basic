package poly.ex2;

//배열과 메서드 모두 활용
public class AnimalPolyMain3 {
    public static void main(String[] args) {
        Animal[] animalArr = {new Dog(), new Cat(), new Cow()};
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }
    //동물이 추가 되어도 변하지 않는 코드
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
/**
 * 남은 문제
 * 1. Animal 클래스를 생성할 수 있는 문제
 * 2. Animal 클래스를 상속 받는 곳에서 sound() 메서드 오버라이딩 하지 않을 가능성
 *남은 문제를 해결하기 위해서 추상 클래스와 추상 메서드를 사용
 */

