package org.mine.cd.jdkproxy2;

//真实对象
public class EmployeeServiceImpl implements IEmployeeService {
	public void save() {
		System.out.println("..save employee...");
	}

	public void update() {
		System.out.println("..update employee...");
		throw new RuntimeException("挂了..");
	}
}
