package Prednaznachenie;
import static Prednaznachenie.Sum.*;
import static java.lang.Math.*;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.util.Map;
import java.util.TreeMap;



public class Pifagor {
	public static int[] getPifagorNumbersFromMap(Map<Integer,Integer> mm){
		int[] ints = new int[10];
		for(int i =1;i<10;i++){
			if(mm.get(i) == null)
				continue;
			int t = mm.get(i);
			if(i==1){
				if(t>5)
				t=t-5;
			}
			int j = i;
			for(int h=0;h<t;h++){
				ints[i] =ints[i] + j;
				j=j*10;
			}
			
		}
		
		return ints;
	}
	
	public static Image fillPifagorTable(Image i, Map<Integer,Integer> mm){
		BufferedImage ii = (BufferedImage) i;
		Graphics2D g = ii.createGraphics();
		if(g instanceof Graphics2D){
			Graphics2D g2 = (Graphics2D) g;
			g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		}
		g.setFont(new Font("Cetury", Font.PLAIN, 52));
		g.setColor(Color.BLACK);
		int[] h = new int[10];		
		int[] v = new int[10]; int var=15;
		h[1] = 160; 				v[1] = 500;
		h[2] = 160;					v[2] = 325;		
		h[3] = 160;					v[3] = 130;		
		h[4] = 340;					v[4] = 500;		
		h[5] = 340;					v[5] = 325;		
		h[6] = 340;					v[6] = 130;		
		h[7] = 530;					v[7] = 500;		
		h[8] = 530;					v[8] = 325;		
		h[9] = 530;					v[9] = 130;		
		int[] ints = Pifagor.getPifagorNumbersFromMap(mm);
		for(int o =1;o<10;o++){
				if(ints[o] == 0){
					g.drawString("-", h[o]+var, v[o]);
				continue;}
				if(Integer.toString(ints[o]).length()==1)
					g.drawString(Integer.toString(ints[o]), h[o], v[o]);
				if(Integer.toString(ints[o]).length()==2)
					g.drawString(Integer.toString(ints[o]), h[o]-var, v[o]);
				if(Integer.toString(ints[o]).length()==3)
					g.drawString(Integer.toString(ints[o]), h[o]-(var*2), v[o]);
				if(Integer.toString(ints[o]).length()==4)
					g.drawString(Integer.toString(ints[o]), h[o]-(var*3), v[o]);
				if(Integer.toString(ints[o]).length()==5)
					g.drawString(Integer.toString(ints[o]), h[o]-(var*4), v[o]);
				if(Integer.toString(ints[o]).length()==6)
					g.drawString(Integer.toString(ints[o]), h[o]-(var*5), v[o]);

		}
		
		
		
		return ii;
	}
	
	public static int len(int i){
		String s = Integer.toString(i);
		int o = (int) pow(10, Integer.getInteger(s, s.length()));
		
		return o;
		}
	public static Map<Integer, Integer> Pifagor (int day, int month, int year){
		Map<Integer, Integer> result = new TreeMap<Integer, Integer>();
		result = startMap(day);
		result = sumMap(result, month);
		result = sumMap(result, year);
		int birthDate = SumOfInt(day) + SumOfInt(month) + SumOfInt(year); //сумма цифр даты рождения
		
		result = sumMap(result, birthDate);
		int birthDateSum = SumOfInt(birthDate);
		result = sumMap(result, birthDateSum);
		//print(birthDate);
		int t=day;
		String s = Integer.toString(t);
		if(s.length()>1){
			t/=10;
		}
		int birthDate2 = birthDate - 2*(t%10);
		//print(birthDate2);
		//print(t);
		result = sumMap(result, birthDate2);
		int birthDate2Sum = SumOfInt(birthDate2);
		//print(birthDate2Sum);
		result = sumMap(result, birthDate2Sum);
		return result;
	}

//////////////////////////////////////////////////////////////////	
//	public static void main(String[] args)throws Exception{
//		int day = 7;
//		int month = 8;
//		int year = 1991;
//		// a = Pifagor(day,month,year);
//		Map<Integer, Integer> map1 = 
//		new TreeMap<Integer, Integer>();
//		map1 = Pifagor(day,month,year);
//		print(map1);
//			
//	}
}
