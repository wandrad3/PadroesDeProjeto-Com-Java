package one.digitalinnovation.gof;



import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.AgressiveBehavior;
import one.digitalinnovation.gof.strategy.Behavior;
import one.digitalinnovation.gof.strategy.DefensiveBehavior;
import one.digitalinnovation.gof.strategy.Robot;
import one.digitalinnovation.gof.strategy.UsualBehavior;

public class Test {

	public static void main(String[] args) {
		//Testes relacionados ao Design Pattern Singleton
		SingletonLazy lazy = SingletonLazy.getInstacy();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstacy();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstacy();
		System.out.println(eager);
		eager = SingletonEager.getInstacy();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstacy();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstacy();
		System.out.println(lazyHolder);
		
		
		//Testes relacionados ao Design Pattern Strategy
		
		Behavior usualBehavior = new UsualBehavior();
		Behavior agressiveBehavior = new AgressiveBehavior();
		Behavior defensiveBehavior = new DefensiveBehavior();
		
		Robot robot = new Robot();
		robot.setStrategy(usualBehavior);
		robot.move();
		robot.move();
		robot.setStrategy(defensiveBehavior);
		robot.move();
		robot.move();
		robot.move();
		robot.setStrategy(agressiveBehavior);
		robot.move();
		robot.move();
		robot.move();
		
		//Testes relacionados ao Design Pattern Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Wesley", "0000111-10");
		
		
	}
}
