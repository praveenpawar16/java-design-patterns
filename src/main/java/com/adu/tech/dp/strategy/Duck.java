package com.adu.tech.dp.strategy;

import com.adu.tech.dp.strategy.behaviour.IDisplayBehaviour;
import com.adu.tech.dp.strategy.behaviour.IFlyBehaviour;
import com.adu.tech.dp.strategy.behaviour.IQuackBehaviour;

public class Duck {
	
	private String duckType;
	private IFlyBehaviour fb;
	private IQuackBehaviour qb;
	private IDisplayBehaviour db;

	public Duck(String duckType, IFlyBehaviour fb, IQuackBehaviour qb, IDisplayBehaviour db) {
		super();
		this.duckType = duckType;
		this.fb = fb;
		this.qb = qb;
		this.db = db;
	}

	public void fly() {
		this.fb.fly();
	}

	public void quack() {
		this.qb.quack();
	}
	
	public void display() {
		this.db.display();
	}

	public String getDuckType() {
		return duckType;
	}

	public void setDuckType(String duckType) {
		this.duckType = duckType;
	}

}
