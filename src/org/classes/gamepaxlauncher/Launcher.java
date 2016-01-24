package org.classes.src.game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import main.game.file.here.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Launcher {

	private JFrame frmGamePaxLauncher;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Launcher window = new Launcher();
					window.frmGamePaxLauncher.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Put your game's main file's name where the play button executes Example.class. Then, put your game's main file/all files in the main.game.file.here package.
	 * Put your games name where specified.
	 */
	public Launcher() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGamePaxLauncher = new JFrame();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e1) {
			e1.printStackTrace();
		}
		frmGamePaxLauncher.setTitle("Game Pax Launcher - Enter Game Title Here");
		frmGamePaxLauncher.getContentPane().setBackground(Color.DARK_GRAY);
		frmGamePaxLauncher.setBounds(100, 100, 794, 605);
		frmGamePaxLauncher.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblGamePax = new JLabel("Game Pax 1.10 Launcher");
		lblGamePax.setForeground(Color.LIGHT_GRAY);
		lblGamePax.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lblEnterGameName = new JLabel("Enter Game Name Here");
		lblEnterGameName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblEnterGameName.setForeground(Color.LIGHT_GRAY);
		lblEnterGameName.setBackground(Color.DARK_GRAY);
		GroupLayout groupLayout = new GroupLayout(frmGamePaxLauncher.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblGamePax, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 319, Short.MAX_VALUE)
					.addComponent(lblEnterGameName)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGamePax, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEnterGameName))
					.addGap(173)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(267, Short.MAX_VALUE))
		);
		
		// TODO Play Button
		JButton btnPlay = new JButton("Play");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Example.main(null);
				frmGamePaxLauncher.setVisible(false);
			}
		});
		btnPlay.setBackground(Color.LIGHT_GRAY);
		
		// TODO Cancel Button
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(Color.LIGHT_GRAY);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//Info
		JButton btnInfo = new JButton("Info");
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Info.main(null);
			}
		});
		
		btnInfo.setBackground(Color.LIGHT_GRAY);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(btnInfo)
					.addGap(255)
					.addComponent(btnPlay, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 289, Short.MAX_VALUE)
					.addComponent(btnCancel))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancel)
						.addComponent(btnInfo)
						.addComponent(btnPlay, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)))
		);
		panel.setLayout(gl_panel);
		frmGamePaxLauncher.getContentPane().setLayout(groupLayout);
	}
}
