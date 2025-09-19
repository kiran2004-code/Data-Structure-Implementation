public class MyStack<E> {
    private Object[] arr;
    private int count=0;

    public MyStack(){

        arr = new Object[10];
    }

    public void load(Object element){
        if(count==arr.length){
            SizeIncrease();
        }
        arr[count++]=element;
    }

    private void SizeIncrease() {
        Object[] array = new Object[arr.length+5];
        for(int i=0;i<arr.length;i++){
            array[i]=arr[i];
        }
        arr=array;
    }


    public E delete() {
        if (count == 0) {
            throw new StackWasEmpty("Stack Was Empty!! ❌❌");
        }
        arr[count]=arr[count-1];
        E value = (E) arr[count];
        count-=1;
        return value;
    }


    public E top() {
        if (count == 0) {
            throw new StackWasEmpty("Stack Was Empty!! ❌❌");
        }
        return (E) arr[count - 1];
    }

    public int length(){

        return count;
    }

    public boolean isUnload(){

        return count == 0;
    }
}
