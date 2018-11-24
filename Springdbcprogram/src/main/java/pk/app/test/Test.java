package pk.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.jdbc.core.JdbcTemplate;

import pk.app.config.Apponfig;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext a=new AnnotationConfigApplicationContext(Apponfig.class);
		JdbcTemplate j=(JdbcTemplate)a.getBean("jtobj");
		String sql="insert into stdtab values(?,?,?)";
		int count=j.update(sql,18,6.4,"F");
		System.out.println(count);
		
		/*String sql="update stdtab set sname=?,smarks=?";
		int i=j.update(sql,"N",2.5,12);
		System.out.println(i);*/
		
		/*String sql="delete  from stdtab";
		int i=j.update(sql);
		System.out.println(i);*/
	}

}
