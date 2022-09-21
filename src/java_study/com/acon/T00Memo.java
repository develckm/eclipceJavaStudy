package java_study.com.acon;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

class TextEditor extends JFrame{
	JTextArea ta;
	JMenuBar mb;
	JMenu menu;
	JMenuItem miNew,miOpen,miSaveAs,miExit;
	public TextEditor() {
		super("메모장");
		ta = new JTextArea();
		mb = new JMenuBar();
		menu = new JMenu("파일(F)");
		miNew = new JMenuItem("새로 만들기(N)"); //1
		miOpen = new JMenuItem("열기(O)");
		miSaveAs = new JMenuItem("저장(S)");
		miExit = new JMenuItem("끝내기(X)");//2
		
		MenuHandler mh = new MenuHandler();
		
		miNew.addActionListener(mh);
		
		menu.add(miNew);
		menu.add(miOpen);
		menu.add(miSaveAs);
		menu.addSeparator();
		menu.add(miExit);
		mb.add(menu);
		this.add(ta); 
		//Frame의 BorderLayout은 아무지정 없이 add하면 Center에 Component 삽입
		this.setJMenuBar(mb);
		//this.setLayout(null);
		this.setBounds(300,200,600,500);
		this.setVisible(true);
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showOpenDialog(this);
        if(option == JFileChooser.APPROVE_OPTION){
           File file = fileChooser.getSelectedFile();
           try {
			Scanner scanner=new Scanner(file);
			while(scanner.hasNext()) {
				ta.append(scanner.next()+"\n");
			}
        } catch (FileNotFoundException e) {
			e.printStackTrace();
		}
           System.out.println(file.getName());
        }else{
        }

		
		
		
//		FileDialog fd = new FileDialog(this, "열기", FileDialog.LOAD);
//		fd.setVisible(true);
//		String filename = fd.getDirectory()+fd.getFile();
//		System.out.println(filename);
		
		//AWT는 네이티브 WINDOW기 때문에 OS(MS949)의 인코딩을 따라간다.
		//JAVA의 인코딩이 UTF-8과 충돌을 일으켜서 이클립스의 도움을 받아야한다.
		//구글 awt 한글깨짐 검색
	}
	class MenuHandler implements ActionListener{
		//hint 2 생성자 규칙 변경!
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getActionCommand());
			//hint 1
			switch (e.getActionCommand()) {
			case "새로 만들기(N)":break;
			}
		}
	}
}
public class T00Memo {
	public static void main(String[] args) {
		new TextEditor();
	}
}
