package software_homework4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testTest {

	private test test;
	@Before
	public void setUp() throws Exception {
		test=new test();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Assert.assertEquals('X',test.letterGrade(105));
		Assert.assertEquals('X',test.letterGrade(-5));
		Assert.assertEquals('A',test.letterGrade(95));
		Assert.assertEquals('B',test.letterGrade(85));
		Assert.assertEquals('C',test.letterGrade(75));
		Assert.assertEquals('D',test.letterGrade(65));
		Assert.assertEquals('F',test.letterGrade(55));
	}

}
