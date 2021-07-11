package GraphicXO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    private BattleMap battleMap;
    private Settings settings;


    public GameWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 500, 500, 500);
        setTitle("TicTacToe");

        JPanel panel = new JPanel(new GridLayout(1, 2));
        JButton buttonSNG = new JButton("Start new game");
        panel.add(buttonSNG);
        JButton buttonExit = new JButton("Exit");
        panel.add(buttonExit);

        add(panel, BorderLayout.SOUTH);

        panel.setBackground(Color.blue);


        battleMap = new BattleMap(this);
        add(battleMap, BorderLayout.CENTER);


        settings = new Settings(this);


        // События при нажатие кнопки
        buttonSNG.addActionListener(e -> settings.setVisible(true));

        buttonExit.addActionListener(e -> System.exit(0));


        setVisible(true);

    }

    void startNewGame(int fieldSize, int winLenght) {
        battleMap.startNewGame(fieldSize, winLenght);
    }
}
