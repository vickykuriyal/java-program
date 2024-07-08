public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int n = A.size();
        Collections.sort(A, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                int fA = CountFactors(a);
                int fB = CountFactors(b);
                if(fA == fB) return a - b;
                else  return fA - fB;
            }
        });
        return A;
    }

    public int CountFactors(int A){
        int count = 0;
        for(int i = 1; i * i <= A; i++){
            if(A % i == 0){
                if(i * i == A){
                    count++;
                }else{
                    count += 2;
                }
            }
        }
        return count;
    }

}