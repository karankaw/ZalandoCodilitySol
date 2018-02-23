// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
	public int solution(int[] A) {
		int num;
		for (num = 1; num <= A.length; num++) {
			boolean numExists = false;
			for (int i = 0; i < A.length; i++) {
				if (num == A[i]) {
					numExists = true;
					break;
				}
			}
			if (!numExists) {
				break;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(new int[] { -1, 2, 3 }));
	}
}



// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

//SqDistance = (x1-x2)^2 + (y1-y2)^2
//I need to test 3 Pairs only
// sq(A-B) + sq(C-D) =   sq(A-B) + sq(D-C) = sq(B-A) + sq(D-C) = sq(B-A) + sq(C-D)
// A-B C-D , A-C B-D, A-D C-B 3 Unique Combos for (X1-x2)^2 
//3 Unique Sum
//Find MAX

class Solution {
    public int solution(int A, int B, int C, int D) {
        double sum1 = Math.pow(A-B,2) + Math.pow(C-D,2);
        double sum2 = Math.pow(A-C,2) + Math.pow(B-D,2);
        double sum3 = Math.pow(A-D,2) + Math.pow(B-C,2);
        
        double maxInter = Math.max(sum1,sum2);
        int result  =  new Double(Math.max(maxInter, sum3)).intValue();
        return result;
        
    }
}



// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

//S 
//Do a for loop 
//at each iteration count LHS ( and RHS )


class Solution {
    public int solution(String S) {
    	//Assuming No Match - Problem says it should return Length, But Test say otherwise
        int result = S.length();
		for (int i = 1; i < S.length(); i++) {
			String sub = S.substring(0, i);
			String remainder = S.substring(i);
			System.out.println(sub);
			System.out.println(remainder);

			int lhsCount = countChars(sub, '(');
			int rhsCount = countChars(remainder, ')');

			if (lhsCount == rhsCount) {
				result = i;
				break;
			}
		}
		System.out.println("Result : "+result);
		return result;
    }

	public int countChars(String s, char ch) {
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch) {
				counter++;
			}
		}
		return counter;
	}
    
}