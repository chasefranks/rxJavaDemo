package com.example.cfranks.rxjava;

import rx.Observable;
import rx.functions.Func1;

public class FibonacciObservable {

	public static void main(String[] args) {	
		rxFibonacci(100);
	}
	
	public static void rxFibonacci(int n) {
		
		final int[] tmp = {1, 1};
		
		Observable.range(1, n)
			.map(new Func1<Integer, Integer>() {

				@Override
				public Integer call(Integer t) {
					
					if (t < 3) {
						return tmp[t - 1];
					}
					
					int sum = tmp[0] + tmp[1];
					
					tmp[0] = tmp[1];
					tmp[1] = sum;
					
					return sum;
				}
				
			}).subscribe(fN -> {
				System.out.println("next item: " + fN);
			});
		
	}

}
