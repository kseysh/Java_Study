package fifth.mission_3;

public class Main {

    public static void main(String[] args) {
        fifth.mission_3.Cat cat = new fifth.mission_3.Cat();
        cat.soundGenerally();
        cat.soundCutely();
        cat.soundAngry();
        System.out.println("hi");
        fifth.mission_3.AngryCat angryCat = new fifth.mission_3.AngryCat();
        angryCat.soundGenerally();
        angryCat.soundCutely();
        angryCat.soundAngry();
    }
}
