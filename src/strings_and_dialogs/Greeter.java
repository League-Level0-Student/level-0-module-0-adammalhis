package strings_and_dialogs;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String therename=JOptionPane.showInputDialog(null,"what is your name");
	JOptionPane.showMessageDialog(null, "hi "+therename);
}
}
