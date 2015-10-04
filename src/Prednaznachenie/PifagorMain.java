package Prednaznachenie;

import static Prednaznachenie.SwingConsole.run;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

class Results extends JFrame{

}

public class PifagorMain extends JFrame {
	JTextField name = new JTextField(10);
	private JTextField date = new JTextField(2);
	private JTextField month = new JTextField(2);
	private JTextField year = new JTextField(4);
	private JTextArea resultPifagor = new JTextArea(2, 18);
	private JTextArea results = new JTextArea(5, 10);
	private JButton ZvezdaButton = new JButton("Звезда");
	private JButton PifagorButton = new JButton("Пифагор");
		
	private JMenu File = new JMenu ("File"); 
	private JMenu Help = new JMenu ("Help");
	private JMenuItem info = new JMenuItem("О нас");
	private JMenuItem Clear = new JMenuItem("Очистить");
	
	private Image pifagorPic;
	private int[] chislaZvezdy;
	Image image1;
	public Map<Integer, Integer> PifMap;
	
////////////////////////////////////
		public PifagorMain() throws IOException {

		ZvezdaButton.addActionListener(ZvezdaListener);
		PifagorButton.addActionListener(PifagorListener);
		JMenuBar menubar = new JMenuBar();
		menubar.add(File);
		menubar.add(Help);
		Help.add(info);
		File.add(Clear);
		JPanel top = new JPanel();
		
		top.add(new JLabel("Имя: "));
		top.add(name);
		top.add(new JLabel("День:"));
		top.add(date);
		top.add(new JLabel("Месяц:"));
		top.add(month);
		top.add(new JLabel("Год:"));
		top.add(year);
		top.add(ZvezdaButton);
		top.add(PifagorButton);
		Dimension dim = new Dimension(590, 400);

		top.setSize(590, 40);
		top.setLocation(0, 0);

		add(BorderLayout.NORTH , top);
		Border brd2 = BorderFactory.createMatteBorder(5, 5, 5, 5, Color.white);
		
		setMinimumSize(dim);
		results.setEditable(false);
		resultPifagor.setEditable(false);
		JPanel zvezdaPanel = new JPanel();
		zvezdaPanel.setLayout(new BorderLayout());
		results.setBorder(brd2);
		JScrollPane resultsPane = new JScrollPane(results);
		zvezdaPanel.setBorder(new TitledBorder("Описание"));
		zvezdaPanel.add(resultsPane);
		add(BorderLayout.CENTER, zvezdaPanel);

//		date.setText("25");
//		month.setText("12");
//		year.setText("1980");
	}
	
////////////////////////////////////////////////////
	
	public class ImagePanel extends JPanel{
		Image image2;
	    private BufferedImage image;
	    Zvezda z = new Zvezda();
	    public ImagePanel() {
	       try {                   
		          image = (ImageIO.read(this.getClass().getClassLoader().getResourceAsStream("zvezda_pod_otvet900.png")));
	       } catch (IOException ex) {
		            // handle exception...
		       }
	       image = (BufferedImage) z.fillZvezdu2(image, chislaZvezdy);
	    }
	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        int w;
	        if(getHeight()<getWidth())
	        	w=getHeight();
	        else 
	        	w = getWidth();
	        int h;
	        if(getWidth()<getHeight())
	        	h=getWidth();
	        else 
	        	h = getHeight();
	        g.drawImage(image, 0, 0,w,h, null); // see javadoc for more info on the parameters            
	    }
	}
//////////////////////////////////////////////////
	public class pifagorPanel extends JPanel{

	    private BufferedImage image;
	    Pifagor p = new Pifagor();
	    public pifagorPanel() {
	       try {                             
		          image = (ImageIO.read(this.getClass().getClassLoader().getResourceAsStream("Kvadrat_Pifagora.png")));
		       } catch (IOException ex) {
		           System.err.println(ex);
		       }
	       pifagorPic = (BufferedImage) Pifagor.fillPifagorTable(image, PifMap);
	    }
	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        int w;
	        if(getHeight()*1.2<getWidth())
	        	w=(int) (getHeight()*1.2);
	        else 
	        	w = getWidth();
	        int h;
	        if(getWidth()<getHeight()*1.2)
	        	h=(int)(getWidth()/1.2);
	        else 
	        	h = getHeight();
	        g.drawImage(image, 0, 0,w,h, null); // see javadoc for more info on the parameters            
	    }
	}
