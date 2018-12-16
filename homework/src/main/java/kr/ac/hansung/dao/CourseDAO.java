package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Course;

@Repository
public class CourseDAO {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public int getRowCount() {
		String sqlStatement = "select count(*) from course";
		return jdbcTemplate.queryForObject(sqlStatement, Integer.class);
	}
	
	//query and return a single object
	public Course getCourse(String name) {
		String sqlStatement = "select * from course where name=?";
		
		return jdbcTemplate.queryForObject(sqlStatement, new Object[] {name}, 
				new RowMapper<Course>() {

					@Override
					public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
						Course course = new Course();
						
						course.setYear(rs.getInt("year"));
						course.setSemester(rs.getInt("semester"));
						course.setCode(rs.getString("code"));
						course.setName(rs.getString("name"));
						course.setDivision(rs.getString("division"));
						course.setPoint(rs.getInt("point"));
						
						return course;
					}
		});
	}
	
	//query and return a mutiple object
		public List<Course> getCourses() {
			String sqlStatement = "select * from course";
			
			return jdbcTemplate.query(sqlStatement, 
					new RowMapper<Course>() {

						@Override
						public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
							Course course = new Course();
							
							course.setYear(rs.getInt("year"));
							course.setSemester(rs.getInt("semester"));
							course.setCode(rs.getString("code"));
							course.setName(rs.getString("name"));
							course.setDivision(rs.getString("division"));
							course.setPoint(rs.getInt("point"));
							
							return course;
						}
			});
		}
		
		public boolean insert(Course course) {
			int year = course.getYear();
			int semester = course.getSemester();
			String code = course.getCode();
			String name = course.getName();
			String division = course.getDivision();
			int point = course.getPoint();

			String sqlStatement = "insert into offers (year, semester, code, name, division, point) values (?,?,?,?,?,?)";
			
			return (jdbcTemplate.update(sqlStatement, new Object[] {year,semester,code,name,division,point}) == 1);
		}

}
