public class ArraysRunner {

    public static void main(String[] args){

        System.out.println("Arrays runner started with "+args.length+" total args");

        String[] testersList = {"tester1", "tester2", "tester3"}; // 0 to 2
        System.out.println("\n\nTesters list has "+testersList.length+" total testers \n");


        System.out.println("\tTester 1 is:  "+testersList[0]); //first
        System.out.println("\tTester 2 is:  "+testersList[1]); //second
        System.out.println("\tTester 3 is:  "+testersList[testersList.length - 1]); //third
        // System.out.println("\tTester 3 is:  "+testersList[3]); //fourth
        //single line comment
        /*
            multiline comment
            is like this
        */

        Integer[] numbers = new Integer[10];
        numbers[0] = 1;
        numbers[3] = 3;
        numbers[9] = 10;
        // numbers[10] = 11;
        System.out.println("\n\t Number 1 is:  "+numbers[0]); //first
        System.out.println("\t Number 4 is:  "+numbers[3]); //second
        System.out.println("\t Number 10 is:  "+numbers[numbers.length - 1]); //second




    }

}