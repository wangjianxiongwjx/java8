## Java8 ������
1. Lambda ���ʽ��ʹ��
   -> ��lambda ������ ���� ��ͷ������
   -> ��ߣ�lambda���ʽ���β��б���ʵ���ǽӿ��еĳ��󷽷����β��б�
   -> �ұߣ�lambda �� ����ʵ������д�ĳ��󷽷��ķ����壩

```
           �﷨��ʽһ�� �޲Σ��޷���ֵ 
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
```

```
	�﷨��ʽ����lambda���ʽ��Ҫһ����������û�з���ֵ
	public void testLambda1() {
		Consumer<String> con = (String s) -> {
			System.out.println(s);
		};
		con.accept("���Ժ����Ե�������ʲô��");
	}
```

```
	�﷨��ʽ���� �������Ϳ���ʡ����Ϊ�����ɱ������ƶϵó��� ��Ϊ �����ƶ�
	List<String> list = new ArrayList<>();
	
	�﷨��ʽ�ģ�lambda ��ֻ��Ҫһ������ʱ������С���ſ���ʡ��
	Consumer<String> con1 = s -> {
		System.out.println(s);
	};
```

```
	�﷨��ʽ�壺 lambda ��Ҫ�����������ϲ���������ִ����䣬���ҿ������з���ֵ
	Comparator<Integer> con3 = (o1, o2) -> {
		System.out.println(o1);
		System.out.println(o2);
		return o1.compareTo(o2);
	};
```

```
	�﷨��ʽ���� ��lambda ��ֻ��һ�����ʱ��return������Ŷ�����ʡ��
	Comparator<Integer> con3 = (o1, o2) -> o1.compareTo(o2);
```

















