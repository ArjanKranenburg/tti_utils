/**
 * 
 */
package org.testtoolinterfaces.org;

import org.testtoolinterfaces.utils.Trace;

/**
 * @author Arjan Kranenbur
 *
 */
public class TraceTesterHelper
{
	public void depthTestHelper1()
	{
		Trace.println(Trace.EXEC, "depthTestHelper1");
		depthTestHelper2();
	}

	private void depthTestHelper2()
	{
		Trace.println(Trace.EXEC, "depthTestHelper2");
	}
}