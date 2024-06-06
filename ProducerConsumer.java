// import java.util.LinkedList;
// import java.util.Queue;

// class Buffer{
//     private Queue<Integer> items = new LinkedList<Integer>();
//     private int capacity;
//     public Buffer(int capacity){
//         this.capacity = capacity;
//     }
//     public synchronized void produce(int item){
//         while(items.size() == capacity){
//             try{
//                 System.out.println("buffer full, producer waiting");
//                 wait();
//             }
//             catch(InterruptedException e){
//                 e.printStackTrace();
//             }
//         }
//         items.add(item);
//         System.out.println("item added: "+item);
//         notify();
//     }
//     public synchronized int consume(){
//         while(items.size() == 0){
//             try{
//                 System.out.println("buffer empty");
//                 wait();
//             }
//             catch (InterruptedException e){
//                 e.printStackTrace();
//             }
//         }
//         int item = items.remove();
//         System.out.println("item removed: "+item);
//         notify();
//         return item;
//     }
// }
// class Producer extends Thread{
//     private Buffer buffer;
//     Producer(Buffer buffer){
//         this.buffer = buffer;
//     }
//     public void run(){
//         for(int i = 0; i < 10; i++){
//             buffer.produce(i);
//             try{
//                 Thread.sleep((long)(Math.random()*1000));
//             }
//             catch(InterruptedException e){
//                 e.printStackTrace();
//             }
//         }
//     }
// }
// class Consumer extends Thread{
//     private Buffer buffer;
//     Consumer(Buffer buffer){
//         this.buffer = buffer;
//     }
//     public void run(){
//         for(int i = 0; i < 10; i++){
//             buffer.consume();
//             try{
//                 Thread.sleep((long)(Math.random()*1000));
//             }
//             catch(InterruptedException e){
//                 e.printStackTrace();
//             }
//         }
//     }
// }
// public class ProducerConsumer {
//     public static void main(String[] args){
//         Buffer buffer = new Buffer(3);
//         Producer producer = new Producer(buffer);
//         Consumer consumer = new Consumer(buffer);
//         producer.start();
//         consumer.start();
//     }
// }



import java.util.Queue;
import java.util.LinkedList;
class Buffer{
    private Queue<Integer> items = new LinkedList<Integer>();
    private int capacity;
    
}