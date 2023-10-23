
/**
 Author: D1teri or Dima K.
 Version: 1.0.0
 **/
public class FizzBuzz
{
    public void run(){
        int n = 0;
        while(n<100){
            n++;
            int chf = n / 5;
            int restf = n - 5*chf;
            int cht = n / 3;
            int restt = n - 3*cht;
            
            if(restf == 0 && restt == 0){
                System.out.println("FizzBuzz");
            }
            else if(restf == 0){
                System.out.println("Buzz");
            }
            else if(restt == 0){
                System.out.println("Fizz");
            }
            else{
                System.out.println(n);
            }
            
        }
    }
    public static void main(String[] args){
        FizzBuzz hw = new FizzBuzz();
        hw.run();
    }
}
