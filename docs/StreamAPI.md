## Java8 ������

1. Stream API
���Ͻ��������ݣ�Stream�����Ǽ���
��ע���Ƕ����ݵ����㣬��CPU�򽻵�

**����Stream�ķ�ʽ�� ͨ������**

```
default Stream(E) Stream() : ����һ��˳����
default Stream(E) parallelStream() ������һ��������

public void test1() {
	List<Employee> employee = new ArrayList<>();
	//default Stream(E) Stream() : ����һ��˳����
	Stream<Employee> stream = employee.stream();
	
	//default Stream(E) parallelStream() ������һ��������
	Stream<Employee> parallelStream = employee.parallelStream();
}

default Stream(E) Stream() : ����һ��˳����
default Stream(E) parallelStream() ������һ��������

public void test1() {
	List<Employee> employee = new ArrayList<>();
	//default Stream(E) Stream() : ����һ��˳����
	Stream<Employee> stream = employee.stream();
	
	//default Stream(E) parallelStream() ������һ��������
	Stream<Employee> parallelStream = employee.parallelStream();
}
```

**������ʽ����ͨ������**

```
public void test2() {
	int [] arr = {1,2,3,4,5,5,6};
	//����Arrays���static<T> Stream<T> stream(T[] array) : ����һ����
	IntStream stream = Arrays.stream(arr);
	
	Employee e1 = new Employee(1, "tome", 12);
	Employee e2 = new Employee(2, "toni", 13);
	Employee[] arr1 = new Employee[]{e1, e2};
    Stream<Employee> stream1 = Arrays.stream(arr1);
}
```

**������ʽ����ͨ�^Stream��of()**

```
public void test3() {
	Stream.of(1,2,3,4,5,5,6);
}

```	


**��ʽ�ģ�����������**

```
 //���� static<T> Stream<T> iterate(final T seed, final UnaryOperater<T> f)
public void test4() {
	Stream.iterate(0, t -> t +2 ).limit(10).forEach(System.out :: println);
}
```






