package rocks.zipcodewilmington;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`


    @Test
    public void add() {
        CatHouse cathouse = new CatHouse();
        Cat cat = new Cat ("Dan", new Date(), 0);
        CatHouse.clear();

        cathouse.add(cat);
        Number expected = cathouse.getNumberOfCats();
        Number actual = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void remove() {

        CatHouse cathouse = new CatHouse();
        Cat cat = new Cat("Dan", new Date(), 0);
        cathouse.add(cat);
        cathouse.remove(cathouse.getCatById(cat.getId()));

        Number expected = CatHouse.getNumberOfCats();
        Number actual= 1;
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void remove1() {

        CatHouse cathouse = new CatHouse();
        Cat cat = new Cat("Dan", new Date(), 0);
        cathouse.add(cat);
        cathouse.remove(cat);

        Number expected = cathouse.getNumberOfCats();
        Number actual= 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getCatById() {

        CatHouse cathouse = new CatHouse();
        Cat cat = new Cat("Oreo", new Date(), 0);
        cathouse.add(cat);

        Cat expected =  cathouse.getCatById(cat.getId());
        Cat actual = cathouse.getCatById(0) ;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getNumberOfCats() {

        CatHouse cathouse = new CatHouse();
        Cat cat = new Cat("Oreo", new Date(), 0);
        cathouse.add(cat);

        Number expected = cathouse.getNumberOfCats();
        Number actual= 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void clear() {
    }

}













