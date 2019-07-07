package com.wjx.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import org.junit.Test;

public class LambdaTest {
	
	@Test
	public void testLambda() {
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("�Ұ��찲��");
			}
		};
		r1.run();
		
		Runnable r2 = () -> System.out.println("�Ұ��ʹ�");
		r2.run();
	}
	
	@Test
	public void testLambda1() {
		Consumer<String> con = (String s) -> {
			System.out.println(s);
		};
		con.accept("���Ժ����Ե�������ʲô��");
		
		List<String> list = new ArrayList<>();
		
		Consumer<String> con1 = s -> {
			System.out.println(s);
		};
		
		Comparator<Integer> con3 = (o1, o2) -> {
			System.out.println(o1);
			System.out.println(o2);
			return o1.compareTo(o2);
		};
	}

}
