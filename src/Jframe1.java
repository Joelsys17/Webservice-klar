import java.awt.BorderLayout; 
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.UIManager;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.rmi.RemoteException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.awt.event.ActionEvent;

import javax.lang.model.element.Element;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTabbedPane;
import javax.swing.border.EtchedBorder;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;



public class Jframe1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton selectButton;
	private JButton insertButton;
	private JPanel panel;
	private JPanel panel_2;
	private JTextPane textPane;
	private JTextPane textPane_1;
	
org.tempuri.WebService1SoapProxy obj = new org.tempuri.WebService1SoapProxy();
private JScrollPane scrollPane;
private JTable table;
	/******
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jframe1 frame = new Jframe1();
					frame.setVisible(true);
					frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the frame.
	 **/
	public Jframe1() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 851, 845);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(null);
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setForeground(new Color(0, 51, 204));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(144, 25, 561, 265);
		contentPane.add(panel);
		panel.setLayout(null);
		
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 0, 561, 265);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		selectButton = new JButton("Load");
		selectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int col = obj.javaUppgiftWebservice("2").length;
					String[] row = new String[col];
					DefaultTableModel model = new DefaultTableModel(obj.javaUppgiftWebservice("2"), row);
					table.setModel(model);
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}});
		
		selectButton.setBounds(343, 302, 155, 62);
		contentPane.add(selectButton);
		
		insertButton = new JButton("Load Online Text");
		insertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url = textPane_1.getText();
				try {
					textPane.setText(obj.getWebsiteHtml(url));
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		insertButton.setBounds(343, 681, 155, 62);
		contentPane.add(insertButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(264, 567, 310, 89);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textPane_1 = new JTextPane();
		textPane_1.setToolTipText("Write stuff here");
		textPane_1.setBounds(6, 6, 298, 77);
		panel_1.add(textPane_1);
		
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(144, 430, 561, 112);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		textPane = new JTextPane();
		textPane.setToolTipText("Write stuff here");
		textPane.setBounds(6, 6, 549, 100);
		panel_2.add(textPane);
			
		
	}
}

