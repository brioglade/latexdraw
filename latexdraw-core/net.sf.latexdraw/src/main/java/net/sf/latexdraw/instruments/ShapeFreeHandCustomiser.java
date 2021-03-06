/*
 * This file is part of LaTeXDraw.
 * Copyright (c) 2005-2017 Arnaud BLOUIN
 * LaTeXDraw is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later version.
 * LaTeXDraw is distributed without any warranty; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 */
package net.sf.latexdraw.instruments;

import java.net.URL;
import java.util.EnumMap;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import net.sf.latexdraw.actions.shape.ShapeProperties;
import net.sf.latexdraw.models.interfaces.prop.IFreeHandProp;
import net.sf.latexdraw.models.interfaces.shape.FreeHandStyle;
import net.sf.latexdraw.models.interfaces.shape.IGroup;
import net.sf.latexdraw.view.jfx.JFXWidgetCreator;

/**
 * This instrument modifies free hand properties of shapes or the pencil.
 * @author Arnaud BLOUIN
 */
public class ShapeFreeHandCustomiser extends ShapePropertyCustomiser implements Initializable, JFXWidgetCreator {
	/** The type of the freehand. */
	@FXML private ComboBox<FreeHandStyle> freeHandType;
	/** The gap to consider between the points. */
	@FXML private Spinner<Integer> gapPoints;
	@FXML private TitledPane mainPane;

	/**
	 * Creates the instrument.
	 */
	public ShapeFreeHandCustomiser() {
		super();
	}

	@Override
	public void initialize(final URL location, final ResourceBundle resources) {
		mainPane.managedProperty().bind(mainPane.visibleProperty());

		final Map<FreeHandStyle, Image> cache = new EnumMap<>(FreeHandStyle.class);
		cache.put(FreeHandStyle.LINES, new Image("/res/freehand/line.png")); //NON-NLS
		cache.put(FreeHandStyle.CURVES, new Image("/res/freehand/curve.png")); //NON-NLS
		initComboBox(freeHandType, cache, FreeHandStyle.values());
	}

	@Override
	protected void update(final IGroup shape) {
		if(shape.isTypeOf(IFreeHandProp.class)) {
			setActivated(true);
			freeHandType.getSelectionModel().select(shape.getType());
			gapPoints.getValueFactory().setValue(shape.getInterval());
		}else {
			setActivated(false);
		}
	}

	@Override
	protected void setWidgetsVisible(final boolean visible) {
		mainPane.setVisible(visible);
	}

	@Override
	protected void configureBindings() throws InstantiationException, IllegalAccessException {
		addComboPropBinding(freeHandType, ShapeProperties.FREEHAND_STYLE);
		addSpinnerPropBinding(gapPoints, ShapeProperties.FREEHAND_INTERVAL, false);
	}
}