//////////////////////////////////////////////	Кнопка пифагора
	class actionPifagor implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int getdate = Integer.parseInt(date.getText());
			int getmonth = Integer.parseInt(month.getText());
			int getyear = Integer.parseInt(year.getText());
			String getname = name.getText();
			Map<Integer, Integer> mapR = new TreeMap<Integer, Integer>();
			if (getdate > 31 
					| getdate == 0
					| getmonth == 0
					| getmonth >12 
					| date.getText().length() == 0
					| month.getText().length() == 0 
					| year.getText().length() == 0 ){
				results.setText("Введите правильную дату рождения");
				resultPifagor.setText("Введите правильную дату рождения");
				return;
				}
			mapR = Pifagor.Pifagor(getdate, getmonth, getyear);
			PifMap = mapR;
			JFrame pframe = new JFrame();
			
			SwingUtilities.invokeLater(new Runnable()  {
				public void run() {
					Image im = null;
					try{
						im = ImageIO.read(this.getClass().getClassLoader().getResource("star.png"));
					}catch(Exception e){}
					pifagorPanel PifPan = new pifagorPanel(); //Изображение звезды пифагора
					pframe.add(/*BorderLayout.WEST,*/ PifPan);
					pframe.setTitle(getname + ": Квадрат Пифагора");
					pframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					pframe.setIconImage(im);
					//pframe.pack();
					pframe.setSize(400,358);
					//jframe.setResizable(false);
					pframe.setVisible(true);
					pframe.setLocation(20, 250);
					Dimension d = new Dimension(250, 272);
					pframe.setMinimumSize(d);
					pframe.setPreferredSize(getMinimumSize());
				}
			});				
			return;
		}
	}
//////////////////////////////////////////	Кнопка звезды
	class actionZvezda implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int getdate = Integer.parseInt(date.getText());
			int getmonth = Integer.parseInt(month.getText());
			int getyear = Integer.parseInt(year.getText());
			String getname = name.getText();
			Map<Integer, Integer> mapR = new TreeMap<Integer, Integer>();
			if (getdate > 31 
					| getdate == 0
					| getmonth == 0
					| getmonth >12 
					| date.getText().length() == 0
					| month.getText().length() == 0 
					| year.getText().length() == 0 ){
				results.setText("Введите правильную дату рождения");
				resultPifagor.setText("Введите правильную дату рождения");
				return;
				}
			mapR = Pifagor.Pifagor(getdate, getmonth, getyear);
			String g;
			resultPifagor.setText(mapR.toString());
	///////////////////////////////////		
			g = mapR.toString(); // Добавляем в результат Пифагора
			g = g + ("\n") + Zvezda.zvezda(getdate, getmonth, getyear); 
			results.setText(g);
			chislaZvezdy = Zvezda.chisla(getdate, getmonth, getyear);
			PifMap = mapR;
			
/////////////////////////////////////////////////////////	Окно пифагора
			
			JFrame pframe = new JFrame();
			
//			SwingUtilities.invokeLater(new Runnable()  {
//				//Image im = Toolkit.getDefaultToolkit().getImage("images/star.png");
//				public void run() {
//					Image im = null;
//					try{
//						im = ImageIO.read(this.getClass().getClassLoader().getResource("star.png"));
//					}catch(Exception e){}
//
//					pifagorPanel PifPan = new pifagorPanel(); //Изображение звезды пифагора
//					//imPan.setSize(300, 300);
//					//imPan.paintComponent(g);
//					pframe.add(/*BorderLayout.WEST,*/ PifPan);
//					//pframe.add(BorderLayout.EAST, resultPifagor);
//					pframe.setTitle(getname + ": Квадрат Пифагора");
//					pframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
//					pframe.setIconImage(im);
//					//pframe.pack();
//					pframe.setSize(400,358);
//					//jframe.setResizable(false);
//					pframe.setVisible(true);
//					pframe.setLocation(20, 250);
//					Dimension d = new Dimension(250, 272);
//					pframe.setMinimumSize(d);
//					//pframe.setPreferredSize(getMinimumSize());
//				}
//			});			
			
			
///////////////////////////////////////////////////////		Окно звезды
			
	JFrame jframe = new JFrame();

			
			SwingUtilities.invokeLater(new Runnable()  {
				Image im = Toolkit.getDefaultToolkit().getImage("images/star.png");
				public void run() {
					

					ImagePanel imPan = new ImagePanel(); //Изображение звезды пифагора
					//imPan.setSize(300, 300);
					//imPan.paintComponent(g);
					jframe.add(BorderLayout.CENTER, imPan);
					//JScrollPane scrollZvezda = new JScrollPane(results);
				//	scrollZvezda.setMinimumSize(null);
					//jframe.add(BorderLayout.EAST, scrollZvezda);
					jframe.setTitle(getname + ": Звезда предназначения");
					jframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					jframe.setIconImage(im);
					//jframe.pack();
					jframe.setSize(336,358);
					//jframe.setResizable(false);
					jframe.setVisible(true);
					jframe.setLocation(460, 250);
					Dimension d = new Dimension(250, 272);
					jframe.setMinimumSize(d);
					//jframe.setPreferredSize(getMinimumSize());
				}
			});	
			

			return;
		}
		
	}
	actionZvezda ZvezdaListener = new actionZvezda();
	actionPifagor PifagorListener = new actionPifagor();
/////////////////////////////////////////////////////
	public static void main(String[] args) throws IOException {
		run(new PifagorMain(), 600, 450);
		
	}
}
