import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LabTest {
    Lab lab;
    @Before
    public void setUp(){
        lab = new Lab();
    }
    /**
     * [1, 2, 3, 4, 5] should deserialize to a list containing 1, 2, 3, 4, 5 in that order
     */
    @Test
    public void deserializationTest1(){
        String list = "[1, 2, 3, 4, 5]";
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        List<Integer> actual = lab.deserialize(list);
        Assert.assertEquals(expected, actual);
    }
    /**
     * [2, 3, 5, 7] should deserialize to a list containing 2, 3, 5, 7 in that order
     */
    @Test
    public void deserializationTest2(){
        String list = "[2, 3, 5, 7]";
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        List<Integer> actual = lab.deserialize(list);
        Assert.assertEquals(expected, actual);
    }

    /**
     * an empty list should deserialize to an empty list
     */
    @Test
    public void deserializationTestEmpty(){
        String list = "[]";
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = lab.deserialize(list);
        Assert.assertEquals(expected, actual);
    }
}
