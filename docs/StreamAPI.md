## Java8 ������

1. Stream API
���Ͻ��������ݣ�Stream�����Ǽ���
��ע���Ƕ����ݵ����㣬��CPU�򽻵�

����Stream�ķ�ʽ�� ͨ������
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
```

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
```
