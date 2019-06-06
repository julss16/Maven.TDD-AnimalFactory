package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }


    @Test
    public void speakTest() {

        Dog dog = new Dog("Clifford", new Date(), 0);

        String expected = "bark!";
        String actual = dog.speak();

        Assert.assertEquals(actual, expected);


    }

    @Test
    public void setBirthDateTest() {

        Dog dog = new Dog("Bill", new Date(), 0);

        Date expected = new Date(1994, 7, 25);
        dog.setBirthDate(expected);
        Date actual = dog.getBirthDate();

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void eatTest() {


    }

    @Test
    public void getIdTest() {


        Dog dog = new Dog("Joe", new Date(), 0);

        //When
        Integer expected = 0;
        Integer actual = dog.getId();

        Assert.assertEquals(actual, expected);


    }

    @Test
    public void AnimalTest() {


        Dog dog = new Dog("Bill", new Date(), 0);

        boolean expected = dog instanceof Animal;
        boolean actual = true;

        Assert.assertEquals(actual, expected);
    }


    @Test
    public void MammalTest() {

        Dog dog = new Dog("Bill", new Date(), 0);

        boolean expected = dog instanceof Mammal;
        boolean actual = true;

        Assert.assertEquals(actual, expected);

    }
}

