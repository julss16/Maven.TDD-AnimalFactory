package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 *
 *
 * Cat cat = new Cat(givenName, givenBirthDate, givenId);
 *
 *         //When
 *         String expected = "Oreo";
 *         cat.setName(expected);
 *         String actual = cat.getName();
 *
 *         Assert.assertEquals(actual, expected);
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`


    @Test
    public void createDogTest() {
        Dog expected = DogHouse.getDogById(1);
        Dog actual= DogHouse.getDogById(DogHouse.getNumberOfDogs());

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void createCatTest() {
        Cat expected = CatHouse.getCatById(1);
        Cat actual= CatHouse.getCatById(CatHouse.getNumberOfCats());

        Assert.assertEquals(actual, expected);

    }

}

