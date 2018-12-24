package software_homework4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testTest2 {

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
		Assert.assertEquals('X',test.letterGrade(101));
		Assert.assertEquals('A',test.letterGrade(100));
		Assert.assertEquals('A',test.letterGrade(99));
		Assert.assertEquals('A',test.letterGrade(91));
		Assert.assertEquals('A',test.letterGrade(90));
		Assert.assertEquals('B',test.letterGrade(89));
		Assert.assertEquals('B',test.letterGrade(81));
		Assert.assertEquals('B',test.letterGrade(80));
		Assert.assertEquals('C',test.letterGrade(79));
		Assert.assertEquals('C',test.letterGrade(71));
		Assert.assertEquals('C',test.letterGrade(70));
		Assert.assertEquals('D',test.letterGrade(69));
		Assert.assertEquals('D',test.letterGrade(61));
		Assert.assertEquals('D',test.letterGrade(60));
		Assert.assertEquals('F',test.letterGrade(59));
		Assert.assertEquals('F',test.letterGrade(1));
		Assert.assertEquals('F',test.letterGrade(0));
		Assert.assertEquals('X',test.letterGrade(-1));
	}
}
