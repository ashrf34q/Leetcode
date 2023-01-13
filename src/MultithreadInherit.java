public class MultithreadInherit {

    public static void main(String[] args){

        for(int i = 0; i < 4; i++){
            Multithread multiThread = new Multithread(i);

            multiThread.start();
            break;
        }
    }
}
