import java.util.HashMap;

public class QueuesImpl<E> implements Queue <E> {

    E[] data;
    int p;

    public QueuesImpl(int len) {
        this.data = (E[])new Object[len];
    }

    public void push(E e) throws QueueFullException {
    //  log.info("entrada: "+e);

      if (this.isFull()) {
        throw new QueueFullException();
      }
      else data[p++] = e;

  //    log.info("p: "+p);
    }

    private boolean isFull() {
        //this.data.length
        return false;
    }

    public E pull() {
        if (this.isEmpty()) throw new QueueEmptyException()
        E res =  this.data[0];

        lshift(data);


//        log.info("sortida: "+res);

        return res;
    }

    private boolean isEmpty() {
        return (this.p == 0);
    }

    public int size() {
        return 0;
    }



}




