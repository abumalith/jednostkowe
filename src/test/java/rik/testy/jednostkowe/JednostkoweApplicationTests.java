package rik.testy.jednostkowe;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import rik.testy.jednostkowe.calc.Calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JednostkoweApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testingMnoz() {
		assertEquals(10.0, Calculator.mnoz(2d, 5d), 0.0);
		assertEquals(-10.0, Calculator.mnoz(-2d, 5d), 0.0);
		System.out.println("Calc.mnoz dzialz! lolzor!");
	}
	
	@Test
	public void testingDodaj() {
		assertEquals(5.0, Calculator.dodaj(2d, 3d), 0.0);
		assertEquals(-1, Calculator.dodaj(2d, -3d), 0.0);
		assertNotEquals(-1, Calculator.dodaj(2d, 3d), 0.0);
		System.out.println("Calc.dodaj dzialz! rolflmaohahaha!!!1one1!");
	}

}
