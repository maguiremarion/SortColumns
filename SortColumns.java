import java.util.ArrayList;
import java.util.List;

public class SortColumns {

	private static List<Integer> minDeletionSize(String[] A){
		
		List<Integer> errorList = new ArrayList<Integer>();
		errorList.add(-1);
		for(int r = 0; r < A.length; r++) {
			if (A[0].length() != A[r].length())
				return(errorList);
		}
		
		List<Integer> myList = new ArrayList<Integer>();
		
        for (int i = 0; i < A[0].length(); ++i)
            for (int j = 0; j < A.length - 1; ++j)
                if (A[j].charAt(i) > A[j+1].charAt(i)) {
                    myList.add(i);
                    break;
                }
        return myList;
	}
	
	private static void printArrayList(List<Integer> result) {
		for (int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i) + " ");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Testing for example [\"cba\",\"daf\",\"ghi\"]...");
		String[] A = {"cba","daf","ghi"};
		List<Integer> result = minDeletionSize(A);
		printArrayList(result);	
		System.out.println();
		
		System.out.println("Testing for example [\"zyx\",\"wvu\",\"tsr\"]...");
		String[] A2 = {"a","b"};
		List<Integer> result2 = minDeletionSize(A2);
		printArrayList(result2);	
		System.out.println();
		
		System.out.println("Testing for example [\"zyx\",\"wvu\",\"tsr\"]...");
		String[] A3 = {"zyx","wvu","tsr"};
		List<Integer> result3 = minDeletionSize(A3);
		printArrayList(result3);	
		System.out.println();
		
		System.out.println("Testing for example [\"Captain\",\"Marvel\",\"saved\", \"the\", \"Avengers\"]...");
		String[] A4 = {"Captain","Marvel","saved", "the", "Avengers"};
		List<Integer> result4 = minDeletionSize(A4);
		printArrayList(result4);	
		System.out.println();
	}
}