package mysliwy;

import java.awt.EventQueue;
public class Test {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StartFrame();
                System.out.println(Global.aktualnyPoziom.matrix[0][2]);
            }

        });
    }
}