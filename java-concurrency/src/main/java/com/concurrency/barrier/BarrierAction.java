package com.concurrency.barrier;

public class BarrierAction implements Runnable {

	@Override
	public void run() {
		System.out.println("Barrier Action Executes !!!");
	}

}
