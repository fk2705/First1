import java.util.Random;

import javax.swing.JPanel;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Label;



public class FirstProject20121 {
	private static Text jtextfield;
	private static Text jtextfield_1;
	private static Text jtextfield_2;
	private static JPanel balls;
	private static final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	//private static Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {


		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(843, 459);
		shell.setText("SWT Application");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int cardvalue1 = 0;
				int cardvalue=0;
				
				Random James = new Random ();
				cardvalue = James.nextInt(10)+1;
				String g = Integer.toString(cardvalue);
				jtextfield.setText(g);
			
				Random Erickson = new Random();
				cardvalue1 = Erickson.nextInt(10)+1;
				String q = Integer.toString(cardvalue1);
				jtextfield_1.setText(q);
				
				if (cardvalue1>cardvalue){
					jtextfield_2.setText("Player 2 wins!");
				}
				else if (cardvalue>cardvalue1){
					jtextfield_2.setText("Player 1 wins!");
					
				}
				else if (cardvalue==cardvalue1){
					
			//	jtextfield_2.setText("derp " + "\n" + "dead");
				
					Random r = new Random();
					int a = r.nextInt(10)+1;
					String card1 = Integer.toString(a); 
					
				    
					Random b = new Random();
					int c = b.nextInt(10)+1;
					String card2 = Integer.toString(c);
					
					
					Random d = new Random();
					int e1= d.nextInt(10)+1;
					String card3 = Integer.toString(e1);
					
					Random f = new Random();
					int g1 = f.nextInt(10)+1;
					String card4 = Integer.toString(g1);
				
					Random h = new Random();
					int i = h.nextInt(10)+1;
					String card5 = Integer.toString(i);
					
					Random j = new Random();
					int k = j.nextInt(10)+1;
					String card6= Integer.toString(k);
					//jtextfield_2.setText( card1 + "\n" + card2 + "\n" + card3 + "\n" + card4 + "\n" + card5 + "\n" + card6+"\n");
					
					
					int warPlayer1=a+c+e1;
					String display = Integer.toString(warPlayer1);
				
					
					int warPlayer2=g1+i+k;
					String display1 = Integer.toString(warPlayer2);
					
				
				//	jtextfield_2.setText( card1 + "\n" + card2 + "\n" + card3 + "\n" + card4 + "\n" + card5 + "\n" + card6 + "\n" + warPlayer1 + "\n" + warPlayer2 + "\n");	
					if(warPlayer1>warPlayer2){
						
						
						jtextfield_2.setText( card1 + "\n" + card2 + "\n" + card3 + "\n" + card4 + "\n" + card5 + "\n" + card6 + "\n" + "Total Score: " + warPlayer1 + "\n" + "Total Score: " + warPlayer2 + "\n" +  "Player 1 Wins!");						
					}
					else if (warPlayer2>warPlayer1){
						
						
						jtextfield_2.setText( card1 + "\n" + card2 + "\n" + card3 + "\n" + card4 + "\n" + card5 + "\n" + card6 + "\n" + "Total Score: " +  warPlayer1 + "\n" + "Total Score: " + warPlayer2 + "\n" + "Player 2 Wins!" ); 
					}
					
					}
				}
		}
		);
		btnNewButton.setBounds(337, 338, 125, 73);
		btnNewButton.setText("Play Cards");
		
		jtextfield = new Text(shell, SWT.BORDER);
		jtextfield.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				
				
				
				
			}
		});
		jtextfield.setBounds(10, 21, 109, 42);
		
		jtextfield_1 = new Text(shell, SWT.BORDER);
		jtextfield_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				
				
				
				
			}
		});
		jtextfield_1.setBounds(679, 21, 109, 42);
		
		jtextfield_2 = new Text(shell, SWT.BORDER | SWT.MULTI);
		jtextfield_2.setBounds(190, 61, 396, 251);
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				jtextfield.setText("");
				jtextfield_1.setText("");
				jtextfield_2.setText("");
			}
		});
		btnNewButton_1.setBounds(691, 349, 97, 62);
		formToolkit.adapt(btnNewButton_1, true, true);
		btnNewButton_1.setText("Reset");
		
		Label lblPlayer = formToolkit.createLabel(shell, "Player 1", SWT.NONE);
		lblPlayer.setBounds(20, 74, 55, 15);
		
		Label lblPlayer_1 = formToolkit.createLabel(shell, "Player 2", SWT.NONE);
		lblPlayer_1.setBounds(707, 74, 55, 15);
		
		//text = formToolkit.createText(shell, "New Text", SWT.NONE);
		//text.setText("");
		//text.setBounds(727, 301, 61, 21);

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
