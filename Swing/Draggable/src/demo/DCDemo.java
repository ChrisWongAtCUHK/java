package demo;

import swing.draggable.DraggableComponent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class DCDemo {
	  // http://stackoverflow.com/questions/874360/swing-creating-a-draggable-component
	  public static void main(String[] args) {
		    JFrame f = new JFrame("Swing Hello World");

		    // by doing this, we prevent Swing from resizing
		    // our nice component
		    f.setLayout(null);

		    //DraggableComponent dc = new DraggableComponent();
		    // http://upload.wikimedia.org/wikipedia/commons/thumb/0/0a/Konqi-klogo-official-400x500_b.png/220px-Konqi-klogo-official-400x500_b.png
		    DraggableComponent dc = new DraggableComponent("res/img/konqi.png");
		    f.add(dc);

		    f.setSize(500, 500);

		    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		    f.setVisible(true);
		  }
}
