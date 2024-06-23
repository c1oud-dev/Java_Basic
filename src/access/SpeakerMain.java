package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        //필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
        //speaker.volume = 200;
        speaker.showVolume();
        //의도적으로 200으로 맞춰서 값을 설정했지만
        //이건 사실 외부에서 접근한 것이기 때문에 외부 접근을 막을 필요가 있다.
        //volume을 private으로 설정하면 speaker.volume = 200에서 에러가 난다.
    }
}
