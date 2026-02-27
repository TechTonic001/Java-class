import javax.swing.*;

public class Notepad extends JFrame {
    JTabbedPane tabbedPane;

    public Notepad() {
        notepadUI();
    }

    final void notepadUI() {
        setTitle("Helix Notepad");
        JMenuBar menuBar = new JMenuBar();
        JMenu fileName = new JMenu("file");
        JMenu viewName = new JMenu("view");
        JMenu editName = new JMenu("edit");
        menuBar.add(fileName);
        menuBar.add(viewName);
        menuBar.add(editName);

        setJMenuBar(menuBar);

        JMenuItem save = new JMenuItem("Save");
        JMenuItem newTab = new JMenuItem("New tab");

        fileName.add(save);
        viewName.add(newTab);
 
        tabbedPane = new JTabbedPane();

        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        tabbedPane.addTab("Untitled " + tabbedPane.getTabCount(), scrollPane);
        add(tabbedPane);

        save.addActionListener(e -> {
            System.out.println("saved");
        });

        newTab.addActionListener(e -> {
            Newtab();
        });

        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    void Newtab() {
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        tabbedPane.addTab("Untitled" + tabbedPane.getTabCount(), scrollPane);
        tabbedPane.setSelectedIndex(tabbedPane.getTabCount() - 1);
    }

    void getContent() {
        JScrollPane scrollPane = (JScrollPane) tabbedPane.getSelectedComponent();
        JViewport viewport = scrollPane.getViewport();
        JTextArea textArea = (JTextArea) viewport.getView();

        String content = textArea.getText();
        System.out.println(content);

    }



    public static void main(String[] args) {
        new Notepad();

    }
}