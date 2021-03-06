package net.sf.latexdraw.view.jfx;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeoutException;
import javafx.scene.Node;
import javafx.scene.shape.PathElement;
import javafx.scene.transform.Rotate;
import net.sf.latexdraw.models.ShapeFactory;
import net.sf.latexdraw.models.interfaces.shape.ArrowStyle;
import net.sf.latexdraw.models.interfaces.shape.IPolyline;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.runner.RunWith;
import org.testfx.api.FxToolkit;
import org.testfx.util.WaitForAsyncUtils;

import static org.junit.Assert.assertNotEquals;

@RunWith(Theories.class)
public class TestViewPolyline extends TestViewPolyPoint<ViewPolyline, IPolyline> {
	@BeforeClass
	public static void beforeClass() throws TimeoutException {
		FxToolkit.registerPrimaryStage();
	}

	@Override
	protected IPolyline createModel() {
		return ShapeFactory.INST.createPolyline(Arrays.asList(
		ShapeFactory.INST.createPoint(9, 23),
		ShapeFactory.INST.createPoint(21, 11),
		ShapeFactory.INST.createPoint(45, 3),
		ShapeFactory.INST.createPoint(87, 125),
		ShapeFactory.INST.createPoint(187, 25),
		ShapeFactory.INST.createPoint(287, 425),
		ShapeFactory.INST.createPoint(387, 325),
		ShapeFactory.INST.createPoint(19, 233),
		ShapeFactory.INST.createPoint(121, 114),
		ShapeFactory.INST.createPoint(445, 33)));
	}

	@Test
	public void testMovePointUpdatePathArrow0() {
		model.setArrowStyle(ArrowStyle.RIGHT_ARROW, 0);
		WaitForAsyncUtils.waitForFxEvents();
		final List<PathElement> pathArrow = duplicatePath(view.viewArrows.arrows.get(0).path.getElements());
		model.getPtAt(0).translate(10d, 11d);
		WaitForAsyncUtils.waitForFxEvents();
		assertNotEquals(pathArrow, view.viewArrows.arrows.get(0).path.getElements());
	}

	@Theory
	public void testMovePointUpdateTransformArrow0(@TestedOn(ints = {0, 1}) final int index) {
		model.setArrowStyle(ArrowStyle.RIGHT_ARROW, 0);
		WaitForAsyncUtils.waitForFxEvents();
		final Rotate rotation = (Rotate) view.viewArrows.arrows.get(0).path.getTransforms().get(0);
		model.getPtAt(index).translate(10d, 11d);
		WaitForAsyncUtils.waitForFxEvents();
		final Rotate rotation2 = (Rotate) view.viewArrows.arrows.get(0).path.getTransforms().get(0);
		assertNotEquals(rotation.getAngle(), rotation2.getAngle());
		assertNotEquals(rotation.getTx(), rotation2.getTx());
		assertNotEquals(rotation.getTy(), rotation2.getTy());
	}

	@Theory
	public void testMovePointUpdatePathArrow1() {
		model.setArrowStyle(ArrowStyle.RIGHT_ARROW, 1);
		WaitForAsyncUtils.waitForFxEvents();
		final List<PathElement> pathArrow = duplicatePath(view.viewArrows.arrows.get(1).path.getElements());
		model.getPtAt(9).translate(10d, 11d);
		WaitForAsyncUtils.waitForFxEvents();
		assertNotEquals(pathArrow, view.viewArrows.arrows.get(1).path.getElements());
	}

	@Theory
	public void testMovePointUpdateTransformArrow1(@TestedOn(ints = {8, 9}) final int index) {
		model.setArrowStyle(ArrowStyle.RIGHT_ARROW, 1);
		WaitForAsyncUtils.waitForFxEvents();
		final Rotate rotation = (Rotate) view.viewArrows.arrows.get(1).path.getTransforms().get(0);
		model.getPtAt(index).translate(10d, 11d);
		WaitForAsyncUtils.waitForFxEvents();
		final Rotate rotation2 = (Rotate) view.viewArrows.arrows.get(1).path.getTransforms().get(0);
		assertNotEquals(rotation.getAngle(), rotation2.getAngle());
		assertNotEquals(rotation.getTx(), rotation2.getTx());
		assertNotEquals(rotation.getTy(), rotation2.getTy());
	}

	@Theory
	public void testMovePointUpdateClip(@TestedOn(ints = {0, 1, 8, 9}) final int index) {
		model.setArrowStyle(ArrowStyle.RIGHT_ARROW, 0);
		model.setArrowStyle(ArrowStyle.RIGHT_ARROW, 1);
		WaitForAsyncUtils.waitForFxEvents();
		final Node clip = border.getClip();
		model.getPtAt(index).translate(10d, 11d);
		WaitForAsyncUtils.waitForFxEvents();
		assertNotEquals(clip, border.getClip());
	}

	@Test
	public void testThicknessChangesArrow() {
		model.setArrowStyle(ArrowStyle.RIGHT_ARROW, 0);
		WaitForAsyncUtils.waitForFxEvents();
		final List<PathElement> pathArrow = duplicatePath(view.viewArrows.arrows.get(0).path.getElements());
		model.setThickness(model.getThickness() * 2d);
		WaitForAsyncUtils.waitForFxEvents();
		assertNotEquals(pathArrow, view.viewArrows.arrows.get(0).path.getElements());
	}
}
