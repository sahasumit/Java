
class Sender{
    public void send(String msg) {
      System.out.println("Sending\t" + msg);
      try{
        Thread.sleep(1000);
      }
      catch(Exception e) {
        System.out.println("Thread interrupted.");
      }
      System.out.println("\n" + msg + "Sent");
    }
}

class ThreadSend extends Thread{
  private String msg;
  Sender sender;
  ThreadSend(String m, Sender obj) {
    msg = m;
    sender = obj;
  }

  public void run(){
    synchronized(sender) {
      sender.send(msg);
    }
  }
}

class SyncDemo {
  public static void main(String args[]) {
    Sender send = new Sender();
    ThreadSend s1 = new ThreadSend(" HI ", send);
    ThreadSend s2 = new ThreadSend(" Bye ", send);
    s1.start();
    s2.start();
    try{
      s1.join();
      s2.join();
    }
    catch (Exception e) {
      System.out.println("interrupted");
    }
  }
}
