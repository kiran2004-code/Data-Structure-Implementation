import Exception.*;
public class MyArrayList<E> {
    private Object[] arr;
    private int count=0;

    public MyArrayList() {
        arr=new Object[10];
    }

    public boolean insert(E value){
        if(count==arr.length){
            sizeIncrease();
        }
        arr[count++]=value;
        return true;
    }

    private void sizeIncrease() {
        Object[] array = new Object[arr.length+5];
        for(int i=0;i< arr.length;i++){
            array[i]=arr[i];
        }
        arr=array;
    }

    E fetch(int index){
        if(index<0 || index>count || count == 0) {
            throw new IndexOutOfRange("Index Value Out Of Range!! ❌❌");
        }
        return (E) arr[index];
    }

    public StringBuilder asString(){
        if(count==0)
            throw new IndexOutOfRange("My Array List Was Empty ❌❌");

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0;i<count;i++){
            sb.append(arr[i]);
            if(i<count-1)
                sb.append(", ");
        }
        sb.append("]");
        return sb;
    }

    public boolean assign(int index, E value){
        if(index>0 && index<=count) {
            arr[index] = value;
            return true;
        }
        return false;
    }

    public int length() {
        return count;
    }

    public E kill(int index){
        if( count == 0)
            throw new MyArrayListWasEmpty("My Array List Was Empty ❌❌");
        else if(index>count || index<0)
            throw new IndexOutOfRange("Index Value Out Of Range!! ❌❌");
        E value = (E) arr[index];
        for (int i = index; i < count-1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[count - 1] = 0;
        count--;
        return value;
    }

    public E killAtLast(){
        if(count==0){
            throw new MyArrayListWasEmpty("My Array List Was Empty ❌❌");
        }
        else if(count<2)
            throw new InsufficientValues("Requires one more value!! ❌❌");

        E value = (E) arr[count];
        arr[count]=arr[count-1];
        arr[count]=0;
        count-=1;
        return value;
    }

    public E killAtFirst(){
        if(count==0)
            throw new MyArrayListWasEmpty("My Array List Was Empty ❌❌");
        E value = (E) arr[0];
        for(int i=0;i<count-1;i++){
            arr[i]=arr[i+1];
        }
        arr[count-1]=0;
        count-=1;
        return value;
    }

    public boolean isBlank(){
        return count == 0;
    }
}
