package com.example.cfranks.rxjava;

import rx.Observable;

public class RandomNumberObservable extends Observable<Integer>{

	protected RandomNumberObservable(rx.Observable.OnSubscribe<Integer> f) {
		super(f);
		// TODO Auto-generated constructor stub
	}

}
