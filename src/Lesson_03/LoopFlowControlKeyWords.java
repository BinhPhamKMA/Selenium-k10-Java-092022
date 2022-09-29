package Lesson_03;

public class LoopFlowControlKeyWords {
    public static void main(String[] args) {
        for (int number = 0; number < 5; number++) {
            if (number == 3) continue;
            ///if (number == 3) break; Thoat ra khoi vong lap
            System.out.println(number);

        }
    }
}
