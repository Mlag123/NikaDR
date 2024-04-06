package Base;

import Base.VictorinaList.VictorineOne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Arrays;

public class Window extends JFrame {

    private final Dimension dimension = new Dimension(800, 600);
    private final String resources_path = "./Resources/iamges/";
    private final JPanel grid = new JPanel();
    private final JButton test_but = new JButton("тест");
    private final JButton test2 = new JButton("test 2");
    SoundEngine soundEngine = new SoundEngine();

    public Window() throws IOException {
        super("Викторина");


        onDraw();
        test_but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                victorinaFrame("Первая викторина");
                //  soundEngine.setFile("sad_piano.wav");
                //    soundEngine.play();
            }
        });
        test2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                soundEngine.setFile("bah.wav");
                soundEngine.play();
            }
        });
    }
    String[] quest = {
            "утка", "лиса", "кот"
    };
    public void victorinaFrame(String title) {
        new VictorineOne("Первая викторина",quest);
    }

    public ImageIcon getImage(String path) {
        return new ImageIcon(resources_path + path);
    }

    public void onDraw() {
        setSize(dimension);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        grid.add(test_but, "North");
        grid.add(test2, "South");
        add(grid);
    }

    public static void main(String[] args) throws IOException {
        new Window();
    }
}
