package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.CourseDAO;
import kr.ac.hansung.model.Course;

@Service
public class CourseService {

	@Autowired
	private CourseDAO courseDAO;
	
	public List<Course> getCurrent() {
		return courseDAO.getCourses();
	}

	public void insert(Course course) {
		courseDAO.insert(course);
	}

}
