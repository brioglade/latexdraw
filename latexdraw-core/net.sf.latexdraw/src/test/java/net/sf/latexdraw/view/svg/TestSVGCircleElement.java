package net.sf.latexdraw.view.svg;

import net.sf.latexdraw.parsers.svg.MalformedSVGDocument;
import net.sf.latexdraw.parsers.svg.SVGAttributes;
import net.sf.latexdraw.parsers.svg.SVGCircleElement;
import net.sf.latexdraw.parsers.svg.SVGDocument;
import net.sf.latexdraw.parsers.svg.SVGElement;
import net.sf.latexdraw.parsers.svg.SVGElements;
import net.sf.latexdraw.parsers.svg.parsers.SVGLength;
import net.sf.latexdraw.parsers.svg.parsers.UnitProcessor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestSVGCircleElement extends AbstractTestSVGElement {
	@Override
	@Before
	public void setUp() {
		doc = new SVGDocument();
		node = (SVGElement)doc.createElement(SVGElements.SVG_CIRCLE);
	}

	@SuppressWarnings("unused")
	@Test(expected = IllegalArgumentException.class)
	public void testContructorFail1() throws MalformedSVGDocument {
		new SVGCircleElement(null, null);
	}

	@SuppressWarnings("unused")
	@Test(expected = MalformedSVGDocument.class)
	public void testContructorFail2() throws MalformedSVGDocument {
		new SVGCircleElement(node, null);
	}

	@SuppressWarnings("unused")
	@Test(expected = MalformedSVGDocument.class)
	public void testContructorFail3() throws MalformedSVGDocument {
		node.setAttribute(SVGAttributes.SVG_R, "dsd");
		new SVGCircleElement(node, null);
	}

	@SuppressWarnings("unused")
	@Test(expected = MalformedSVGDocument.class)
	public void testContructorFail4() throws MalformedSVGDocument {
		node.setAttribute(SVGAttributes.SVG_R, "-1");
		new SVGCircleElement(node, null);
	}

	@SuppressWarnings("unused")
	@Test
	public void testContructorOK() throws MalformedSVGDocument {
		node.setAttribute(SVGAttributes.SVG_R, "10");
		new SVGCircleElement(node, null);
	}

	@Test
	public void testGetCy() throws MalformedSVGDocument {
		node.setAttribute(SVGAttributes.SVG_R, "10");
		SVGCircleElement e = new SVGCircleElement(node, null);
		assertEquals(e.getCy(), 0., 0.0001);

		node.setAttribute(SVGAttributes.SVG_CY, "40");
		e = new SVGCircleElement(node, null);
		assertEquals(e.getCy(), 40., 0.0001);

		node.setAttribute(SVGAttributes.SVG_CY, "40px ");
		e = new SVGCircleElement(node, null);
		assertEquals(e.getCy(), 40., 0.0001);

		node.setAttribute(SVGAttributes.SVG_CY, " 40 cm ");
		e = new SVGCircleElement(node, null);
		assertEquals(e.getCy(), UnitProcessor.INSTANCE.toUserUnit(40, SVGLength.LengthType.CM), 0.0001);
	}

	@Test
	public void testGetCx() throws MalformedSVGDocument {
		node.setAttribute(SVGAttributes.SVG_R, "10");
		SVGCircleElement e = new SVGCircleElement(node, null);
		assertEquals(e.getCx(), 0., 0.0001);

		node.setAttribute(SVGAttributes.SVG_CX, "76.987");
		e = new SVGCircleElement(node, null);
		assertEquals(e.getCx(), 76.987, 0.0001);

		node.setAttribute(SVGAttributes.SVG_CX, "40px ");
		e = new SVGCircleElement(node, null);
		assertEquals(e.getCx(), 40., 0.0001);

		node.setAttribute(SVGAttributes.SVG_CX, " 30.5 mm ");
		e = new SVGCircleElement(node, null);
		assertEquals(e.getCx(), UnitProcessor.INSTANCE.toUserUnit(30.5, SVGLength.LengthType.MM), 0.0001);
	}

	@Test
	public void testEnableRendering() throws MalformedSVGDocument {
		node.setAttribute(SVGAttributes.SVG_R, "0");
		SVGCircleElement e = new SVGCircleElement(node, null);
		assertFalse(e.enableRendering());

		node.setAttribute(SVGAttributes.SVG_R, "10");
		e = new SVGCircleElement(node, null);
		assertTrue(e.enableRendering());
	}

	@Test
	public void testGetR() throws MalformedSVGDocument {
		node.setAttribute(SVGAttributes.SVG_R, "20");
		SVGCircleElement e = new SVGCircleElement(node, null);
		assertEquals(e.getR(), 20., 0.0001);
		node.setAttribute(SVGAttributes.SVG_R, "20 pt");
		e = new SVGCircleElement(node, null);
		assertEquals(e.getR(), UnitProcessor.INSTANCE.toUserUnit(20, SVGLength.LengthType.PT), 0.0001);
	}

	@Override
	public String getNameNode() {
		return SVGElements.SVG_CIRCLE;
	}
}
