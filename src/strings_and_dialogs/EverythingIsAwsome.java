package strings_and_dialogs;

import javax.swing.JOptionPane;

public class EverythingIsAwsome {
public static void main(String[] args) {
	String TheyLike=JOptionPane.showInputDialog(null,"what do you like?");
	JOptionPane.showMessageDialog(null,TheyLike+",That's awsome! ");
}
}
