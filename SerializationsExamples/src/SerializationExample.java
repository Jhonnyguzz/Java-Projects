import serializtionutilities.MySerialize;
import entities.GeneralContainer;
import entities.Person;
import entities.PersonContainer;
public class SerializationExample
{
	public static void main(String [] args)
	{
		String fileName = "person.ser";		
		Person p = new Person("Rafael",11L);
		MySerialize.serialize(fileName, p);
		Object otherRefToP = p;
		MySerialize.serialize(fileName, otherRefToP);
		Person other = MySerialize.deserializePerson(fileName);
		System.out.println(other);
		Object o = MySerialize.deserialize(fileName);
		System.out.println(o);
		
		System.out.println("Person Conainer example:");
		GeneralContainer pc = new PersonContainer();
		pc.add(p);
		Person p2 = new Person("Jose",22L);
		Person p3 = new Person("Diego",33L);
		Person p22 = new Person("OtroJose",22L);
		Person p33 = new Person("OtroDiego",33L);
		pc.add(p2);
		pc.add(p3);
		pc.add(p22);
		pc.add(p33);
		System.out.println(pc);
		fileName = "personscontainer.ser";
		MySerialize.serialize(fileName, pc);
		GeneralContainer gc = (GeneralContainer) MySerialize.deserialize(fileName);
		System.out.println("Deserialization: ");
		System.out.println(gc);
	}	
}
