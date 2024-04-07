package Base;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public abstract class Victorina {
    private JComboBox<String> comboBox;
    private String text;
    private JLabel image = new JLabel();
    private String[] quest = {
            "утка", "лиса", "кот"
    };

    public Victorina(String title, String[] quest, ImageIcon imageIcon, String text) {
        this.quest = quest;
        this.text = text;
        int selected = 0;
        image = new JLabel(imageIcon);
        comboBox = new JComboBox<>(quest);
        JPanel grid = new JPanel();
        JFrame frame = new JFrame(title);
        frame.setVisible(true);
        frame.setSize(600, 400);
        frame.setResizable(false);
        grid.add(new JLabel(text));
        grid.add(comboBox, BorderLayout.SOUTH);
        grid.add(image);


        frame.add(grid);

        frame.pack();
        Action();


    }

    public JComboBox<String> getCombobox() {
        return comboBox;
    }

    public void Action() {
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = (String) comboBox.getSelectedItem();
                if (a.equalsIgnoreCase(quest[0])) {
                    System.out.println("утка");
                } else if (a.equalsIgnoreCase(quest[1])) {
                    System.out.println("лиса");
                } else if (a.equalsIgnoreCase(quest[2])) {
                    System.out.println("кот");
                }
            }
        });
    }
}
