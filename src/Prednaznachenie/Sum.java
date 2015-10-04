package Prednaznachenie;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Sum {
	
	
	
	
	public static Map<Integer, Integer> startMap(int in){
		Map<Integer, Integer> resultMap = 
				new TreeMap<Integer, Integer>();
		String s = Integer.toString(in);
		int t = in;
		for(int p =0; p<s.length();  p++ ){
	
			int	i = t%10;
		t = t/10;
		Integer num = resultMap.get(i);
		resultMap.put(i, num == null ? 1 : num + 1);
		}
		return resultMap;
	}
	public static Map<Integer, Integer> sumMap(Map<Integer, Integer> map, int i){
		String s = Integer.toString(i);
		int t = i;
		for(int p = 0; p<s.length(); p++){
			int k = t%10;
			t /=10;
			Integer num = map.get(k);
			map.put(k, num == null ? 1 : num + 1);
		}
		
		return map;
	}
	
	public static int SumOfInt(int i){
		String s = Integer.toString(i);
		int t = i;
		int g=0;
		for(int p = 0; p<s.length(); p++){
			g = g + t%10;
			t/=10;
			;
		}
		
		return g;
	}
	public static int Sum(int i){ //сумма всех цифр. Если больше 21, то сумма результата
		int sum = 0;
		int sum2 = 0;
		int k;
		if (i>22){
			while (i!=0){
			sum=sum+(i%10);
			i/=10;}
				if (sum>22){k=sum;
					while (k!=0){
					sum2=sum2+(k%10);
					k/=10;}
					return sum2;}
				else sum2=sum;}else sum2=i;
		return sum2;}
	public static int SumUnLim(int i){ //сумма всех цифр
		int sum = 0;
			while (i!=0){
			sum=sum+(i%10);
			i/=10;}
				
		return sum;}
	public static int Sum(int i, int p){
		int sum=0;
		int sum2=0;
		sum=i+p;
		if (sum>22){
			while(sum!=0){
				sum2=sum2+(sum%10);
				sum/=10;}
			return sum2;}
		else sum2=sum;	
		return sum2;
	}
	public static int Sum(int i, int p, int t){
		int sum=0;
		int sum2=0;
		sum=i+p+t;
		if (sum>22){
			while(sum!=0){
				sum2=sum2+(sum%10);
				sum/=10;}
		}else sum2=sum;
		return sum2;
	}
	public static int Sum(int i, int p, int t, int k){
		int sum=0;
		int sum2=0;
		sum=i+p+t+k;
		if (sum>22){
			while(sum!=0){
				sum2=sum2+(sum%10);
				sum/=10;
			}
		}else sum2=sum;
		return sum2;
	}
	public static int Sum(int i, int p, int t, int k, int h, int g, int r){
		int sum=0;
		int sum2=0;
		sum=i+p+t+k+h+g+r;
		if (sum>22){
			while(sum!=0){
				sum2=sum2+(sum%10);
				sum/=10;
			}
		}else sum2=sum;
		return sum2;
	}
}
