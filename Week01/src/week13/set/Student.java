package week13.set;

public class Student implements Comparable<Student>{
	private String id;
	private String name;
	private String sex;
	private int goal;
	
	public Student(String id, String name, String sex, int goal) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.goal = goal;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student)) {
			throw new ClassCastException("¿‡–Õ¥ÌŒÛ");
		}
		Student student=(Student)obj;
		return student.id==this.id?true:false;

	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getGoal() {
		return goal;
	}
	public void setGoal(int goal) {
		this.goal = goal;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", goal=" + goal + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub	
		
		return (this.goal-o.goal)==0?this.id.compareTo(o.id):(this.goal-o.goal);
	}
	
}
