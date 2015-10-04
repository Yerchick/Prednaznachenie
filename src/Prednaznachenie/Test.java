package Prednaznachenie;
import static Prednaznachenie.Sum.*;
import static Prednaznachenie.Print.*;

class Test {
public static void main(String[] args){
	int g = 1997;
	int f = 1235;
	int f1 = Sum(f);
	int g1 = Sum(g);
	int c = Sum(f1,g1);
	print(g+" "+f);
	print(g1+" "+f1);
	print(c);
}
}
