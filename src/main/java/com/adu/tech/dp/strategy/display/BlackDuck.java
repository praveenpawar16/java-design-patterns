package com.adu.tech.dp.strategy.display;

import com.adu.tech.dp.strategy.behaviour.IDisplayBehaviour;

public class BlackDuck implements IDisplayBehaviour {

	@Override
	public void display() {
		System.out.println("It`s a black duck.");
	}

}
