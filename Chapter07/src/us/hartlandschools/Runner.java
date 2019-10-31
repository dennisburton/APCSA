package us.hartlandschools;

class Runner {

    void printArray( int[] numbers ){
        if( numbers == null ) return;
        System.out.print("[");
        for( int currentNumber : numbers ){
            System.out.print( "" + currentNumber + " ");
        }
        System.out.println("]");
    }

    void ChangeElement(int[] numbers,  int index, int newValue ){
        numbers[index] = newValue;
    }

}
