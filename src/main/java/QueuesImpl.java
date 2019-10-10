
public class QueuesImpl<E> implements Queue <E> {

    E[] data;
    int p;

    public QueuesImpl(int len) {
        this.data = (E[])new Object[len];
    }

    public void push(E e) throws QueueFullException {
      //log.info("entrada: "+e);
      if (this.isFull()) {
        throw new QueueFullException();
      }
      else data[p++] = e; //primer s'afegeix a p i despres es fa p++
  //    log.info("p: "+p);
    }

    private boolean isFull() {
        return (this.data.length>=p);
    }

    public E pull() {
        if (this.isEmpty()) throw new QueueEmptyException()
        E res =  this.data[0];
        lshift(data);
//        log.info("sortida: "+res);
        return res;
    }

    private void lshift(E[] data) {
        for (int i=0; i<data.length;i++){
            data[i]=data[i+1];
        }
    }

    private boolean isEmpty() {
        return (this.p == 0);
    }

    public int size() {
        int fi=0;
        for(int i = 0; this.data.length> i; i++){
            if(this.data[i] == null){
                fi = i;
            }
        }
        return fi;
    }
}




