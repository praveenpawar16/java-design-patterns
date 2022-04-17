package com.adu.tech.dp.strategy.fly;

import com.adu.tech.dp.strategy.behaviour.IFlyBehaviour;

public class FlyNever implements IFlyBehaviour {

	@Override
	public void fly() {
		System.out.println("Can`t fly");

	}

}
