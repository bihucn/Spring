package org.mine.cd.aop;


public class UserServiceImpl implements IUserService {

	@Override
	public void save() {
		System.out.println("save ...");
		
		
	}

	@Override
	public void update() {

		System.out.println("update...");
	}

}
