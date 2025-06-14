
import javax.swing.*;
import java.awt.*;

public class FancyPanel extends JPanel {
    private final int cornerRadius = 30;
    private final int shadowSize = 12;

    public FancyPanel() {
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();

        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // 1. Draw radiant dark shadow behind the panel
        float centerX = width / 2f + shadowSize / 2f;
        float centerY = height / 2f + shadowSize / 2f;
        float radius = Math.max(width, height);
        RadialGradientPaint shadowPaint = new RadialGradientPaint(
                new Point.Float(centerX, centerY),
                radius,
                new float[]{0f, 0.7f, 1f},
                new Color[]{new Color(0, 0, 0, 150), new Color(0, 0, 0, 70), new Color(0, 0, 0, 0)}
        );
        g2.setPaint(shadowPaint);
        g2.fillRoundRect(shadowSize, shadowSize, width - shadowSize * 2, height - shadowSize * 2, cornerRadius, cornerRadius);

        // 2. Draw dark radiant gradient background
        GradientPaint backgroundGradient = new GradientPaint(
                0, 0, new Color(30, 30, 30),
                0, height, new Color(10, 10, 10)
        );
        g2.setPaint(backgroundGradient);
        g2.fillRoundRect(0, 0, width - shadowSize * 2, height - shadowSize * 2, cornerRadius, cornerRadius);

        // 3. Draw white radiant border (glow effect)
        g2.setStroke(new BasicStroke(3f));
        GradientPaint borderGradient = new GradientPaint(
                0, 0, new Color(255, 255, 255, 180),
                width, height, new Color(0, 255, 255, 50)
        );
        g2.setPaint(borderGradient);
        g2.drawRoundRect(1, 1, width - shadowSize * 2 - 2, height - shadowSize * 2 - 2, cornerRadius, cornerRadius);

        g2.dispose();

        super.paintComponent(g);
    }
}
