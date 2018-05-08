package pucrs.s2b.exemplo03;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class AppTest {
	@Test
    public void testeFiveAndFiveGivesExam()
    {
		String expected = "Em exame";
        String actual = Medias.calcular(5.0, 5.0);
        assertEquals(expected, actual);
    }
	
	
	@Test
	public void SevenAndSevenGivesApproves()
	{
		String expected = "Aprovado";
		String actual = Medias.calcular(7.0, 7.0);
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void ThreeAndThreeGivesRep()
	{
		String expected = "Reprovado";
		String actual = Medias.calcular(3.0, 3.0);
		assertEquals(expected, actual);
	}
	
	
	
	@Test
	public void Three99AndThree99GivesRep()
	{
		String expected = "Reprovado";
		String actual = Medias.calcular(3.9, 3.9);
		assertEquals(expected, actual);
	}
	
	@Test
	public void Three99AndFour01GivesRep()
	{
		String expected = "Em exame";
		String actual = Medias.calcular(3.999, 4.001);
		assertEquals(expected, actual);
	}
}
