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
                fila.add(j);
            }
            arr.set(i, fila);
            fila.clear();
        }

    }
    
    
}
