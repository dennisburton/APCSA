package us.hartlandschools;

public class Main {

    public static void main(String[] args) {
        Runner runner = new Runner();

        int[] numbers = new int[10];

        runner.printArray( numbers );

        for( int currentNumber: numbers ){
            currentNumber = 1;
        }

        runner.printArray( numbers );

        for( int i=0; i<numbers.length; i++ ){
            numbers[i] = 1;
        }

        runner.printArray( numbers );
    }
}

