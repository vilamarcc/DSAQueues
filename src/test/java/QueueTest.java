import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

public abstract class QueueTest implements  Queue{
    Users[] array = null;

    @Before
    public void setUp() {
        this.array = new Users[6];
        array[0] = new Users("Marc","43222633K",4);
        array[1] = new Users("Juan","43876563J",5);
        array[2] = new Users("Lucia","43276579L",6);
        array[3] = new Users("Marina","32543187H",7);
        array[4] = new Users("Laura","12345678P",8);
        array[5] = new Users("Toni","87654321D",9);
        Queue cola = new QueuesImpl<Users>(7);

        for (int i = 0; i < 5;i++) {

            try {
                cola.push(array[i]);
            } catch (QueueFullException e) {
                e.printStackTrace();
            }
        }

}

    @Test
    public void testCola() {
        String nombre = Cola.pop().getName();
        Assert.assertEquals("Pop","Toni",nombre);
        int s = Cola.size();
        Assert.assertEquals("Size", 6, s, 0.5);
        Users prueba = new Users("Jorge","76543231N",8);
        Cola.push(prueba);
        String dni = Cola.pop().getDNI();
        Assert.assertEquals("Push", "76543231N",dni);
    }

    @Test(expected = QueueFullException.class)
    public void testColaIntegersFullException() throws Exception {

        Queue<Integer> qInt = new QueuesImpl<Integer>(3);
        qInt.push(5);
        qInt.push(5);
        qInt.push(5);
        qInt.push(5);
    }

    @Test
    public void testColaString() {
        String nombre = Cola.pop().getName();
        Assert.assertEquals("Pop","Toni",nombre);
        int s = Cola.size();
        Assert.assertEquals("Size", 6, s, 0.5);
        Users prueba = new Users("Jorge","76543231N",8);
        Cola.push(prueba);
        String dni = Cola.pop().getDNI();
        Assert.assertEquals("Push", "76543231N",dni);
    }


    @Test
    public void testException() {

    }
}
