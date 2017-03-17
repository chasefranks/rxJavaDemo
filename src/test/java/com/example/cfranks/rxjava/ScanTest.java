package com.example.cfranks.rxjava;

import static org.junit.Assert.*;

import org.junit.Test;

import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func2;

public class ScanTest {

	@Test
	public void test() {
		
		Observable<Integer> source = Observable.range(1, 20);
		
		Observable<Integer> scanned = source.scan(new Func2<Integer, Integer, Integer>() {

			@Override
			public Integer call(Integer a, Integer b) {
				return a+b;
			}
			
		});
		
		// here we're using the .subscribe(Action1<? super Integer> signature
		scanned.subscribe(n -> {
			System.out.println("next item is:" + n);
		});
		
	}

}
