public class Main {
    public static void main(String[] args) {

        //Thread 1
        for (int i = 0; i < 10 ; i++) {
            System.out.println("a");
        }
        
        //Thread 2
        for (int i = 0; i < 10 ; i++) {
            System.out.println("a");
        }


        System.out.println("main end!");

    }
}
