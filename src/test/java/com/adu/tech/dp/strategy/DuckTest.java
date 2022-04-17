package com.adu.tech.dp.strategy;

import org.junit.jupiter.api.Test;

import com.adu.tech.dp.strategy.display.BlackDuck;
import com.adu.tech.dp.strategy.display.WhiteDuck;
import com.adu.tech.dp.strategy.display.YellowDuck;
import com.adu.tech.dp.strategy.fly.FlyHigh;
import com.adu.tech.dp.strategy.fly.FlyJet;
import com.adu.tech.dp.strategy.fly.FlyLow;
import com.adu.tech.dp.strategy.fly.FlyNever;
import com.adu.tech.dp.strategy.quack.NoQuack;
import com.adu.tech.dp.strategy.quack.SimpleQuack;

class DuckTest {

	@Test
	final void testRiverDuck() {
		Duck riverDuck = new Duck("River Duck",new FlyLow(), new SimpleQuack(), new WhiteDuck());
		System.out.println("DuckType : " + riverDuck.getDuckType());
		riverDuck.fly();
		riverDuck.display();
		riverDuck.quack();
		System.out.println();
	}

	@Test
	final void testToyDuck() {
		Duck toyDuck = new Duck("Toy Duck",new FlyNever(), new NoQuack(), new YellowDuck());
		System.out.println("DuckType : " + toyDuck.getDuckType());
		toyDuck.fly();
		toyDuck.display();
		toyDuck.quack();
		System.out.println();
	}
	
	@Test
	final void testSeaDuck() {
		Duck seaDuck = new Duck("Sea Duck",new FlyHigh(), new SimpleQuack(), new BlackDuck());
		System.out.println("DuckType : " + seaDuck.getDuckType());
		seaDuck.fly();
		seaDuck.display();
		seaDuck.quack();
		System.out.println();
	}
	
	@Test
	final void testGameDuck() {
		Duck gameDuck = new Duck("Game Duck",new FlyHigh(), new NoQuack(), new BlackDuck());
		System.out.println("DuckType : " + gameDuck.getDuckType());
		gameDuck.fly();
		gameDuck.display();
		gameDuck.quack();
		System.out.println();
	}
	
	@Test
	final void testRacerDuck() {
		Duck racerDuck = new Duck("Racer Duck",new FlyJet(), new SimpleQuack(), new BlackDuck());
		System.out.println("DuckType : " + racerDuck.getDuckType());
		racerDuck.fly();
		racerDuck.display();
		racerDuck.quack();
		System.out.println();
	}
	
	@Test
	final void testMoutainDuck() {
		Duck moutainDuck = new Duck("Moutain Duck",new FlyHigh(), new SimpleQuack(), new BlackDuck());
		System.out.println("DuckType : " + moutainDuck.getDuckType());
		moutainDuck.fly();
		moutainDuck.display();
		moutainDuck.quack();
		System.out.println();
	}

	
}
