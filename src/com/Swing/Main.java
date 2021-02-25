package com.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    static boolean click = false;

    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        // создаем окно и панель для него
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

        // создаем кнопку и добавляем её на панель
        JButton jButton = new JButton("Нажми меня");
        jPanel.add(jButton);

        //действие по нажатию
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click==false) {
                    click=true;
                    jPanel.setBackground(Color.BLUE); // меняем цвет панели
                }else {
                    click=false;
                    jPanel.setBackground(Color.RED);
                }
            }
        });
    }

    static JFrame getFrame(){
        JFrame jFrame = new JFrame(){};//наш класс, для запуска программы
        jFrame.setVisible(true);// делаем видимость
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// добавляем операцию для выхода
        Toolkit toolkit = Toolkit.getDefaultToolkit();// набор инструментов, с нашими JFrame
        Dimension dimension = toolkit.getScreenSize(); //возвращяет значения нашего экрана
        // размеры окна
        jFrame.setBounds(dimension.width/2 - 250, dimension.height/2 -150, 500, 300);
        jFrame.setTitle("Hello");// надпись Title
        //jFrame.setIconImage(путь);
        return jFrame;
    }
}
