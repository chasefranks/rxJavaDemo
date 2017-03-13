package com.example.cfranks.rxjava;

import rx.Observable;

public class DemoApp {
	
	public static void main(String[] args) {
		Observable<String> observable = Observable.just("h", "e", "l", "l", "o", "w", "o", "r", "l", "d");
		
		observable.subscribe(s -> {
			System.out.println("observed: " + s);
		});
	}

}
