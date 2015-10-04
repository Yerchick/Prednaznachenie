package Prednaznachenie;

import static Prednaznachenie.Sum.Sum;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
public class Zvezda {
	
	
	public static int[] chisla(int a, int b, int C){
		int c[] = new int[100];
		//c[0] = 0;
	c[1]=Sum(a);								
	c[2]=Sum(b);						
	c[3]=Sum(C);						
	c[4]=Sum(c[1], c[2], c[3]);				
	c[5]=Sum(c[1],c[2],c[3],c[4]);			
	c[6]=Sum(c[2],c[4]);					
	c[7]=Sum(c[1],c[3]);					
	c[8]=Sum(c[6],c[7]);
//	Диагональный квадрат
	c[9]=Sum(c[1],c[2]);
	c[10]=Sum(c[2],c[3]);
	c[11]=Sum(c[3],c[4]);
	c[12]=Sum(c[1],c[4]);
	c[13]=Sum(c[9],c[11]);
	c[14]=Sum(c[10],c[12]);
	c[15]=Sum(c[13],c[14]);
	c[16]=Sum(c[8], c[15]);
//	кармический хвост
	c[17]=Sum(c[4],c[5]);
	c[18]=Sum(c[17]+c[5]);      	//Не уверен, +10?
	//Партнерство и деньги
	c[19]=Sum(c[3],c[5]);
	c[20]=Sum(c[17],c[19]);
	c[21]=Sum(c[20],c[19]);
	//Любовные отношения
	c[23]=Sum(c[17],c[20]);
	//чакры и здоровье
	c[24]=Sum(c[2],c[5]);
	c[25]=Sum(c[2], c[24]);
	c[26]=Sum(c[5],c[24]);
	//физическое состояние органов
	c[27]=Sum(c[1],c[5]);
	c[28]=Sum(c[1],c[27]);
	c[29]=Sum(c[5],c[27]);
	c[30]=Sum(c[1],c[2]);
	c[31]=Sum(c[25],c[28]);
	c[32]=Sum(c[24],c[27]);
	c[33]=Sum(c[26],c[29]);
	c[34]=Sum(c[5],c[5]); ////????????
	c[35]=Sum(c[17],c[19]);
	c[36]=Sum(c[3],c[4]);
	c[37]=Sum(c[30],c[31],c[32],c[33],c[34],c[35],c[36]);
	//Просчеты по годам
	c[38]=Sum(c[1],c[9]);
	c[39]=Sum(c[1],c[38]);
	c[40]=Sum(c[1],c[39]);
	c[41]=Sum(c[39],c[38]);
	c[42]=Sum(c[9],c[38]);
	c[43]=Sum(c[42],c[38]);
	c[44]=Sum(c[42], c[9]);
	c[45]=Sum(c[9],c[2]);
	c[46]=Sum(c[9],c[45]);
	c[47]=Sum(c[9],c[46]);
	c[48]=Sum(c[2],c[46]);
	c[49]=Sum(c[45],c[2]);
	c[50]=Sum(c[45],c[49]);
	c[51]=Sum(c[49],c[45]);
	c[52]=Sum(c[2], c[10]);
	c[53]=Sum(c[2],c[52]);
	c[54]=Sum(c[2],c[53]);
	c[55]=Sum(c[52],c[53]);
	c[56]=Sum(c[52],c[10]);
	c[57]=Sum(c[52],c[56]);
	c[58]=Sum(c[56],c[10]);
	c[59]=Sum(c[10],c[3]);
	c[60]=Sum(c[10],c[59]);
	c[61]=Sum(c[10],c[60]);
	c[62]=Sum(c[59],c[60]);
	c[63]=Sum(c[59],c[3]);
	c[64]=Sum(c[63],c[3]);
	c[65]=Sum(c[59],c[63]);
	c[66]=Sum(c[3],c[11]);
	c[67]=Sum(c[3],c[66]);
	c[68]=Sum(c[3],c[67]);
	c[69]=Sum(c[66],c[67]);
	c[70]=Sum(c[66],c[11]);
	c[71]=Sum(c[66],c[70]);
	c[72]=Sum(c[70],c[11]);
	c[73]=Sum(c[11],c[4]);
	c[74]=Sum(c[11],c[73]);
	c[75]=Sum(c[11],c[74]);
	c[76]=Sum(c[74],c[73]);
	c[77]=Sum(c[73],c[4]);
	c[78]=Sum(c[73],c[77]);
	c[79]=Sum(c[77],c[4]);
	c[80]=Sum(c[4],c[12]);
	c[81]=Sum(c[4],c[80]);
	c[82]=Sum(c[4],c[81]);
	c[83]=Sum(c[81],c[80]);
	c[84]=Sum(c[80],c[12]);
	c[85]=Sum(c[80],c[84]);
	c[86]=Sum(c[84],c[12]);
	c[87]=Sum(c[12],c[1]);
	c[88]=Sum(c[12],c[87]);
	c[89]=Sum(c[12],c[88]);
	c[90]=Sum(c[88],c[87]);
	c[91]=Sum(c[87],c[1]);
	c[92]=Sum(c[87],c[91]);
	c[93]=Sum(c[91],c[1]);
	c[94]=Sum(c[35],c[17]);
	c[95]=Sum(c[35],c[19]);
	return c;
	}
	
//	public static JLabel fillZvezdu(Image i, int[] cc){
//		BufferedImage im2 = (BufferedImage) i;
//		Graphics2D gZvezda = im2.createGraphics();
//		Color Col = Color.black;
//				
//		gZvezda.setFont(new Font("Arial", Font.BOLD, 22));
//		gZvezda.setColor(Col);
//		if(Integer.toString(cc[9]).length()==1)
//			gZvezda.drawString(Integer.toString(cc[9]), 55, 69);
//		else
//			gZvezda.drawString(Integer.toString(cc[9]), 50, 69);//north-west
//		if(Integer.toString(cc[10]).length()==1)
//			gZvezda.drawString(Integer.toString(cc[10]), 233, 69);
//		else
//			gZvezda.drawString(Integer.toString(cc[10]), 228, 69);//north-east
//		if(Integer.toString(cc[11]).length()==1)
//			gZvezda.drawString(Integer.toString(cc[11]), 233, 247);//south-east
//		else
//			gZvezda.drawString(Integer.toString(cc[11]), 228, 247);
//		if(Integer.toString(cc[12]).length()==1)
//			gZvezda.drawString(Integer.toString(cc[12]), 55, 247);
//		else
//			gZvezda.drawString(Integer.toString(cc[12]), 50, 247);//south-west
//		if(Integer.toString(cc[2]).length()==1)
//			gZvezda.drawString(Integer.toString(cc[2]), 143, 27);
//		else
//			gZvezda.drawString(Integer.toString(cc[2]), 138, 27);//north
//		if(Integer.toString(cc[4]).length()==1)
//			gZvezda.drawString(Integer.toString(cc[4]), 143, 288);
//		else
//			gZvezda.drawString(Integer.toString(cc[4]), 138, 288);//south
//		if(Integer.toString(cc[5]).length()==1)
//			gZvezda.drawString(Integer.toString(cc[5]), 143, 157);
//		else
//			gZvezda.drawString(Integer.toString(cc[5]), 138, 157);//center
//		if(Integer.toString(cc[1]).length()==1)
//			gZvezda.drawString(Integer.toString(cc[1]), 13, 157);
//		else
//			gZvezda.drawString(Integer.toString(cc[1]), 8, 157);//west
//		if(Integer.toString(cc[3]).length()==1)
//			gZvezda.drawString(Integer.toString(cc[3]), 273, 157);
//		else
//			gZvezda.drawString(Integer.toString(cc[3]), 268, 157);//east
//		
//		JLabel jlabel = new JLabel(new ImageIcon(im2));
//		
//		jlabel.setBackground(Color.WHITE);
//		return jlabel;
//	}
	public Image fillZvezdu2(Image i, int[] cc){
		BufferedImage im2 = (BufferedImage) i;
		Graphics2D gZvezda = im2.createGraphics();
		if(gZvezda instanceof Graphics2D){
			Graphics2D g2 = (Graphics2D) gZvezda;
			g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		}
		Color Col = Color.black;
				
		gZvezda.setFont(new Font("Cetury", Font.PLAIN, 70));
		//Font font = new Font(name, style, size)
		//gZvezda.setFont(font);
		gZvezda.setColor(Col);
		if(Integer.toString(cc[9]).length()==1)
			gZvezda.drawString(Integer.toString(cc[9]), 170, 210);
		else
			gZvezda.drawString(Integer.toString(cc[9]), 148, 210);//north-west
		if(Integer.toString(cc[10]).length()==1)
			gZvezda.drawString(Integer.toString(cc[10]), 698, 210);
		else
			gZvezda.drawString(Integer.toString(cc[10]), 675, 210);//north-east
		if(Integer.toString(cc[11]).length()==1)
			gZvezda.drawString(Integer.toString(cc[11]), 698, 737);
		else
			gZvezda.drawString(Integer.toString(cc[11]), 675, 737);//south-east
		if(Integer.toString(cc[12]).length()==1)
			gZvezda.drawString(Integer.toString(cc[12]), 170, 737);
		else
			gZvezda.drawString(Integer.toString(cc[12]), 148, 737);//south-west
		if(Integer.toString(cc[2]).length()==1)
			gZvezda.drawString(Integer.toString(cc[2]), 430, 82);
		else
			gZvezda.drawString(Integer.toString(cc[2]), 408, 82);//north
		if(Integer.toString(cc[4]).length()==1)
			gZvezda.drawString(Integer.toString(cc[4]), 430, 868);
		else
			gZvezda.drawString(Integer.toString(cc[4]), 408, 868);//south
		if(Integer.toString(cc[5]).length()==1)
			gZvezda.drawString(Integer.toString(cc[5]), 430, 473);
		else
			gZvezda.drawString(Integer.toString(cc[5]), 408, 473);//center
		if(Integer.toString(cc[1]).length()==1)
			gZvezda.drawString(Integer.toString(cc[1]), 42, 473);
		else
			gZvezda.drawString(Integer.toString(cc[1]), 20, 473);//west
		if(Integer.toString(cc[3]).length()==1)
			gZvezda.drawString(Integer.toString(cc[3]), 827, 473);
		else
			gZvezda.drawString(Integer.toString(cc[3]), 805, 473);//east
/////////////////////////////////////////////////////		
		gZvezda.setFont(new Font("Cetury", Font.PLAIN, 40));
		//Font font = new Font(name, style, size)
		//gZvezda.setFont(font);
		gZvezda.setColor(Col);
		if(Integer.toString(cc[29]).length()==1)
			gZvezda.drawString(Integer.toString(cc[29]), 294, 460);//4-th Horizontal
		else													  //4-th Horizontal		
			gZvezda.drawString(Integer.toString(cc[29]), 282, 460);//4-th Horizontal
		if(Integer.toString(cc[27]).length()==1)
			gZvezda.drawString(Integer.toString(cc[27]), 185, 460);//3-th Horizontal
		else
			gZvezda.drawString(Integer.toString(cc[27]), 173, 460);//3-th Horizontal
		if(Integer.toString(cc[19]).length()==1)
			gZvezda.drawString(Integer.toString(cc[19]), 705, 460);//6-th Horizontal
		else
			gZvezda.drawString(Integer.toString(cc[19]), 692, 460);//6-th Horizontal
		if(Integer.toString(cc[17]).length()==1)
			gZvezda.drawString(Integer.toString(cc[17]), 437, 730);//2-nd Vertical
		else
			gZvezda.drawString(Integer.toString(cc[17]), 426, 730);//2-nd Vertical
		if(Integer.toString(cc[26]).length()==1)
			gZvezda.drawString(Integer.toString(cc[26]), 437, 304);//4-th Vertical
		else
			gZvezda.drawString(Integer.toString(cc[26]), 426, 304);//4-th Vertical
		if(Integer.toString(cc[24]).length()==1)
			gZvezda.drawString(Integer.toString(cc[24]), 437, 203);//5-th Vertical
		else
			gZvezda.drawString(Integer.toString(cc[24]), 426, 203);//5-th Vertical
		if(Integer.toString(cc[35]).length()==1)
			gZvezda.drawString(Integer.toString(cc[35]), 570, 594);//
		else
			gZvezda.drawString(Integer.toString(cc[35]), 557, 594);//
///////////////////////////////////////////////////////////////////////////////////		
		gZvezda.setFont(new Font("Cetury", Font.PLAIN, 36));
		
		if(Integer.toString(cc[25]).length()==1)
			gZvezda.drawString(Integer.toString(cc[25]), 438, 146);
		else
			gZvezda.drawString(Integer.toString(cc[25]), 428, 146);//west
		if(Integer.toString(cc[28]).length()==1)
			gZvezda.drawString(Integer.toString(cc[28]), 130, 458);
		else
			gZvezda.drawString(Integer.toString(cc[28]), 120, 458);//east
		if(Integer.toString(cc[94]).length()==1)
			gZvezda.drawString(Integer.toString(cc[94]), 515, 660);
		else
			gZvezda.drawString(Integer.toString(cc[94]), 505, 660);//west
		if(Integer.toString(cc[95]).length()==1)
			gZvezda.drawString(Integer.toString(cc[95]), 649, 529);
		else
			gZvezda.drawString(Integer.toString(cc[95]), 639, 529);//east
		
		return im2;
	}
	
	
	public static String zvezda(int a, int b, int c){
	String result = null;
	int c1=Sum(a);								
	int c2=Sum(b);						
	int c3=Sum(c);						
	int c4=Sum(c1, c2, c3);				
	int c5=Sum(c1,c2,c3,c4);			
	int c6=Sum(c2,c4);					
	int c7=Sum(c1,c3);					
	int c8=Sum(c6,c7);
//	Диагональный квадрат
	int c9=Sum(c1,c2);
	int c10=Sum(c2,c3);
	int c11=Sum(c3,c4);
	int c12=Sum(c1,c4);
	int c13=Sum(c9,c11);
	int c14=Sum(c10,c12);
	int c15=Sum(c13,c14);
//	int c16=Sum(c8, c15);
//	кармический хвост
	int c17=Sum(c4,c5);
	int c18=Sum(c17+c5);      	//Не уверен, +10?
	//Партнерство и деньги
	int c19=Sum(c3,c5);
	int c20=Sum(c17,c19);
	int c21=Sum(c20,c19);
	//Любовные отношения
	int c23=Sum(c17,c20);
	//чакры и здоровье
	int c24=Sum(c2,c5);
	int c25=Sum(c2, c24);
	int c26=Sum(c5,c24);
	//физическое состояние органов
	int c27=Sum(c1,c5);
	int c28=Sum(c1,c27);
	int c29=Sum(c5,c27);
	int c30=Sum(c1,c2);
	int c31=Sum(c25,c28);
	int c32=Sum(c24,c27);
	int c33=Sum(c26,c29);
	int c34=Sum(c5,c5);
	int c35=Sum(c17,c19);
	int c36=Sum(c3,c4);
	int c37=Sum(c30,c31,c32,c33,c34,c35,c36);
	//Просчеты по годам
	int c38=Sum(c1,c9);
	int c39=Sum(c1,c38);
	int c40=Sum(c1,c39);
	//int c41=Sum(c39,c38);
	int c42=Sum(c9,c38);
	int c43=Sum(c42,c38);
	int c44=Sum(c42, c9);
	int c45=Sum(c9,c2);
	int c46=Sum(c9,c45);
	int c47=Sum(c9,c46);
	int c48=Sum(c2,c46);
	int c49=Sum(c45,c2);
	int c50=Sum(c45,c49);
	int c51=Sum(c49,c45);
	int c52=Sum(c2, c10);
	int c53=Sum(c2,c52);
	int c54=Sum(c2,c53);
	int c55=Sum(c52,c53);
	int c56=Sum(c52,c10);
	int c57=Sum(c52,c56);
	int c58=Sum(c56,c10);
	int c59=Sum(c10,c3);
	int c60=Sum(c10,c59);
	int c61=Sum(c10,c60);
	int c62=Sum(c59,c60);
	int c63=Sum(c59,c3);
	int c64=Sum(c63,c3);
	int c65=Sum(c59,c63);
	int c66=Sum(c3,c11);
	int c67=Sum(c3,c66);
	int c68=Sum(c3,c67);
	int c69=Sum(c66,c67);
	int c70=Sum(c66,c11);
	int c71=Sum(c66,c70);
	int c72=Sum(c70,c11);
	int c73=Sum(c11,c4);
	int c74=Sum(c11,c73);
	int c75=Sum(c11,c74);
	int c76=Sum(c74,c73);
	int c77=Sum(c73,c4);
	int c78=Sum(c73,c77);
	int c79=Sum(c77,c4);
	int c80=Sum(c4,c12);
	int c81=Sum(c4,c80);
	int c82=Sum(c4,c81);
	int c83=Sum(c81,c80);
	int c84=Sum(c80,c12);
	int c85=Sum(c80,c84);
	int c86=Sum(c84,c12);
	int c87=Sum(c12,c1);
	int c88=Sum(c12,c87);
	int c89=Sum(c12,c88);
	int c90=Sum(c88,c87);
	int c91=Sum(c87,c1);
	int c92=Sum(c87,c91);
	int c93=Sum(c91,c1);
///////////////////////////////
	result = ("День рождения "+a+"."+b+"."+c);	
	result = result + ("\n") + ("Визитная карточка личности - "+c1+"-й аркан.");
	result = result+ ("\n") + ("Духовная сверхзадача и число ангела-хранителя - "+c2+"-й акран.");
	result = result + ("\n")+ ("Энергия-подарок при выполнении 1-го предназначения - "+c3+"-й аркан.");
	result = result + ("\n")+ ("Программа судьбы (что не проработано в прошлой жизни "+c4+"-й аркан.");
	result = result + ("\n")+ ("Точка комфорта (Центральная энергия души) "+c5+"-й аркан.");
	result = result + ("\n")+ ("Небо. Ваша энергетическая задача, духовная, нематериальная.\n Это Ваш личностный рост и все, что касается Ваших эмоций, чувств, мечтаний, мыслей. "+c6+"-й аркан.");
	result = result + ("\n")+ ("Земля. Материальный мир, здоровье, секс, финансы, карьера, бизнес.\n "+c7+"-й аркан.");
	result = result + ("\n")+ ("Первое предназначение. до 40 лет. "+c8+"-й аркан");
	result = result + ("\n")+ ("Второе предназначение. То, что нужно отдать своему роду и людям.\n Переданые от рода энергии в 'минусе'. Миссия от 40-60лет. "+c15+"-й аркан");
	result = result + ("\n")+ ("Общее предназначение. Тема жизни, ресурс, потенциал.\n До 60 лет - то в плюсе, то в минусе, но после 60 - она дается \n нам в награду либо в наказание в зависимости от выполнения 1-го и 2-го предназначения. "+c2+"-й аркан");
	result = result + ("\n")+ ("Кармический хвост в "+c4+", "+c17+", "+c18+"-м арканах");
	result = result + ("\n")+ ("Партнерство и денги "+c19+", "+c20+", "+c21+"-е арканы");
	result = result + ("\n")+ ("Вход в денежный канал. Через "+c19+"-й акран");
	result = result + ("\n")+ ("Вход в партнерские отношения, неотработанная энергия\n из прошлой жизни - "+c20+"-й аркан.");
	result = result + ("\n")+ ("Приток денежных средств - через "+c21+"-й аркан");
	result = result + ("\n")+ ("Построение любовных отношений - "+c23+", "+c17+" "+c20+"-е арканы");
	result = result + ("\n")+ ("");
	result = result + ("\n")+ ("За 1-ю чакру МУЛАДХАРУ отвечает "+c3+"-й аркан физики и "+c4+"-й аркан неба");
	result = result + ("\n")+ ("За 2-ю чакру СВАДХИСТАНУ отвечает "+c19+"-й аркан физики и "+c17+"-й аркан неба");
	result = result + ("\n")+ ("За 3-ю чакру МАНИПУРУ отвечает "+c5+"-й аркан физики и "+c5+"-й аркан неба");
	result = result + ("\n")+ ("За 4-ю чакру АНАХАТУ отвечает "+c29+"-й аркан физики и "+c26+"-й аркан неба");
	result = result + ("\n")+ ("За 5-ю чакру ВИШУДХУ отвечает "+c27+"-й аркан физики и "+c24+"-й аркан неба");
	result = result + ("\n")+ ("За 6-ю чакру АДЖНУ отвечает "+c28+"-й аркан физики и "+c25+"-й аркан неба");
	result = result + ("\n")+ ("За 7-ю чакру САХАСРАРУ отвечает "+c1+"-й аркан физики и "+c2+"-й аркан неба");
	result = result + ("\n")+ (c37+"-й аркан отвечает за все системы человека - кровоносную,\n нервную, имунную, кожную, вегето-сосудистую, костную. \n То есть за всё то, что расположено по всему телу.");
	result = result + ("\n")+ ("");
	result = result + ("\n")+("Арканы по возрастам: ");
	result = result + ("\n")+("0лет = 80 лет - 	 "+c1+"-й аркан");
	result = result + ("\n")+("1год и 3 месяца -	 "+c40+"-й аркан");
	result = result + ("\n")+("2года, 6 месяца -	 "+c39+"-й аркан");
	result = result + ("\n")+("3года, 9месяцев -	 "+c39+"-й аркан");
	result = result + ("\n")+("5лет -			 "+c38+"-й аркан");
	result = result + ("\n")+("6лет и 3 месяца -	 "+c43+"-й аркан");
	result = result + ("\n")+("7лет и 6 месяцев -	 "+c42+"-й аркан");
	result = result + ("\n")+("8лет и 9 месяцев -  	 "+c44+"-й аркан");
	result = result + ("\n")+("10лет -			 "+c9+"-й аркан");
	result = result + ("\n")+("11лет и 3 месяца -	 "+c47+"-й аркан");
	result = result + ("\n")+("12лет, 6 месяца -	 "+c46+"-й аркан");
	result = result + ("\n")+("13лет, 9месяцев -	 "+c48+"-й аркан");
	result = result + ("\n")+("15лет -			 "+c45+"-й аркан");
	result = result + ("\n")+("16лет и 3 месяца -	 "+c50+"-й аркан");
	result = result + ("\n")+("17лет и 6 месяцев -	 "+c49+"-й аркан");
	result = result + ("\n")+("18лет и 9 месяцев -	 "+c51+"-й аркан");
	result = result + ("\n")+("20лет -			 "+c2+"-й аркан");
	result = result + ("\n")+("21год и 3 месяца -	 "+c54+"-й аркан");
	result = result + ("\n")+("22года, 6 месяца -	 "+c53+"-й аркан");
	result = result + ("\n")+("23года, 9месяцев -	 "+c55+"-й аркан");
	result = result + ("\n")+("25лет -			 "+c52+"-й аркан");
	result = result + ("\n")+("26лет и 3 месяца -	 "+c57+"-й аркан");
	result = result + ("\n")+("27лет и 6 месяцев -	 "+c56+"-й аркан");
	result = result + ("\n")+("28лет и 9 месяцев -	 "+c58+"-й аркан");
	result = result + ("\n")+("30лет -			 "+c10+"-й аркан");
	result = result + ("\n")+("31год и 3 месяца -	 "+c61+"-й аркан");
	result = result + ("\n")+("32года, 6 месяца -	 "+c60+"-й аркан");
	result = result + ("\n")+("33года, 9месяцев -	 "+c62+"-й аркан");
	result = result + ("\n")+("35лет -			 "+c59+"-й аркан");
	result = result + ("\n")+("36лет и 3 месяца -	 "+c65+"-й аркан");
	result = result + ("\n")+("37лет и 6 месяцев -	 "+c63+"-й аркан");
	result = result + ("\n")+("38лет и 9 месяцев -	 "+c64+"-й аркан");
	result = result + ("\n")+("40лет -			 "+c3+"-й аркан");
	result = result + ("\n")+("41год и 3 месяца -	 "+c68+"-й аркан");
		result = result + ("\n")+("42года, 6 месяца -	 "+c67+"-й аркан");
		result = result + ("\n")+("43года, 9месяцев -	 "+c69+"-й аркан");
		result = result + ("\n")+("45лет -			 "+c66+"-й аркан");
		result = result + ("\n")+("46лет и 3 месяца -	 "+c71+"-й аркан");
		result = result + ("\n")+("47лет и 6 месяцев -	 "+c70+"-й аркан");
		result = result + ("\n")+("48лет и 9 месяцев -	 "+c72+"-й аркан");
		result = result + ("\n")+("50лет -			 "+c11+"-й аркан");
		result = result + ("\n")+("51год и 3 месяца -	 "+c75+"-й аркан");
		result = result + ("\n")+("52года, 6 месяца -	 "+c74+"-й аркан");
		result = result + ("\n")+("53года, 9месяцев -	 "+c76+"-й аркан");
		result = result + ("\n")+("55лет -			 "+c73+"-й аркан");
		result = result + ("\n")+("56лет и 3 месяца -	 "+c78+"-й аркан");
		result = result + ("\n")+("57лет и 6 месяцев -	 "+c77+"-й аркан");
		result = result + ("\n")+("58лет и 9 месяцев -	 "+c79+"-й аркан");
		result = result + ("\n")+("60лет -			 "+c4+"-й аркан");
		result = result + ("\n")+("61год и 3 месяца -	 "+c82+"-й аркан");
		result = result + ("\n")+("62года, 6 месяца -	 "+c81+"-й аркан");
		result = result + ("\n")+("63года, 9месяцев -	 "+c83+"-й аркан");
		result = result + ("\n")+("65лет -			 "+c80+"-й аркан");
		result = result + ("\n")+("66лет и 3 месяца -	 "+c85+"-й аркан");
		result = result + ("\n")+("67лет и 6 месяцев -	 "+c84+"-й аркан");
		result = result + ("\n")+("68лет и 9 месяцев -	 "+c86+"-й аркан");
		result = result + ("\n")+("70лет -			 "+c12+"-й аркан");
		result = result + ("\n")+("71год и 3 месяца -	 "+c89+"-й аркан");
		result = result + ("\n")+("72года, 6 месяца -	 "+c88+"-й аркан");
		result = result + ("\n")+("73года, 9месяцев -	 "+c90+"-й аркан");
		result = result + ("\n")+("75лет -			 "+c87+"-й аркан");
		result = result + ("\n")+("76лет и 3 месяца -	 "+c92+"-й аркан");
		result = result + ("\n")+("77лет и 6 месяцев -	 "+c91+"-й аркан");
		result = result + ("\n")+("78лет и 9 месяцев -	 "+c93+"-й аркан");
		result = result + ("\n")+("80лет -			 "+c1+"-й аркан");
	
	return result;
	}
}
