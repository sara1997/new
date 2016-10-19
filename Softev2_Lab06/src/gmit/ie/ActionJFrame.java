package gmit.ie;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionJFrame extends JFrame {

	JButton clickMeButton;
	int count=0;
	JLabel displayLabel = new JLabel("text here");
	JPanel mainPanel;

	public ActionJFrame(){
		super();
		initUI();
		placeComponents();
		bindListeners();

	}
	
	private void initUI() {
		this.setSize(400,300);
		this.setTitle("Its class");
		this.setLocationRelativeTo (null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void placeComponents() {
		mainPanel= new JPanel(new FlowLayout());
		this.getContentPane().add(mainPanel);
		clickMeButton= new JButton("new button");
		mainPanel.add(clickMeButton,BorderLayout.CENTER);
		mainPanel.add(displayLabel);

	}

	private void bindListeners() {
		clickMeButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ae) {
				onClickMeButtonClicked(ae);

			}
		});
		clickMeButton.addMouseListener(new MouseListener(){
			
			public void mousePressed(MouseEvent e) {
			}
			public void mouseReleased(MouseEvent e) {
			}
			public void mouseEntered(MouseEvent e) {
				onMouseEntersClickMeButton(e);
			}


			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
				onMouseExistsClickMeButton(e);
			}
		});
		
	
		clickMeButton.addKeyListener(new KeyListener(){
			@Override
			public void keyPressed(KeyEvent e) {
			}
			@Override
			public void keyReleased(KeyEvent e) {
			}
			@Override
			public void keyTyped(KeyEvent e){
				System.out.println("key typed");
				onKeyTyped(e);
			}
		});


	}
	
	//methods
	
	private void onKeyTyped(KeyEvent e){
		displayLabel.setText("key typed: "+e.getKeyChar());
		repaint();
	}
	
	private void onMouseExistsClickMeButton(MouseEvent me){
		clickMeButton.setBackground(Color.GRAY);
	}

	private void onMouseEntersClickMeButton(MouseEvent me){
		clickMeButton.setBackground(Color.RED);

	}

	private void onClickMeButtonClicked(ActionEvent ae){
		count++;
		clickMeButton.setText("bla "+ count);


	}

	private void onMauseMoved(MouseEvent me){
		int x = me.getX();
		int y = me.getY();
		displayLabel.setText("mouse at x="+x+",y="+y);
	}
}


