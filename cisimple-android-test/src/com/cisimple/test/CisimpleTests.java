package com.cisimple.test;

import junit.framework.Assert;
import android.test.AndroidTestCase;

public class CisimpleTests extends AndroidTestCase
{
	public void testWillPass() throws Exception
	{
		Assert.assertTrue(true);
	}
	
	public void testWillFail()
	{
		Assert.assertTrue(false);
	}
}
