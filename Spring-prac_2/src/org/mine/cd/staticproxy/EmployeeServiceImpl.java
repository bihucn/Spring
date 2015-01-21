package org.mine.cd.staticproxy;

public class EmployeeServiceImpl extends EmployeeServiceProxy {

	@Override
	public void save() {
		System.out.println("save...");
	}

	@Override
	public void update() {
		System.out.println("update....");
	}

}
