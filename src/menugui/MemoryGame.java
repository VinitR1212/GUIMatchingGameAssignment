package menugui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MemoryGame extends JFrame {

    private JPanel boardPanel;

    private ArrayList<JButton> buttons;
    private ArrayList<Integer> buttonValues;
    private Map<Integer, ImageIcon> images;
    private final ImageIcon blankImage;
    private final int gridSize = 4;
    private final int totalPairs = gridSize * gridSize / 2;
    private int pairsFound = 0;
    private int score = 0;
    private JButton startButton;
    private JButton firstButton;
    private JButton secondButton;

    public MemoryGame() {
        
        setTitle("Memory Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(650, 450);
        setLayout(new BorderLayout());

        boardPanel = new JPanel(new GridLayout(gridSize, gridSize));
        buttons = new ArrayList<>();
        buttonValues = new ArrayList<>();
        images = new HashMap<>();

        loadImages();

        blankImage = new ImageIcon("blankImage.jpg");

        initializeButtons();

        startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startGame();
            }
        });
        add(startButton, BorderLayout.NORTH);
        add(boardPanel, BorderLayout.CENTER);

        setVisible(true);
        this.setLocationRelativeTo(null);
    }

    private void loadImages() {
        for (int i = 1; i <= totalPairs; i++) {
            try {
                ImageIcon icon = new ImageIcon(getClass().getResource("image" + i + ".jpg"));
                images.put(i, icon);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    private void initializeButtons() {
        for (int i = 1; i <= totalPairs; i++) {
            buttonValues.add(i);
            buttonValues.add(i);
        }

        Collections.shuffle(buttonValues);

        for (int i = 0; i < gridSize * gridSize; i++) {
            JButton button = new JButton();
            button.setPreferredSize(new Dimension(100, 100)); // Set square size
            button.addActionListener(new ButtonListener());
            button.setIcon(blankImage);
            buttons.add(button);
            boardPanel.add(button);
            button.setIcon(new ImageIcon(this.getClass().getResource("blankImage.jpg")));
        }
    }

    private void startGame() {
        startButton.setEnabled(false);
        for (JButton button : buttons) {
            int index = buttons.indexOf(button);
            int value = buttonValues.get(index);
            button.setIcon(images.get(value));
        }
        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                hideImages();

            }
        });
        timer.setRepeats(false);
        timer.start();
    }

    private void hideImages() {
        for (JButton button : buttons) {
            button.setIcon(new ImageIcon(this.getClass().getResource("blankImage.jpg")));
        }
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();

            if (!clickedButton.isEnabled() || pairsFound == totalPairs)
                return;

            int index = buttons.indexOf(clickedButton);
            int value = buttonValues.get(index);
            clickedButton.setIcon(images.get(value));

            if (firstButton == null) {
                firstButton = clickedButton;
            } else {
                if (!firstButton.equals(clickedButton)) {
                    secondButton = clickedButton;

                    int firstValue = buttonValues.get(buttons.indexOf(firstButton));
                    int secondValue = buttonValues.get(buttons.indexOf(secondButton));

                    if (firstValue == secondValue) {
                        firstButton.setEnabled(false);
                        secondButton.setEnabled(false);
                        pairsFound++;
                        if (pairsFound == totalPairs) {
                            endGame();
                        }
                    } else {
                        endGame();
                    }
                }
                firstButton = null;
                secondButton = null;
            }
        }
    }

    private void endGame() {
        score = pairsFound * 100 / totalPairs;
        JOptionPane.showMessageDialog(this, "Game Over! Your score: " + score);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MemoryGame();
            }
        });
    }
}
