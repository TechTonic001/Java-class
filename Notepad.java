import javax.swing.*;

public class Notepad {
    public static void main(String[] args) {
        System.out.println("hello swing");

        JFrame frame = new JFrame("Helix Notepad");
        frame.setVisible(true);
        frame.setSize(500, 500);
        JTabbedPane tabPane = new JTabbedPane();
        frame.add(tabPane);

        JTextArea textArea = new JTextArea();
        tabPane.addTab("new", new JScrollPane(textArea));
        // frame.add(textArea); 

        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
