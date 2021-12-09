package datastructure.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void search() {
        LinkedList list = new LinkedList();
        list.insert(56);
        list.insert(30);
        list.insert(70);
        Assert.assertSame(30, list);
    }
}
