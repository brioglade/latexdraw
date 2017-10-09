package net.sf.latexdraw.parsers.ps;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPSCosCommand extends TestPSCommand<PSCosCommand> {
	@Override
	protected PSCosCommand createCmd() {
		return new PSCosCommand();
	}

	@Override
	@Test
	public void testExecuteVal0() throws InvalidFormatPSFunctionException {
		dequeue.push(0.0);
		cmd.execute(dequeue, 0.0);
		assertEquals(Math.cos(0.0), dequeue.peek(), 0.00001);
	}

	@Override
	@Test
	public void testExecuteValNeg() throws InvalidFormatPSFunctionException {
		dequeue.push(-10.0);
		cmd.execute(dequeue, 0.0);
		assertEquals(Math.cos(Math.toRadians(-10.0)), dequeue.peek(), 0.00001);
	}

	@Override
	@Test
	public void testExecuteValPos() throws InvalidFormatPSFunctionException {
		dequeue.push(10.0);
		cmd.execute(dequeue, 0.0);
		assertEquals(Math.cos(Math.toRadians(10.0)), dequeue.peek(), 0.00001);
	}

	@Override
	@Test(expected = InvalidFormatPSFunctionException.class)
	public void testExecuteInvalidDequeueSize() throws InvalidFormatPSFunctionException {
		cmd.execute(dequeue, 0.0);
	}
}
