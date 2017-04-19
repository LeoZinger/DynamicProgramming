/**
 * Created by leo.zinger on 4/19/17.
 */
public class StepsInStairs {

        //climbing stairs, 1,2,3 steps at a time at N steps, how many different ways to top?

        int fibonacciSteps(int n){
            int t=0;
            for (int i = 0; i<n; i++){
                if (n==0){
                    return 0;
                }
                else if (n==1){
                    return 1;
                }
                else {
                    t = fibonacciSteps(n-1) + fibonacciSteps(n-2) + fibonacciSteps(n-3) + 7;
                }
            }
            return t;
        }

    public static void main(String[] s){
            int n = 50;

            StepsInStairs stepsInStairs = new StepsInStairs();
            System.out.println("N="+ n + " Total result: " + stepsInStairs.fibonacciSteps(n));
    }
}
