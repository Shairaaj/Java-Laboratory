import java.math.BigInteger;

class Main{
    public static void main(String[] args) {
        int n = 30;
        FactorialFinder fa = new FactorialFinder(n);
        FibonacciFinder fb = new FibonacciFinder(n);
        fa.start();
        fb.start();
    }
}

class FactorialFinder extends Thread{
    int n;
    FactorialFinder(int n){
        this.n = n;
    }
    public void run(){
        BigInteger big = new BigInteger("1");
        for(int i=1; i<=n; i++){
            big = big.multiply(BigInteger.valueOf(i));
        }
        System.out.println(big);
    }
}

class FibonacciFinder extends Thread{
    int n;
    FibonacciFinder(int n){
        this.n = n;
    }
    public void run(){
        int i = 0, a = 0, b = 1, next = 0;
        System.out.print(a+" ");
        while(i < n){
            i++;
            next = a+b;
            System.out.print(next+" ");
            a = b;
            b = next;
        }
    }
}