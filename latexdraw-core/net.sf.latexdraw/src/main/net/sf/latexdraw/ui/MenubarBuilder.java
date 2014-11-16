package net.sf.latexdraw.ui;

import javax.swing.JMenuBar;

import net.sf.latexdraw.lang.LangTool;

import org.malai.swing.ui.SwingUIComposer;
import org.malai.swing.widget.MMenu;
import org.malai.swing.widget.MProgressBar;

/**
 * The composer that creates the menu bar of the application.<br>
 * <br>
 * This file is part of LaTeXDraw<br>
 * Copyright (c) 2005-2014 Arnaud BLOUIN<br>
 * <br>
 *  LaTeXDraw is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.<br>
 * <br>
 *  LaTeXDraw is distributed without any warranty; without even the
 *  implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 *  PURPOSE. See the GNU General Public License for more details.<br>
 * <br>
 * 12/08/11<br>
 * @author Arnaud BLOUIN
 * @version 3.0
 */
public class MenubarBuilder extends SwingUIComposer<JMenuBar> {
	/** The main frame of the application. */
	protected LFrame frame;

	/** This menu contains menu items related with drawings. */
	protected MMenu drawingMenu;

	/** This menu contains menu items related with the editing of shapes. */
	protected MMenu editMenu;

	/** This menu contains menu items related with the help. */
	protected MMenu helpMenu;


	/**
	 * Creates the menu bar.
	 * @param frame The user interface that contains all the instruments.
	 * @throws NullPointerException If one of the given arguments is null.
	 * @since 3.0
	 */
	public MenubarBuilder(final LFrame frame) {
		super();
		this.frame = frame;
	}


	@Override
	public void compose(final MProgressBar progressBar) {
		widget = new JMenuBar();
		composeDrawingMenu();
		composeEditMenu();
	}


	protected void composeDrawingMenu() {
		drawingMenu = new MMenu(LangTool.INSTANCE.getStringLaTeXDrawFrame("LaTeXDrawFrame.91"), true); //$NON-NLS-1$

		widget.add(drawingMenu);
		drawingMenu.add(frame.fileLoader.getNewMenu());
		drawingMenu.add(frame.fileLoader.getLoadMenu());
		drawingMenu.add(frame.fileLoader.getSaveMenu());
		drawingMenu.add(frame.fileLoader.getSaveAsMenu());
		drawingMenu.add(frame.fileLoader.getRecentFilesMenu());
		drawingMenu.addSeparator();
		drawingMenu.add(frame.exporter.getExportMenu());
		drawingMenu.addSeparator();
		drawingMenu.add(frame.templateManager.templateMenu());

		frame.exporter.getExportMenu().add(frame.templateManager.exportTemplateMenu());
	}


	protected void composeEditMenu() {
		editMenu = new MMenu(LangTool.INSTANCE.getStringLaTeXDrawFrame("LaTeXDrawFrame.89"), true); //$NON-NLS-1$
		editMenu.add(frame.paster.getCutMenu());
		editMenu.add(frame.paster.getCopyMenu());
		editMenu.add(frame.paster.getPasteMenu());
		widget.add(editMenu);
	}
}
