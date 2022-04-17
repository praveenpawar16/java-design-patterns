package com.adu.tech.dp.strategy.quack;

import com.adu.tech.dp.strategy.behaviour.IQuackBehaviour;

public class SimpleQuack implements IQuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Simple Quack.");
	}

}
