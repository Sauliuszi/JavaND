package bandymai;

import java.awt.*;

public class Bandymas {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            Color color = Math.random() < 0.25 ? Color.BLACK : Color.WHITE;

            if (color == Color.WHITE && Math.random() < 0.5) {
                color = Color.RED;
            }

            System.out.println(color);
        }
    }
}
