package junitdemo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Test01.class, Test02.class, Test03.class, Test04.class,
		Test05.class})
public class AllTests {

}
