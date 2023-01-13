


public class Multithread extends Thread{

    private int num;
    public Multithread(int threadNum){
        this.num = threadNum;
    }

    @Override
    public void run() {

        for(int i = 0; i < 5; ++i) {
            System.out.println(i + " From thread " + num);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
