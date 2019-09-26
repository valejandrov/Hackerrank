/*
    Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:

1 2 3
4 5 6
9 8 9  
The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .

Function description
Complete the  function in the editor below. It must return an integer representing the absolute diagonal difference.

diagonalDifference takes the following parameter:

arr: an array of integers .

 */
package EasyChallenges;

import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
    @author Alejandro
 */
public class DiagonalDifference {
    
    private static final int TAMANO = 3;

    public static void main(String[] args) {

        List<Integer> fila = new ArrayList<>();
        List<List<Integer>> arr = new ArrayList<>();
        Random rnd = new Random();
        
        for(int i=0 ; i < TAMANO ; i++){
            for (int j = 0; j < TAMANO; j++) {
                fila.add(rnd.nextInt(100));
            }
            arr.add(new ArrayList<>(fila));
            fila.clear();
        }
        
        for (List<Integer> list : arr) {
            System.out.println(list);
        }
        
        int diagonalLeftToRight = 0;
        int diagonalRightToLeft = 0;
        int counter = 1;
        
        for (List<Integer> list : arr) {
            diagonalRightToLeft += list.get(TAMANO-counter);
            diagonalLeftToRight += list.get(counter-1);
            counter++;
        }        
        
        System.out.println(diagonalLeftToRight);
        System.out.println(diagonalRightToLeft);
        
        System.out.println("Diagonal difference: "+ abs(diagonalLeftToRight - diagonalRightToLeft));
        
        /*
        Iterator<List<Integer>> it = arr.iterator();
        while(it.hasNext()){
            List<Integer> lista = it.next();
            for(Integer r : lista){
                System.out.println(r.intValue());
            }
        }
        */
        
    }
    
    
}
