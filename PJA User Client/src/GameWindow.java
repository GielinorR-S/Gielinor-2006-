
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import map.Main;


/**
 * Game window class
 * @author Graham
 *
 */
@SuppressWarnings("serial")
public class GameWindow extends JFrame implements ActionListener {
	public static final String[] MENU_ITEMS = new String[] {
		"File",
		"Links",
		"Help",
	};
	public static final String[][] SUB_MENU_ITEMS = new String[][] {
		new String[] {
			"Quit",
		},
		new String[] {
			"Forum main",
			"Vote on Rune-Locus",
		},
		new String[] {
			"Map",			
			"About",
		},

	};
	public GameWindow() {
		JMenuBar jMenuBar = new JMenuBar();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(int i = 0; i < MENU_ITEMS.length; i++) {
			JMenu jMenu = new JMenu(MENU_ITEMS[i]);
			for(int j = 0; j < SUB_MENU_ITEMS[i].length; j++) {
				if(SUB_MENU_ITEMS[i][j].equals("-")) {
					jMenu.addSeparator();
				} else {
					JMenuItem jMenuItem = new JMenuItem(SUB_MENU_ITEMS[i][j]);
					jMenuItem.addActionListener(this);
					jMenu.add(jMenuItem);
				}
			}
    		jMenu.getPopupMenu().setLightWeightPopupEnabled(false);
			jMenuBar.add(jMenu);
		}
		setJMenuBar(jMenuBar);
		(new Thread(new UpdateServer())).start();
		title();
	}
	
	public void title() {
		setTitle("Project Annihilation");
	}
	
	
	@SuppressWarnings("unchecked")
	public static int exec(Class klass) throws IOException, InterruptedException {
		String javaHome = System.getProperty("java.home");
		String javaBin = javaHome + File.separator + "bin" + File.separator + "java";
		String classpath = System.getProperty("java.class.path");
		String className = klass.getCanonicalName();
		ProcessBuilder builder = new ProcessBuilder(javaBin, "-cp", classpath, className);
		Process process = builder.start();
		process.waitFor();
		return process.exitValue();
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		if(evt.getActionCommand().equals("Quit")) {
			System.exit(0);
		} else if(evt.getActionCommand().equals("About")) {
			JOptionPane.showMessageDialog(this, "RuneScape 2 is made by Jagex LTD.");
		} else if(evt.getActionCommand().equals("Forum main")) {

			try {
				Runtime.getRuntime().exec("cmd /c start http://projectannihilation.x10hosting.com/");
			} catch (IOException e1) {
				System.out.println(e1);
			}
		} else if(evt.getActionCommand().equals("Vote on Rune-Locus")) {

			try {
				Runtime.getRuntime().exec("cmd /c start http://runelocus.com/toplist/index.php?action=details&id=10685/");
			} catch (IOException e1) {
				System.out.println(e1);
			}
				
		} else if(evt.getActionCommand().equals("Map")) {
			Thread ffs = new Thread() {
				public void run() {
					try {
						exec(Main.class);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			ffs.start();			
		}
	}
}