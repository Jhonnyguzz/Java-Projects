package entities;

public class Student implements Comparable<Student>
{
	private static int studentCount = 0;	
	private String name;
	private String id;
		
	public Student(String name, String id) {
		
		this.name = name;
		this.id = id;
	}
	public String toString()
	{
		String ans = "";
		ans += name+"("+id+")";
		return ans;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public static int getStudentCount() {
		return studentCount;
	}

	public static void setStudentCount(int studentCount) {
		Student.studentCount = studentCount;
	}
	@Override
	public int compareTo(Student other)
	{ 		
		return this.id.compareTo(other.getId());
	}
	
}
