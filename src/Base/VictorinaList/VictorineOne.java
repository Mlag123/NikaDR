package Base.VictorinaList;

import Base.Victorina;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VictorineOne extends Victorina {


    public VictorineOne(String title, String[] quest,ImageIcon imageIcon,String text) {
        super(title, quest,imageIcon,text);
    }

    @Override
    public void Action() {
        JComboBox<String> comboBox = getCombobox();
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(comboBox.getSelectedIndex());
            }
        });
    }
}
