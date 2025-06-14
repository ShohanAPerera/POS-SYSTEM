/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shoan
 */
import javax.swing.*;
import java.awt.*;

public class FancyPanelDemo extends JFrame {

    public FancyPanelDemo() {
        setTitle("FancyPanel Demo");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(20, 20, 20)); // dark background

        // Create and configure FancyPanel
        FancyPanel fancyPanel = new FancyPanel();
        fancyPanel.setBounds(50, 50, 400, 250);
        fancyPanel.setLayout(new BorderLayout());

        // Create radiant white glowing label
        JLabel label = new JLabel("Radiant White Text", SwingConstants.CENTER);
        label.setFont(new Font("SansSerif", Font.BOLD, 28));
        label.setForeground(Color.WHITE);

        // Optional: add subtle glow effect on text by overriding paint (simple version)
        label.setUI(new javax.swing.plaf.basic.BasicLabelUI() {
            @Override
            public void paint(Graphics g, JComponent c) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

                // Glow shadow (white, transparent, slightly offset)
                g2.setColor(new Color(255, 255, 255, 90));
                g2.drawString(label.getText(), 2, c.getHeight() / 2 + 7);

                // Main text
                g2.setColor(label.getForeground());
                g2.drawString(label.getText(), 0, c.getHeight() / 2 + 5);

                g2.dispose();
            }
        });

        fancyPanel.add(label, BorderLayout.CENTER);

        add(fancyPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FancyPanelDemo());
    }
}
