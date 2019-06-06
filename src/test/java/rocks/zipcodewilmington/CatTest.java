package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.Animal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //When
        String expected = "Oreo";
        cat.setName(expected);
        String actual = cat.getName();

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void speakTest() {

        Cat cat = new Cat("Clifford", new Date(), 0);

        String expected = "meow!";
        String actual = cat.speak();

        Assert.assertEquals(actual, expected);


    }

    @Test
    public void setBirthDateTest() {

        Cat cat = new Cat("Bill", new Date(), 0);

        Date expected = new Date(1992, 6, 29);
        cat.setBirthDate(expected);
        Date actual = cat.getBirthDate();

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void eatTest() {



    }

    @Test
    public void getIdTest(){


        Cat cat = new Cat("Joe", new Date(), 0);

        //When
        Integer expected = 0;
        Integer actual = cat.getId();

        Assert.assertEquals(actual, expected);


    }

    @Test
    public void AnimalTest(){


        Cat cat = new Cat("Bill", new Date(), 0);

        boolean expected= cat instanceof Animal;
        boolean actual = true;

        Assert.assertEquals(actual, expected);
    }




    @Test
    public void MammalTest(){

        Cat cat = new Cat("Bill", new Date(), 0);

        boolean expected= cat instanceof Mammal;
        boolean actual = true;

            Assert.assertEquals(actual, expected);

    }


}