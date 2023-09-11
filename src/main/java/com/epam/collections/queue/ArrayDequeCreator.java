package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
    	
    	ArrayDeque<Integer> que = new ArrayDeque<Integer>();
    	que.add(firstQueue.poll());
    	que.add(firstQueue.poll());
    	que.add(secondQueue.poll());
    	que.add(secondQueue.poll());
    	while (firstQueue.peek()!=null&&secondQueue.peek()!=null) {
	    	firstQueue.add(que.pollLast());
	    	que.add(firstQueue.poll());
	    	que.add(firstQueue.poll());
	    	secondQueue.add(que.pollLast());
	    	que.add(secondQueue.poll());
	    	que.add(secondQueue.poll());

    	}
		return que;
    	
    }
}
