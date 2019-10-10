import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

public class QueueTest {

    //Cola tipo first in first out
    @Before
    public void setUp() throws Exception{
        Queue cola = new QueuesImpl<Users>(10);
        cola.push(new Users("Marc","43222633K",4));
        cola.push(new Users("Juan","43876563J",5));
        cola.push(new Users("Lucia","43276579L",6));
        cola.push(new Users("Marina","32543187H",7));
        cola.push(new Users("Laura","12345678P",8));
        cola.push(new Users("Toni","87654321D",9));


}

    @Test
    public void testColaUsers() throws Exception{
        Queue cola = new QueuesImpl<Users>(10);
        cola.push(new Users("Marc","43222633K",4));
        cola.push(new Users("Juan","43876563J",5));
        cola.push(new Users("Lucia","43276579L",6));
        cola.push(new Users("Marina","32543187H",7));
        cola.push(new Users("Laura","12345678P",8));
        cola.push(new Users("Toni","87654321D",9));

        Assert.assertEquals("Setup:",6, cola.size());
        Users u = (Users) cola.pull(); //Marc
        Assert.assertEquals("Pull","Marc",u.getName());
        u = new Users("Jorge","76543231N",8);
        cola.push(u);
        u = (Users) cola.pull(); //Juan
        u = (Users) cola.pull(); //Lucia
        u = (Users) cola.pull(); //Marina
        u = (Users) cola.pull(); //Laura
        u = (Users) cola.pull(); //Toni
        u = (Users) cola.pull(); //Jorge
        Assert.assertEquals("Push", "76543231N",u.getDNI());
        Assert.assertEquals("Size after pulling all:",0,cola.size());
    }

    @Test(expected = QueueFullException.class)
    public void testColaIntegersFullException() throws Exception {

        Queue<Integer> qInt = new QueuesImpl<Integer>(3);
        qInt.push(5);
        qInt.push(5);
        qInt.push(5);
        qInt.push(5);
    }

    @Test (expected = QueueFullException.class)
    public void testColaStringFull() throws Exception{
       Queue<String> qs = new QueuesImpl<String>(3);
       qs.push("Hola");
       qs.push("que");
       qs.push("tal");
       qs.push("?");
    }


    @Test(expected = QueueEmptyException.class)
    public void testColaIntegersEmptyException() throws Exception {

        Queue<Integer> qInt = new QueuesImpl<Integer>(3);
        int i = qInt.pull();
    }

    @Test(expected = QueueEmptyException.class)
    public void testColaStringEmptyException() throws Exception {

        Queue<String> qs = new QueuesImpl<String>(3);
        String i = qs.pull();
    }

    @Test
    public void testStringsPushPull() throws Exception {
        Queue<String> qs = new QueuesImpl<String>(7);
        qs.push("Hola");
        qs.push("que");
        qs.push("tal");
        qs.push("?");

        Assert.assertEquals("Hola", qs.pull());
        qs.push("ModoDiable");
        qs.pull();
        qs.pull();
        qs.pull();
        String n = qs.pull();
        Assert.assertEquals("ModoDiable",n);


    }

}
