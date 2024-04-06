package Base;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public abstract class Victorina {
    private JComboBox<String> comboBox;
    private String[] quest = {
            "утка", "лиса", "кот"
    };

    public Victorina(String title, String[] quest) {
        this.quest = quest;
        int selected = 0;

        comboBox = new JComboBox<>(quest);
        JPanel grid = new JPanel();
        JFrame frame = new JFrame(title);
        frame.setVisible(true);
        frame.setSize(600, 400);
        frame.setResizable(false);
        grid.add(comboBox, BorderLayout.SOUTH);
        frame.add(grid);
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
