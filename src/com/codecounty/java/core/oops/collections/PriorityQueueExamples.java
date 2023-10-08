package com.codecounty.java.core.oops.collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExamples {

	public static void main(String[] args) {

//		PriorityQueue<Integer> pq = new PriorityQueue<>();
		//By Default it will use MinHeap
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());//MaxHeap

		//it will always store teh smalles element in the begining
		pq.add(3);
		pq.add(13);
		pq.add(35);
		pq.add(23);
		pq.add(12);
		pq.add(323);
		pq.add(323);
		
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println(pq.peek());
		System.out.println(pq);



	}

}
