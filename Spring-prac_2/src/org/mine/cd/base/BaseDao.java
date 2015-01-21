package org.mine.cd.base;

public class BaseDao {

	private String conn;
	
	public void setConn(String conn) {
		this.conn = conn;
	}
	
	public void save(String sql,Object...parms){
		
		System.out.println(conn);
		System.out.println(sql);
	}
	
	
}
