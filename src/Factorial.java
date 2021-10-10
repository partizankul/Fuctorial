public class Factorial {
    public static void main(String[] args) {
        System.out.println(fucRecursia(5));
        System.out.println(fucCikl(7));
        Fibonachi fibonachi = new Fibonachi();
        fibonachi.fib();


        ReversArray reversArray = new ReversArray();
        reversArray.createArr();



    }

    public static int fucRecursia(int nR){
        if(nR<=1){
            return 1;
        }
        return nR*fucRecursia(nR-1);
    }
    public static int fucCikl(int nC){
int temp=1;
        if (nC<=1){
            return 1;
        }
        for (int i=1; i<=nC; i++){
          temp = temp*i;
        }

        return temp;
    }
}
