package queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: starfish
 * @data: 2020-04-04 11:22
 **/
public class BlockingQueueDemo {


    public static void main(String[] args) {

        /**
         * 异常组
         */

        BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);

        System.out.println(queue.add("a"));
        System.out.println(queue.add("b"));


        //System.out.println(queue.add("c"));   //java.lang.IllegalStateException: Queue full

        System.out.println(queue.element());
        System.out.println(queue.element());


        System.out.println(queue.remove());
        System.out.println(queue.remove());

        //System.out.println(queue.remove());  // java.util.NoSuchElementException

        System.out.println("------------");
        /**
         * 布尔值组
         */
        BlockingQueue<String> queue1 = new ArrayBlockingQueue<>(2);
        System.out.println(queue1.offer("a"));
        System.out.println(queue1.offer("b"));
        System.out.println(queue1.offer("c"));

        System.out.println(queue1.peek());

        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());

        System.out.println("------------");

        /**
         * 阻塞
         */
        BlockingQueue<String> queue2 = new ArrayBlockingQueue<>(2);
        try {
            queue2.put("a");
            queue2.put("b");
            System.out.println("=======");
            //queue2.put("c");


            System.out.println(queue2.take());
            System.out.println(queue2.take());
            //System.out.println(queue2.take());  //阻塞一直等待

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /**
         * 超时控制,等一会插不进去或取不出来就撤了
         */
        BlockingQueue<String> queue3 = new ArrayBlockingQueue<>(2);
        try {
            System.out.println(queue3.offer("a",2,TimeUnit.SECONDS));
            System.out.println(queue3.offer("b", 2, TimeUnit.SECONDS));
            System.out.println(queue3.offer("c", 2, TimeUnit.SECONDS));


            System.out.println(queue3.poll(2,TimeUnit.SECONDS));
            System.out.println(queue3.poll(2,TimeUnit.SECONDS));
            System.out.println(queue3.poll(2,TimeUnit.SECONDS));  //阻塞2秒后退出

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
