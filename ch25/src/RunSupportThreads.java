public class RunSupportThreads {
    public static void main(String[] args) {
        RunSupportThreads sample = new RunSupportThreads();
        sample.checkThradState1();
    }

    public void checkThradState1() {
        SleepThread thread = new SleepThread(2000);
        try {
            System.out.println("thread state="+thread.getState());
            thread.start();
            System.out.println("thread state(after start)="+thread.getState());

            Thread.sleep(1000);

            thread.join();
            thread.interrupt();;
        } catch(InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
