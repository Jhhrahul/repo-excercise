class PrintThread extends Thread{

    private final int threadNumber;
    public PrintThread(int threadNumber){
        this.threadNumber = threadNumber;
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.printf(Thread.currentThread().getName()+" Hello from Thread %d\n"
                    , threadNumber);
        }
    }
    public static void main(String... args){
        PrintThread t1 = new PrintThread(1);
        PrintThread t2 = new PrintThread(2);

        t1.start();
        t2.start();

    }
}
