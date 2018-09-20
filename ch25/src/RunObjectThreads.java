public class RunObjectThreads {
    public static void main(String[] args) {
        RunObjectThreads sample = new RunObjectThreads();
        sample.checkThreadState2();
    }

    public void checkThreadState2() {
        Object monitor = new Object();
        StateThread thread = new StateThread(monitor);
        StateThread thread2 = new StateThread(monitor);
        try{
            System.out.println("thread state="+thread.getState());
            thread.start();
            thread2.start();
            System.out.println("thread state(atger start)="+thread.getState());

            Thread.sleep(100);
            System.out.println("thread state(after 0.1sec)="+thread.getState());

            synchronized (monitor) {
                monitor.notifyAll();
            }

            Thread.sleep(100);
            System.out.println("after ntify="+thread.getState());

            thread.join();
            System.out.println("thread state(after join)="+thread.getState());
            thread2.join();
            System.out.println("thread2 state(after join)="+thread2.getState());
        }catch(InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
