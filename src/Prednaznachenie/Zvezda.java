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
//	������������ �������
	c[9]=Sum(c[1],c[2]);
	c[10]=Sum(c[2],c[3]);
	c[11]=Sum(c[3],c[4]);
	c[12]=Sum(c[1],c[4]);
	c[13]=Sum(c[9],c[11]);
	c[14]=Sum(c[10],c[12]);
	c[15]=Sum(c[13],c[14]);
	c[16]=Sum(c[8], c[15]);
//	����������� �����
	c[17]=Sum(c[4],c[5]);
	c[18]=Sum(c[17]+c[5]);      	//�� ������, +10?
	//����������� � ������
	c[19]=Sum(c[3],c[5]);
	c[20]=Sum(c[17],c[19]);
	c[21]=Sum(c[20],c[19]);
	//�������� ���������
	c[23]=Sum(c[17],c[20]);
	//����� � ��������
	c[24]=Sum(c[2],c[5]);
	c[25]=Sum(c[2], c[24]);
	c[26]=Sum(c[5],c[24]);
	//���������� ��������� �������
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
	//�������� �� �����
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
//	������������ �������
	int c9=Sum(c1,c2);
	int c10=Sum(c2,c3);
	int c11=Sum(c3,c4);
	int c12=Sum(c1,c4);
	int c13=Sum(c9,c11);
	int c14=Sum(c10,c12);
	int c15=Sum(c13,c14);
