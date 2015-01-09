package junit;

import example.Person;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class PersonTest {

    Person person;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testNullNamePerson() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("name can't be null");
        person = new Person(null, 10);

    }

    @Test
    public void testEmptyNamePerson() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("name can't be empty");
        person = new Person("", 10);

    }

    @Test
    public void testNegativeAgePerson() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("age can't be less than zero");
        person = new Person("Name", -1);

    }
}
