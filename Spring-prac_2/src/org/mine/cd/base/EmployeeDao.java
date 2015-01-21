package org.mine.cd.base;


public class EmployeeDao extends BaseDao {

	
	public void save() {
		String sql = "hello";
		super.save(sql, new Object[]{});
	}
}
