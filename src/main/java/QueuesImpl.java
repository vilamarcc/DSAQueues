
public class QueuesImpl<E> implements Queue <E> {

    E[] data;
    int p = 0;

    public QueuesImpl(int len) {
        this.data = (E[])new Object[len];
    }

    public void push(E e) throws QueueFullException {
      //log.info("entrada: "+e);
      if (this.isFull()) {
        throw new QueueFullException();
      }
      else {
          data[p] = e; //primer s'afegeix a p i despres es fa p++
          this.p = this.p + 1;
      }

        //log.info("p: "+p);
    }

    private boolean isFull() {
        return (this.data.length<=p);
    }

    public E pull() throws QueueEmptyException{
        if (this.isEmpty() == true) { throw new QueueEmptyException(); }
        E res =  this.data[0];
        lshift(data);
        this.p = this.p - 1;
//        log.info("sortida: "+res);
        return res;
    }

    private void lshift(E[] data) {
        for (int i=1; i<data.length;i++){
            data[i-1]=data[i];
        }
    }

    private boolean isEmpty() {
        if (this.p == 0){
            return true;
        }
        else{
            return false;
        }

    }

    public int size() {
        int units=0;
        for(int i = 0; this.data.length> i; i++){
            if(this.data[i] != null){
                units++;
            }
        }
        return units;
    }
}




