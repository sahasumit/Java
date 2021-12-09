import java.io.*;
class ThreadJoining extends Thread{

  int t;
  ThreadJoining(int t){
    this.t = t;
  }
  @Override
  public void run() {
    for (int i = 0; i < 5; i++)
        {
          try{
            Thread.sleep(t);
              System.out.println("Current Thread: "
                      + Thread.currentThread().getName());
            }
            catch(Exception e){

            }
        }
   }
}

class ThreadJoin {
  public static void main(String [] args){
    ThreadJoining t1 = new ThreadJoining(500);
    ThreadJoining t2 = new ThreadJoining(300);
    ThreadJoining t3 = new ThreadJoining(100);
    t1.start();
    t2.start();
  //  t3.start();
    try{
        t2.join();
      }
      catch(Exception e){

      }
    System.out.println("Current Thread: " + Thread.currentThread().getName());
  //  t1.start();
  }
}
