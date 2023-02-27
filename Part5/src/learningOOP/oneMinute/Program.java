package learningOOP.oneMinute;

import static java.lang.Thread.*;

public class Program {
    public static void main(String[] args) {
        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();
        }
    }
}
