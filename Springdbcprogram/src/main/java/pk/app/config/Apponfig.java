package pk.app.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Apponfig {
	
	
	@Bean
	public JdbcTemplate jtobj()
	{
		JdbcTemplate jt=new JdbcTemplate();
		jt.setDataSource(dsobj());
		return jt;
	}
	
	@Bean
	public DataSource dsobj()
	{  
		DriverManagerDataSource ds=new DriverManagerDataSource();
		
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/test");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
		
		
	}

}
