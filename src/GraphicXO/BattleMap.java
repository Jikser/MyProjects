package GraphicXO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BattleMap extends JPanel {
    private GameWindow gameWindow;
    private int fieldSize;
    private int winLength;

    private boolean isInit;

    private int cellWidth;
    private int cellHeight;


    public BattleMap(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setBackground(Color.PINK);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                int cellX = e.getX() / cellWidth;
                int cellY = e.getY() / cellHeight;

                if (isInit && !Logic.isGameFinished) {
                    Logic.humanTurn(cellY, cellX);


                }
                repaint();

            }
        });

    }

    void startNewGame(int fieldSize, int winLenght) {
        this.fieldSize = fieldSize;
        this.winLength = winLenght;

        isInit = true;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!isInit) {
            return;
        }


        int panelWidth = getWidth();
        int panelHeight = getHeight();

        cellWidth = panelWidth / fieldSize;
        cellHeight = panelHeight / fieldSize;

        g.setColor(Color.ORANGE);
        ((Graphics2D) g).setStroke(new BasicStroke(2f));

        for (int i = 1; i < fieldSize; i++) {
            int y = i * cellHeight;
            g.drawLine(0, y, panelWidth, y);
        }
        for (int i = 1; i < fieldSize; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x, panelWidth);
        }

        for (int i = 0; i < Logic.map.length; i++) {
            for (int j = 0; j < Logic.map[i].length; j++) {
                if (Logic.map[i][j] == Logic.DOT_X) {
                    drawX(g, i, j);
                }
            }

        }
        for (int i = 0; i < Logic.map.length; i++) {
            for (int j = 0; j < Logic.map[i].length; j++) {
                if (Logic.map[i][j] == Logic.DOT_O) {
                    drawO(g, i, j);
                }
            }
        }
        if (Logic.isGameFinished) {
            g.setColor(Color.RED);
            g.setFont(new Font("Tahoma", 10, 60));
            g.drawString(Logic.message, panelWidth / 4, panelWidth / 2);
        }



    }

    private void drawX(Graphics g, int y, int x) {
        g.setColor(Color.BLACK);
        ((Graphics2D) g).setStroke(new BasicStroke(4f));

        g.drawLine(x * cellWidth, y * cellHeight, (x + 1) * cellWidth, (y + 1) * cellHeight);
        g.drawLine((x + 1) * cellWidth, y * cellHeight, x * cellWidth, (y + 1) * cellHeight);
    }

    private void drawO(Graphics g, int y, int x) {
        g.setColor(Color.GREEN);
        ((Graphics2D) g).setStroke(new BasicStroke(4f));

        g.drawOval(x * cellWidth, y * cellHeight, cellWidth, cellHeight);

    }
}
//
//    public void drawRez(Graphics g, int rez) {
//
//
////        g.setColor(Color.RED);
////        ((Graphics2D) g).setStroke(new BasicStroke(15f));
////        if (rez == 1) {
////            g.drawString("Вы победили!", 250, 250);
////        }
////        if (rez == 2) {
////            g.drawString("Ничья!", 250, 250);
////        }
////        if (rez == 3) {
////            g.drawString("Потрачено!", 250, 250);
////        }
////        if (rez == 4) {
////            g.drawString("Ваш ход", 250, 250);
////        }
//
//        }


