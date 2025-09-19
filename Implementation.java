public class Implementation {
    public static void main(String[] args) {
        /*
        Stack Implementation
         */
        System.out.println("--------------------------->>>>>>>>>> \uD83D\uDC47\uD83D\uDC47\uD83D\uDC47\uD83D\uDC47\uD83D\uDC47\uD83D\uDC47<<<<<<<<<<---------------------------");
        System.out.println("Stack Implementation");
        /*
            --------------------------->>>>>>>>>> 👇👇👇👇👇👇<<<<<<<<<<---------------------------
         */

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

        System.out.println("--------------------------->>>>>>>>>>\uD83D\uDC46\uD83D\uDC46\uD83D\uDC46\uD83D\uDC46\uD83D\uDC46\uD83D\uDC46<<<<<<<<<<---------------------------");
        /*
            --------------------------->>>>>>>>>>👆👆👆👆👆👆<<<<<<<<<<---------------------------
         */


        /*
        *****************************🛩️🛩️🛩️✈️✈️✈️🚢🚢🚢🏍️🏍️🏍️🚲🚲🚲*****************************
         */
        System.out.println();


        System.out.println();
        System.out.println("--------------------------->>>>>>>>>> \uD83D\uDC47\uD83D\uDC47\uD83D\uDC47\uD83D\uDC47\uD83D\uDC47\uD83D\uDC47<<<<<<<<<<---------------------------");
        System.out.println("ArrayList Implementation");
        /*
        ArrayList Implementation
         */

        /*
            --------------------------->>>>>>>>>> 👇👇👇👇👇👇<<<<<<<<<<---------------------------
         */


        MyArrayList<Integer> arraylist = new MyArrayList<>();
        /*
        Inserting values into the ArrayList with the help of .insert(value);
         */
        arraylist.insert(10);
        arraylist.insert(20);
        arraylist.insert(30);
        arraylist.insert(50);
        arraylist.insert(60);
        arraylist.insert(70);
        arraylist.insert(80);
        arraylist.insert(90);
        arraylist.insert(100);

        System.out.println("Printing all ArrayList values with help of .asString()");
        System.out.println(arraylist.asString());

        System.out.println();
        System.out.println("Remove First Element with help of .killAtFirst()");
        arraylist.killAtFirst(); // Remove Element at First
        System.out.println(arraylist.asString());

        System.out.println();
        System.out.println("Remove Last Element with help of .killAtLast()");
        arraylist.killAtLast(); // Remove Element at Last
        System.out.println(arraylist.asString());

        System.out.println();
        System.out.println("Remove Element with index value with help of .kill(index)");
        arraylist.kill(2); // Remove Element with index value
        System.out.println(arraylist.asString());

        System.out.println();
        System.out.println("Getting the size of the ArrayList with the method .length()");
        System.out.println("Length: "+(arraylist.length()));

        System.out.println();
        System.out.println("Fetching Element with the Index value as .fetch(index) ");
        System.out.println(arraylist.fetch(2));


        System.out.println();
        System.out.println("Set the values with the index and value help of .assign(index, value)");
        arraylist.assign(2,1000);
        System.out.println(arraylist.asString());

        System.out.println();
        System.out.println("Check the ArrayList was Empty or Not with help of .isBlank()");
        System.out.println(arraylist.isBlank());


        /*
            --------------------------->>>>>>>>>>👆👆👆👆👆👆<<<<<<<<<<---------------------------
         */
        System.out.println("--------------------------->>>>>>>>>>\uD83D\uDC46\uD83D\uDC46\uD83D\uDC46\uD83D\uDC46\uD83D\uDC46\uD83D\uDC46<<<<<<<<<<---------------------------");
        System.out.println();


        System.out.println();

        System.out.println("*****************************❤\uFE0F❤\uFE0F❤\uFE0F❤\uFE0F\u200D\uD83E\uDE79❤\uFE0F\u200D\uD83E\uDE79❤\uFE0F\u200D\uD83E\uDE79\uD83D\uDC98\uD83D\uDC98\uD83D\uDC98\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D♾\uFE0F♾\uFE0F♾\uFE0F♾\uFE0F*****************************");
        /*
         *****************************❤️❤️❤️❤️‍🩹❤️‍🩹❤️‍🩹💘💘💘💝💝💝♾️♾️♾️♾️*****************************
         */

    }
}
