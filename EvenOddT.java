//Creating an Interface
// Coded by Muhammad shariq Shafiq

//Implementation of Interface 
class EvenOddT implements RunnableTask{
    final int value;
    String name;
    
    public EvenOddT(String name , int value ){
        this.name = name;
        this.value = value;
    }
    
    //@Override is used to indicate the functional overriding 
    @Override
    public void run(){
        String ThreadName = Thread.currentThread().getName();
        for (int i = 1; i <= value; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Thread Running : " + i);
            } else {
                System.out.println("Odd Thread Running : " + i);
            }
            System.out.println("Thread Switching Alert by : " + ThreadName);
        }
    }
    
    
    
    public static void main(String[] args) {
        int value = 10000;
        //Creating Objects and calling parameterized Constructor
        EvenOddT thread1 = new EvenOddT("Thread1", value);
        EvenOddT thread2 = new EvenOddT("Thread2", value);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        t1.start();
        t2.start();
    }
}
