
public class StackImplementations {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        /*
        Loading value into the Stack with the help of .load();
         */
        stack.load(10);
        stack.load(20);
        stack.load(30);
        stack.load(40);
        stack.load(50);

        System.out.println("Delete value with the help of .delete()");
        System.out.println(stack.delete());

        System.out.println();
        System.out.println("Getting the Top value with the help of top()");
        System.out.println(stack.top());

        System.out.println();
        System.out.println("To Get the length of stack it has .length()");
        System.out.println(stack.length());

        System.out.println();
        System.out.println("To get the stack was loaded or not it has .isUnLoad()");
        System.out.println(stack.isUnload());

    }
}
