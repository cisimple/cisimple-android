package com.cisimple.test;

import junit.framework.Assert;
import android.test.AndroidTestCase;

public class CisimpleTests extends AndroidTestCase
{
	public void willPassTest() throws Exception
	{
		Assert.assertTrue(true);
	}
	
	public void willFailTest()
	{
		Assert.assertTrue(false);
	}
}
