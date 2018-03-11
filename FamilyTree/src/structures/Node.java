package structures;

import java.util.ArrayList;
import java.util.Date;

public class Node {
	
	//Basic
	private int id;
    private String name;
    private String lastName;
    private Date birthdate;
    private Date deathdate;
    private int age;
    private String location;
    
    public static enum Sex {
		MALE,
		FEMALE;
	}
	
    //Relations
	private Sex sex;
	private Node father;
	private Node mother;
	private Node spouse;
	private ArrayList<Node> children;

	//Contact
	private String email;
	private String phone;
	
	//Biographical
	private String birthPlace;
	private String profession;
}
