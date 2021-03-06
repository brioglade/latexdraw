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
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.input.KeyCode;
import net.sf.latexdraw.util.LSystem;
import org.malai.action.library.Redo;
import org.malai.action.library.Undo;
import org.malai.javafx.undo.FXUndoCollector;
import org.malai.undo.UndoCollector;

/**
 * This instrument allows to undo and redo saved actions.
 * This instrument provides two buttons to interact with and two shortcuts (ctrl/apple-Z, ctrl-apple-Y).
 * @author Arnaud Blouin
 */
public class UndoRedoManager extends CanvasInstrument implements Initializable {
	/** The button used to undo actions. */
	@FXML private Button undoB;
	/** The button used to redo actions. */
	@FXML private Button redoB;

	/**
	 * Creates the instrument.
	 */
	public UndoRedoManager() {
		super();
		UndoCollector.INSTANCE.addHandler(this);
	}

	@Override
	public void initialize(final URL location, final ResourceBundle resources) {
		setActivated(true);

		undoB.disableProperty().bind(FXUndoCollector.INSTANCE.lastUndoProperty().isNull().or(activatedProp.not()));
		redoB.disableProperty().bind(FXUndoCollector.INSTANCE.lastRedoProperty().isNull().or(activatedProp.not()));
		undoB.tooltipProperty().bind(Bindings.createObjectBinding(() ->
			UndoCollector.INSTANCE.getLastUndo().map(undo -> new Tooltip(undo.getUndoName())).orElse(null), FXUndoCollector.INSTANCE.lastUndoProperty()));
		redoB.tooltipProperty().bind(Bindings.createObjectBinding(() ->
			UndoCollector.INSTANCE.getLastRedo().map(redo -> new Tooltip(redo.getUndoName())).orElse(null), FXUndoCollector.INSTANCE.lastRedoProperty()));
	}

	@Override
	protected void configureBindings() throws IllegalAccessException, InstantiationException {
		buttonBinder(Undo.class).on(undoB).bind();
		buttonBinder(Redo.class).on(redoB).bind();
		keyNodeBinder(Undo.class).on(canvas).with(KeyCode.Z, LSystem.INSTANCE.getControlKey()).bind();
		keyNodeBinder(Redo.class).on(canvas).with(KeyCode.Y, LSystem.INSTANCE.getControlKey()).bind();
	}

	@Override
	public void setActivated(final boolean act) {
		super.setActivated(act);

		undoB.setVisible(act);
		redoB.setVisible(act);
	}
}
