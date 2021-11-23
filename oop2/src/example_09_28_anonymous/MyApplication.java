package example_09_28_anonymous;

import java.awt.event.*;
import javax.swing.*;

public class MyApplication extends JFrame {

	public MyApplication() {
		JMenuBar menuBar = new JMenuBar();
		// �޴��������� �̺�Ʈ �ҽ���.
		JMenu fileMenu = new JMenu("����");
		JMenuItem newMenuItem = new JMenuItem("����");
		JMenuItem openMenuItem = new JMenuItem("����");
		JMenuItem saveMenuItem = new JMenuItem("�����ϱ�");
		JMenuItem exitMenuItem = new JMenuItem("�����ϱ�");
		
		fileMenu.add(newMenuItem);
		fileMenu.add(openMenuItem);
		fileMenu.add(saveMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(exitMenuItem);
		
		// �̺�Ʈ �����ʸ� �͸�ü�� �����
		/* 
		 * �̺�Ʈ ��鷯(�͸�ü)�� ������ �� ����ϴ� �θ� �������̽�
		 * public interface ActionListener {
		 * 		void actionPErformed(ActionEvent event);
		 * 			
		 * }
		 * 
		 * �� �̺�Ʈ �ҽ����� ����� �͸�ü �����
		 * ActionListener newFileListener = new ActionListener() {
		 * 		public void actionPerformed(ActionEvent event) {
		 * 			�������� ���ϴ�.
		 * 		}
		 * }
		 * 
		 * ActionListener openFileListener = new ActionListener() {
		 * 		public void actionPerformed(ActionEvent event) {
		 * 			������ �ҷ��ɴϴ�.
		 * 		}
		 * }
		 */
		
		// �͸�ü �����ϱ� - ������ �̺�Ʈ�ҽ����� ����ڿ��� ��ȣ�ۿ����� �̺�Ʈ�� �߻����� �� ������ �ڵ尡 �����ǵǾ� �ִ� �͸�ü �����ϱ�
		ActionListener newFileListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "�� ������ ���ϴ�.", "�� ����", JOptionPane.INFORMATION_MESSAGE);
			}
		};
		ActionListener openFileListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "������ �ҷ��ɴϴ�...", "�ҷ�����", JOptionPane.INFORMATION_MESSAGE);
			}
		};
		ActionListener saveFileListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "������ �����մϴ�.", "�����ϱ�", JOptionPane.INFORMATION_MESSAGE);
			}
		};
		ActionListener exitFileListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "���α׷��� �����մϴ�..", "�����ϱ�", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
		};
		
		// �͸�ü�� ������ �̺�Ʈ������(�̺�Ʈ �ڵ鷯)��ü�� �̺�Ʈ �ҽ��� ����ϱ�
		newMenuItem.addActionListener(newFileListener);
		openMenuItem.addActionListener(openFileListener);
		saveMenuItem.addActionListener(saveFileListener);
		exitMenuItem.addActionListener(exitFileListener);
		
		menuBar.add(fileMenu);
		
		this.setJMenuBar(menuBar);		
		
		this.setBounds(200, 200, 400, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyApplication();
	}

}