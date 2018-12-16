package kr.ac.hansung.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Course {
	@NotEmpty(message="The year cannot be empty")
	private int year;
	@NotEmpty(message="The semester address cannot be empty")
	private int semester;
	@NotEmpty(message="The code address cannot be empty")
	private String code;
	@NotEmpty(message="The name address cannot be empty")
	private String name;
	@NotEmpty(message="The division address cannot be empty")
	private String division;
	@NotEmpty(message="The point address cannot be empty")
	private int point;

}
