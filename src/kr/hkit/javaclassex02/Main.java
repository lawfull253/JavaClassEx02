package kr.hkit.javaclassex02;

public class Main {

	public static void main(String[] args) {
		
		// <문제>
		// AA 클래스를 상속받아서 AAA 클래스 만들기
		
		AAA aaa = new AAA();
		aaa.a = 1;
		aaa.printA();
	
		// <결과>
		// 1
		
		
		// <문제>
		// BB 클래스를 상속받아서 BBB 클래스 만들기
		
		BBB bbb = new BBB();
		bbb.a = 1;
		bbb.printA();
		
		// <결과>
		// 1		
		

		// <문제>
		// CC 클래스를 상속받아서 CCC 클래스 만들기		
		
		CCC ccc = new CCC();		
		ccc.setA(1);
		ccc.printA();
		
		// <결과>
		// 1		
		

		// <문제>
		// DD 클래스를 상속받아서 DDD 클래스 만들기
		
		DDD ddd = new DDD();
		ddd.setA(1);
		int a = ddd.getA();
		System.out.println(a);
		
		// <결과>
		// 1		
		

		// <문제>
		// EE 클래스를 상속받아서 EEE 클래스 만들기		
		
		EEE eee = new EEE();
		eee.a = 1;
		eee.printA();
		eee.b = 2;
		eee.printB();
		
		// <결과>
		// 1	
		// 2
		
		
		// <문제>
		// FF 클래스를 상속받아서 FFF 클래스 만들기	
		
		FFF fff = new FFF();
		fff.a = 1;
		fff.printA();
		fff.b = 2;
		fff.printB();
		
		// <결과>
		// 1	
		// 2
		
		
		// <문제>
		// GG 클래스를 상속받아서 GGG 클래스 만들기
		
		GGG ggg = new GGG();
		ggg.a = 1;
		ggg.b = 2;
		ggg.printSum();
		
		// <결과>
		// 3	
		
		
		// <문제>
		// HH 클래스를 상속받아서 HHH 클래스 만들기
		
		HHH hhh = new HHH();
		hhh.a = 1;
		hhh.b = 2;
		int sum = hhh.sum();
		System.out.println(sum);
		
		// <결과>
		// 3		
		
		
		// <문제>
		// II 클래스를 상속받아서 III 클래스 만들기
		
		III iii = new III();
		iii.a = 1;
		iii.b = 2;
		iii.c = 3;
		iii.printSum();
		
		// <결과>
		// 5		
		
		
		// <문제>
		// JJ 클래스를 상속받아서 JJJ 클래스 만들기
		
		JJJ jjj = new JJJ();
		jjj.a = 1;
		jjj.b = 2;
		jjj.c = 3;
		int sum2 = jjj.sum();
		System.out.println(sum2);
		
		// <결과>
		// 5		
	}

}
