
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
            if(n%3 == 0 && n%5==0){
                System.out.println("FizzBuzz");
            }
            else if(n%3 == 0){
                System.out.println("Fizz");
            }
            else if(n%5 == 0){
                System.out.println("Buzz");
            }
            else System.out.println(n);
        }
    }
    public static void main(String[] args){
        FizzBuzz hw = new FizzBuzz();
        hw.run();
    }
}