//	int c16=Sum(c8, c15);
//	����������� �����
	int c17=Sum(c4,c5);
	int c18=Sum(c17+c5);      	//�� ������, +10?
	//����������� � ������
	int c19=Sum(c3,c5);
	int c20=Sum(c17,c19);
	int c21=Sum(c20,c19);
	//�������� ���������
	int c23=Sum(c17,c20);
	//����� � ��������
	int c24=Sum(c2,c5);
	int c25=Sum(c2, c24);
	int c26=Sum(c5,c24);
	//���������� ��������� �������
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
	//�������� �� �����
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
	result = ("���� �������� "+a+"."+b+"."+c);	
	result = result + ("\n") + ("�������� �������� �������� - "+c1+"-� �����.");
	result = result+ ("\n") + ("�������� ����������� � ����� ������-��������� - "+c2+"-� �����.");
	result = result + ("\n")+ ("�������-������� ��� ���������� 1-�� �������������� - "+c3+"-� �����.");
	result = result + ("\n")+ ("��������� ������ (��� �� ����������� � ������� ����� "+c4+"-� �����.");
	result = result + ("\n")+ ("����� �������� (����������� ������� ����) "+c5+"-� �����.");
	result = result + ("\n")+ ("����. ���� �������������� ������, ��������, ��������������.\n ��� ��� ���������� ���� � ���, ��� �������� ����� ������, ������, ��������, ������. "+c6+"-� �����.");
	result = result + ("\n")+ ("�����. ������������ ���, ��������, ����, �������, �������, ������.\n "+c7+"-� �����.");
	result = result + ("\n")+ ("������ ��������������. �� 40 ���. "+c8+"-� �����");
	result = result + ("\n")+ ("������ ��������������. ��, ��� ����� ������ ������ ���� � �����.\n ��������� �� ���� ������� � '������'. ������ �� 40-60���. "+c15+"-� �����");
	result = result + ("\n")+ ("����� ��������������. ���� �����, ������, ���������.\n �� 60 ��� - �� � �����, �� � ������, �� ����� 60 - ��� ������ \n ��� � ������� ���� � ��������� � ����������� �� ���������� 1-�� � 2-�� ��������������. "+c2+"-� �����");
	result = result + ("\n")+ ("����������� ����� � "+c4+", "+c17+", "+c18+"-� �������");
	result = result + ("\n")+ ("����������� � ����� "+c19+", "+c20+", "+c21+"-� ������");
	result = result + ("\n")+ ("���� � �������� �����. ����� "+c19+"-� �����");
	result = result + ("\n")+ ("���� � ����������� ���������, �������������� �������\n �� ������� ����� - "+c20+"-� �����.");
	result = result + ("\n")+ ("������ �������� ������� - ����� "+c21+"-� �����");
	result = result + ("\n")+ ("���������� �������� ��������� - "+c23+", "+c17+" "+c20+"-� ������");
	result = result + ("\n")+ ("");
	result = result + ("\n")+ ("�� 1-� ����� ��������� �������� "+c3+"-� ����� ������ � "+c4+"-� ����� ����");
	result = result + ("\n")+ ("�� 2-� ����� ����������� �������� "+c19+"-� ����� ������ � "+c17+"-� ����� ����");
	result = result + ("\n")+ ("�� 3-� ����� �������� �������� "+c5+"-� ����� ������ � "+c5+"-� ����� ����");
	result = result + ("\n")+ ("�� 4-� ����� ������� �������� "+c29+"-� ����� ������ � "+c26+"-� ����� ����");
	result = result + ("\n")+ ("�� 5-� ����� ������� �������� "+c27+"-� ����� ������ � "+c24+"-� ����� ����");
	result = result + ("\n")+ ("�� 6-� ����� ����� �������� "+c28+"-� ����� ������ � "+c25+"-� ����� ����");
	result = result + ("\n")+ ("�� 7-� ����� ��������� �������� "+c1+"-� ����� ������ � "+c2+"-� ����� ����");
	result = result + ("\n")+ (c37+"-� ����� �������� �� ��� ������� �������� - �����������,\n �������, �������, ������, ������-����������, �������. \n �� ���� �� �� ��, ��� ����������� �� ����� ����.");
	result = result + ("\n")+ ("");
	result = result + ("\n")+("������ �� ���������: ");
	result = result + ("\n")+("0��� = 80 ��� - 	 "+c1+"-� �����");
	result = result + ("\n")+("1��� � 3 ������ -	 "+c40+"-� �����");
	result = result + ("\n")+("2����, 6 ������ -	 "+c39+"-� �����");
	result = result + ("\n")+("3����, 9������� -	 "+c39+"-� �����");
	result = result + ("\n")+("5��� -			 "+c38+"-� �����");
	result = result + ("\n")+("6��� � 3 ������ -	 "+c43+"-� �����");
	result = result + ("\n")+("7��� � 6 ������� -	 "+c42+"-� �����");
	result = result + ("\n")+("8��� � 9 ������� -  	 "+c44+"-� �����");
	result = result + ("\n")+("10��� -			 "+c9+"-� �����");
	result = result + ("\n")+("11��� � 3 ������ -	 "+c47+"-� �����");
	result = result + ("\n")+("12���, 6 ������ -	 "+c46+"-� �����");
	result = result + ("\n")+("13���, 9������� -	 "+c48+"-� �����");
	result = result + ("\n")+("15��� -			 "+c45+"-� �����");
	result = result + ("\n")+("16��� � 3 ������ -	 "+c50+"-� �����");
	result = result + ("\n")+("17��� � 6 ������� -	 "+c49+"-� �����");
	result = result + ("\n")+("18��� � 9 ������� -	 "+c51+"-� �����");
	result = result + ("\n")+("20��� -			 "+c2+"-� �����");
	result = result + ("\n")+("21��� � 3 ������ -	 "+c54+"-� �����");
	result = result + ("\n")+("22����, 6 ������ -	 "+c53+"-� �����");
	result = result + ("\n")+("23����, 9������� -	 "+c55+"-� �����");
	result = result + ("\n")+("25��� -			 "+c52+"-� �����");
	result = result + ("\n")+("26��� � 3 ������ -	 "+c57+"-� �����");
	result = result + ("\n")+("27��� � 6 ������� -	 "+c56+"-� �����");
	result = result + ("\n")+("28��� � 9 ������� -	 "+c58+"-� �����");
	result = result + ("\n")+("30��� -			 "+c10+"-� �����");
	result = result + ("\n")+("31��� � 3 ������ -	 "+c61+"-� �����");
	result = result + ("\n")+("32����, 6 ������ -	 "+c60+"-� �����");
	result = result + ("\n")+("33����, 9������� -	 "+c62+"-� �����");
	result = result + ("\n")+("35��� -			 "+c59+"-� �����");
	result = result + ("\n")+("36��� � 3 ������ -	 "+c65+"-� �����");
	result = result + ("\n")+("37��� � 6 ������� -	 "+c63+"-� �����");
	result = result + ("\n")+("38��� � 9 ������� -	 "+c64+"-� �����");
	result = result + ("\n")+("40��� -			 "+c3+"-� �����");
	result = result + ("\n")+("41��� � 3 ������ -	 "+c68+"-� �����");
		result = result + ("\n")+("42����, 6 ������ -	 "+c67+"-� �����");
		result = result + ("\n")+("43����, 9������� -	 "+c69+"-� �����");
		result = result + ("\n")+("45��� -			 "+c66+"-� �����");
		result = result + ("\n")+("46��� � 3 ������ -	 "+c71+"-� �����");
		result = result + ("\n")+("47��� � 6 ������� -	 "+c70+"-� �����");
		result = result + ("\n")+("48��� � 9 ������� -	 "+c72+"-� �����");
		result = result + ("\n")+("50��� -			 "+c11+"-� �����");
		result = result + ("\n")+("51��� � 3 ������ -	 "+c75+"-� �����");
		result = result + ("\n")+("52����, 6 ������ -	 "+c74+"-� �����");
		result = result + ("\n")+("53����, 9������� -	 "+c76+"-� �����");
		result = result + ("\n")+("55��� -			 "+c73+"-� �����");
		result = result + ("\n")+("56��� � 3 ������ -	 "+c78+"-� �����");
		result = result + ("\n")+("57��� � 6 ������� -	 "+c77+"-� �����");
		result = result + ("\n")+("58��� � 9 ������� -	 "+c79+"-� �����");
		result = result + ("\n")+("60��� -			 "+c4+"-� �����");
		result = result + ("\n")+("61��� � 3 ������ -	 "+c82+"-� �����");
		result = result + ("\n")+("62����, 6 ������ -	 "+c81+"-� �����");
		result = result + ("\n")+("63����, 9������� -	 "+c83+"-� �����");
		result = result + ("\n")+("65��� -			 "+c80+"-� �����");
		result = result + ("\n")+("66��� � 3 ������ -	 "+c85+"-� �����");
		result = result + ("\n")+("67��� � 6 ������� -	 "+c84+"-� �����");
		result = result + ("\n")+("68��� � 9 ������� -	 "+c86+"-� �����");
		result = result + ("\n")+("70��� -			 "+c12+"-� �����");
		result = result + ("\n")+("71��� � 3 ������ -	 "+c89+"-� �����");
		result = result + ("\n")+("72����, 6 ������ -	 "+c88+"-� �����");
		result = result + ("\n")+("73����, 9������� -	 "+c90+"-� �����");
		result = result + ("\n")+("75��� -			 "+c87+"-� �����");
		result = result + ("\n")+("76��� � 3 ������ -	 "+c92+"-� �����");
		result = result + ("\n")+("77��� � 6 ������� -	 "+c91+"-� �����");
		result = result + ("\n")+("78��� � 9 ������� -	 "+c93+"-� �����");
		result = result + ("\n")+("80��� -			 "+c1+"-� �����");
	
	return result;
	}
}
