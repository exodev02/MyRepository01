package com.exodev.swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LineTextField extends JTextField{

    public Color getLineColor() {
        return lineColor;
    }

    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }

    public LineTextField() {
        setBorder(new EmptyBorder(10, 5, 10, 5));
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                mouseOver = true;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mouseOver = false;
                repaint();
            }
            
        });
    }
    
    private Color lineColor = new Color(82, 216, 246);
    private boolean mouseOver = false;

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        if(mouseOver){
            g2.setColor(lineColor);
        } else 
            g2.setColor(new Color(155,155,155));
        
        g2.fillRect(2, getHeight() - 1, getWidth() - 4, 2);
        super.paint(g);
    }

    
}
