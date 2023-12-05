package algorithmBased;

//class will have the formula for finding the permutation and combination 
//of ncr or 
/*
Example 1: Find the number of ways to select 3 books from 5 different books on the shelf.

Solution:

The total number of books, n = 5.

The number of books to be selected, r = 3.
 */
public class PermutationAndComb {

    public static int factorialOfNum(int n) {
        if (n == 0)
            return 1;
        return n * factorialOfNum(n - 1);

    }

    public static int nPr(int totalNobject, int objectsToSel) {

        // nPr , n = totalNobject , r = objectsToSel , formula :- nPr = n! / (n-r) ! .

        return factorialOfNum(totalNobject) / factorialOfNum(totalNobject - objectsToSel);

    }

    public static int nCr(int totalNOfCom, int fromTotal) {

        // nCr , n = totalNOfCom , r = fromTotal , formula :- nCr = n! / r!(n-r)! .
        return factorialOfNum(totalNOfCom) / factorialOfNum(fromTotal) * factorialOfNum(totalNOfCom - fromTotal);

    }

    public static void main(String[] args) {

        int n = 10;
        int r = 2;
        System.out.println(nPr(n, r));
        System.out.println(nCr(n, r));

    }

}
