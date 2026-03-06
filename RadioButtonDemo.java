import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonDemo extends JFrame implements ActionListener {

    JRadioButton bird, cat, dog, rabbit, pig;
    JLabel imageLabel;

    public RadioButtonDemo() {

        setTitle("Pet Selector");
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        bird = new JRadioButton("Bird");
        cat = new JRadioButton("Cat");
        dog = new JRadioButton("Dog");
        rabbit = new JRadioButton("Rabbit");
        pig = new JRadioButton("Pig");

        ButtonGroup group = new ButtonGroup();
        group.add(bird);
        group.add(cat);
        group.add(dog);
        group.add(rabbit);
        group.add(pig);

        imageLabel = new JLabel();
        imageLabel.setPreferredSize(new Dimension(300, 300));

        add(bird);
        add(cat);
        add(dog);
        add(rabbit);
        add(pig);
        add(imageLabel);

        bird.addActionListener(this);
        cat.addActionListener(this);
        dog.addActionListener(this);
        rabbit.addActionListener(this);
        pig.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if(bird.isSelected()) {
            ImageIcon icon = new ImageIcon("images/bird.jpg");
            Image img = icon.getImage();
            Image scaledImg = img.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(scaledImg));
        }

        else if(cat.isSelected()) {
            ImageIcon icon = new ImageIcon("images/cat.jpg");
            Image img = icon.getImage();
            Image scaledImg = img.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(scaledImg));
        }

        else if(dog.isSelected()) {
            ImageIcon icon = new ImageIcon("images/dog.jpg");
            Image img = icon.getImage();
            Image scaledImg = img.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(scaledImg));
        }

        else if(rabbit.isSelected()) {
            ImageIcon icon = new ImageIcon("images/rabbit.jpg");
            Image img = icon.getImage();
            Image scaledImg = img.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(scaledImg));
        }

        else if(pig.isSelected()) {
            ImageIcon icon = new ImageIcon("images/pig.jpg");
            Image img = icon.getImage();
            Image scaledImg = img.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(scaledImg));
        }
    }

    public static void main(String[] args) {
        new RadioButtonDemo();
    }
}