package org.classes.src.game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Info {

	private JFrame frmInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Info window = new Info();
					window.frmInfo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Info() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInfo = new JFrame();
		frmInfo.setResizable(false);
		frmInfo.getContentPane().setBackground(Color.DARK_GRAY);
		frmInfo.getContentPane().setForeground(Color.WHITE);
		frmInfo.setTitle("Info");
		frmInfo.setBounds(100, 100, 473, 477);
		frmInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* Put the name of your game where it tells you to. */
		
		JLabel lblLauncherAndGame = new JLabel("Launcher And Game Info");
		lblLauncherAndGame.setForeground(Color.LIGHT_GRAY);
		lblLauncherAndGame.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblLauncherAndGame.setBackground(Color.WHITE);
		
		JLabel lblGame = new JLabel("Game:");
		lblGame.setForeground(Color.WHITE);
		
		JLabel lblEnterGameName = new JLabel("Enter Game Name Here");
		lblEnterGameName.setForeground(Color.WHITE);
		
		JLabel lblLauncherVersion = new JLabel("Launcher Version:");
		lblLauncherVersion.setForeground(Color.WHITE);
		
		JLabel lblGamePax = new JLabel("Game Pax 1.10");
		lblGamePax.setForeground(Color.WHITE);
		
		JLabel lblGameVersion = new JLabel("Game Version:");
		lblGameVersion.setForeground(Color.WHITE);
		
		JLabel lblEnterGameVersion = new JLabel("Enter Game Version Here");
		lblEnterGameVersion.setForeground(Color.WHITE);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmInfo.setVisible(false);
			}
		});
		btnClose.setBackground(Color.DARK_GRAY);
		GroupLayout groupLayout = new GroupLayout(frmInfo.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblGame)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblEnterGameName))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblLauncherVersion)
							.addGap(10)
							.addComponent(lblGamePax))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblGameVersion)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblEnterGameVersion))
						.addComponent(lblLauncherAndGame, GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
						.addComponent(btnClose, Alignment.TRAILING))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblLauncherAndGame, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGame)
						.addComponent(lblEnterGameName))
					.addGap(3)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGameVersion)
						.addComponent(lblEnterGameVersion))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblGamePax)
						.addComponent(lblLauncherVersion))
					.addPreferredGap(ComponentPlacement.RELATED, 283, Short.MAX_VALUE)
					.addComponent(btnClose)
					.addContainerGap())
		);
		frmInfo.getContentPane().setLayout(groupLayout);
	}

}
