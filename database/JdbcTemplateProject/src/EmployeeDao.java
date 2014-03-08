import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;


public class EmployeeDao implements TopDao {
	
	private DataSource dataSource;
	private JdbcTemplate jt;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jt = new JdbcTemplate(dataSource);
	}

	public int create(Object obj) {
		
		Employee e = (Employee)obj;
		String sql = "insert into employee (NAME, EMPID) values('" +
		e.getName() +"', '" +
		e.getEmpid() + "')";
		return jt.update(sql);
		
		
	}

}
