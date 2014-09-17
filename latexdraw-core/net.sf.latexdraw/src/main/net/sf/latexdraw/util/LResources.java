package net.sf.latexdraw.util;

import java.awt.Insets;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;

import net.sf.latexdraw.badaboom.BadaboomCollector;
import net.sf.latexdraw.lang.LangTool;

/**
 * Contains all the icons and the labels used by latexdraw.<br>
 * This file is part of LaTeXDraw<br>
 * Copyright (c) 2005-2014 Arnaud BLOUIN<br>
 *<br>
 *  LaTeXDraw is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.<br>
 *<br>
 *  LaTeXDraw is distributed without any warranty; without even the
 *  implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 *  PURPOSE. See the GNU General Public License for more details.<br>
 * <br>
 * 09/21/07<br>
 * @author Arnaud BLOUIN
 * @version 3.0
 * @since 2.0.0
 */
public final class LResources {
	private LResources() {
		super();
	}

	/** The line separator of the current system. */
	public static final String EOL = System.getProperty("line.separator"); //$NON-NLS-1$

	/** The file separator of the current system. */
	public static final String FILE_SEP = System.getProperty("file.separator"); //$NON-NLS-1$

	/** The name of the application */
    public static final String LABEL_APP = "LaTeXDraw";//$NON-NLS-1$

	/** The label of the menu "aboutTexDraw" */
    public static final String LABEL_ABOUT = "About LaTeXDraw";

	/** The label of the newMenu item */
    public static final String LABEL_NEW = "New drawing";

	public static final String LABEL_NEW_WITH_SEL =LangTool.INSTANCE.getStringLaTeXDrawFrame("LRes.0"); //$NON-NLS-1$

	/** The label of the menu copy */
	public static final String LABEL_COPY = LangTool.INSTANCE.getStringLaTeXDrawFrame("LaTeXDrawFrame.40"); //$NON-NLS-1$

	/** The label of the menu paste */
	public static final String LABEL_PASTE = LangTool.INSTANCE.getStringLaTeXDrawFrame("LaTeXDrawFrame.43"); //$NON-NLS-1$

	/** The label of the menu cut */
	public static final String LABEL_CUT = LangTool.INSTANCE.getStringLaTeXDrawFrame("LaTeXDrawFrame.44"); //$NON-NLS-1$

	public static final String LABEL_DISPLAY_PERSO_GRID = "Customised grid";

	/** The label of the menuItem displayGrid */
	public static final String LABEL_DISPLAY_GRID = LangTool.INSTANCE.getString18("PreferencesFrame.4"); //$NON-NLS-1$

	public static final String LABEL_UPDATE_TO_GRID = LangTool.INSTANCE.getString19("DrawPanel.0"); //$NON-NLS-1$

	public static final ImageIcon DIM_POS_ICON;
	public static final ImageIcon ARROW_ICON;
	public static final ImageIcon TEXTPOS_L;
	public static final ImageIcon TEXTPOS_R;
	public static final ImageIcon TEXTPOS_T;
	public static final ImageIcon TEXTPOS_TL;
	public static final ImageIcon TEXTPOS_TR;
	public static final ImageIcon TEXTPOS_B;
	public static final ImageIcon TEXTPOS_BR;
	public static final ImageIcon TEXTPOS_BL;
	public static final ImageIcon TEXTPOS_CENTRE;
	public static final ImageIcon FILLING_ICON;
	public static final ImageIcon BORDER_ICON;
	public static final ImageIcon DOUBLE_BORDER_ICON;
	public static final ImageIcon SHADOW_ICON;
    public static final ImageIcon PDF_ICON;
	public static final ImageIcon BEZIER_CURVE_ICON;		public static final ImageIcon CHORD_ICON;
	public static final ImageIcon NEW_ICON;					public static final ImageIcon LINE_STYLE_NONE_ICON;
	public static final ImageIcon OPEN_ICON; 				public static final ImageIcon LINE_STYLE_DASHED_ICON;
	public static final ImageIcon SAVE_ICON ;				public static final ImageIcon LINE_STYLE_DOTTED_ICON;
	public static final ImageIcon SAVE_AS_ICON;				public static final ImageIcon DOT_STYLE_NONE_ICON;
	public static final ImageIcon CIRCLE_ICON;				public static final ImageIcon DOT_STYLE_SQUARE_ICON;
	public static final ImageIcon DEL_ICON;					public static final ImageIcon DOT_STYLE_SQUARE_F_ICON;
	public static final ImageIcon DOT_ICON;					public static final ImageIcon DOT_STYLE_PENTAGON_ICON;
	public static final ImageIcon ELLIPSE_ICON;				public static final ImageIcon DOT_STYLE_PENTAGON_F_ICON;
	public static final ImageIcon EMPTY_ICON;				public static final ImageIcon DOT_STYLE_TRIANGLE_ICON;
	public static final ImageIcon DOT_STYLE_TRIANGLE_F_ICON;
	public static final ImageIcon RECT_ICON;				public static final ImageIcon DOT_STYLE_BAR_ICON;
	public static final ImageIcon RHOMBUS_ICON;				public static final ImageIcon DOT_STYLE_ASTERISK_ICON;
	public static final ImageIcon SELECT_ICON; 				public static final ImageIcon DOT_STYLE_CROSS_ICON;
	public static final ImageIcon SQUARE_ICON; 				public static final ImageIcon DOT_STYLE_DIAMOND_ICON;
	public static final ImageIcon TRIANGLE_ICON;			public static final ImageIcon DOT_STYLE_DIAMOND_F_ICON;
	public static final ImageIcon PROPERTIES_ICON; 			public static final ImageIcon DOT_STYLE_O_ICON;
	public static final ImageIcon DOT_STYLE_O_PLUS_ICON;
	public static final ImageIcon DOT_STYLE_O_CROSS_ICON;	public static final ImageIcon UPDATE_ICON;
	public static final ImageIcon DOT_STYLE_PLUS_ICON;
	public static final ImageIcon ARROW_STYLE_ARC_L_ICON;
	public static final ImageIcon ARROW_STYLE_ARC_R_ICON;
	public static final ImageIcon ARROW_STYLE_ARC_RR_ICON;	public static final ImageIcon ARROW_STYLE_ARC_LR_ICON;
	public static final ImageIcon ABOUT_ICON;				public static final ImageIcon ARROW_STYLE_ARROW_L_ICON;
	public static final ImageIcon HELP_ICON;				public static final ImageIcon ARROW_STYLE_ARROW_R_ICON;
	public static final ImageIcon PREFERENCES_ICON;			public static final ImageIcon ARROW_STYLE_BAR_END_L_ICON;
	public static final ImageIcon ARROW_STYLE_BAR_END_R_ICON; 	public static final ImageIcon DRAWING_PROP_ICON;
	public static final ImageIcon ARC_ICON;					public static final ImageIcon ARROW_STYLE_BAR_IN_L_ICON;
	public static final ImageIcon WEDGE_ICON;				public static final ImageIcon ARROW_STYLE_BAR_IN_R_ICON;
	public static final ImageIcon ARROW_STYLE_BRACK_L_ICON; public static final ImageIcon PLOT_ICON;
	public static final ImageIcon ARROW_STYLE_BRACK_LR_ICON; 	public static final ImageIcon ARROW_STYLE_BRACK_RR_ICON;
	public static final ImageIcon ARROW_STYLE_BRACK_R_ICON;
	public static final ImageIcon ZOOM_DEFAULT_ICON;		public static final ImageIcon ARROW_STYLE_CIRCLE_END_L_ICON;
	public static final ImageIcon UNDO_ICON;				public static final ImageIcon ARROW_STYLE_CIRCLE_END_R_ICON;
	public static final ImageIcon REDO_ICON;				public static final ImageIcon ARROW_STYLE_CIRCLE_IN_L_ICON;
	public static final ImageIcon BACKGROUND_ICON;   		public static final ImageIcon ARROW_STYLE_CIRCLE_IN_R_ICON;
	public static final ImageIcon FOREGROUND_ICON;   		public static final ImageIcon ARROW_STYLE_DBLE_ARROW_L_ICON;
	public static final ImageIcon ARROW_STYLE_DBLE_ARROW_R_ICON;
	public static final ImageIcon ARROW_STYLE_DISK_END_L_ICON;
	public static final ImageIcon ROTATE_ICON;	 			public static final ImageIcon ARROW_STYLE_DISK_END_R_ICON;
	public static final ImageIcon POLYGON_ICON;	 			public static final ImageIcon ARROW_STYLE_DISK_IN_L_ICON;
	public static final ImageIcon TEXT_ICON;		 		public static final ImageIcon ARROW_STYLE_DISK_IN_R_ICON;
	public static final ImageIcon FREE_HAND_ICON; 			public static final ImageIcon ARROW_STYLE_NONE_L_ICON;
	public static final ImageIcon ARROW_STYLE_NONE_R_ICON;	public static final ImageIcon ARROW_STYLE_R_DBLE_ARROW_L_ICON;
	public static final ImageIcon ARROW_STYLE_R_DBLE_ARROW_R_ICON; 	public static final ImageIcon ARROW_STYLE_R_ARROW_L_ICON;
	public static final ImageIcon ARROW_STYLE_R_ARROW_R_ICON; 		public static final ImageIcon COPY_ICON;
	public static final ImageIcon PASTE_ICON;						public static final ImageIcon CUT_ICON;
	public static final ImageIcon ARROW_STYLE_ROUND_IN_L_ICON;		public static final ImageIcon ARROW_STYLE_ROUND_IN_R_ICON;
	public static final ImageIcon HATCH_NONE_ICON;			public static final ImageIcon HATCH_SOLID_ICON;
	public static final ImageIcon HATCH_HORIZ_ICON;			public static final ImageIcon HACTH_VERT_ICON;
	public static final ImageIcon HATCH_F_HORIZ_ICON;		public static final ImageIcon HATCH_F_VERT_ICON;
	public static final ImageIcon HATCH_CROSS_ICON;			public static final ImageIcon HATCH_F_CROSS_ICON;
	public static final ImageIcon GRID_ICON;				public static final ImageIcon SUBGRID_ICON;
	public static final ImageIcon JOIN_ICON;				public static final ImageIcon SEPARATE_ICON;
	public static final ImageIcon MIDDLE_ICON;				public static final ImageIcon INNER_ICON;
	public static final ImageIcon OUTER_ICON;
	public static final ImageIcon COMMENT_ICON;
	public static final ImageIcon LINES_ICON;	 			public static final ImageIcon LATEXDRAW_ICON;
	public static final ImageIcon ERR_ICON;
	public static final ImageIcon STOP_ICON;
	public static final ImageIcon INSERT_PIC_ICON; 			public static final ImageIcon INSERT_PST_ICON;
	public static final ImageIcon THICKNESS_ICON; 			public static final ImageIcon GRADIENT_ICON;
	public static final ImageIcon DISPLAY_GRID_ICON;		public static final ImageIcon ROTATE_270_ICON;
	public static final ImageIcon ROTATE_180_ICON; 			public static final ImageIcon ROTATE_90_ICON;
	public static final ImageIcon MIRROR_V_ICON;			public static final ImageIcon MIRROR_H_ICON;
	public static final ImageIcon AXES_ICON;				public static final ImageIcon TEX_EDITOR_ICON;
	public static final ImageIcon CURVES_FREEHAND_ICON;
	public static final ImageIcon LINES_FREEHAND_ICON;
	public static final ImageIcon CLOSED_BEZIER_ICON;
	public static final ImageIcon ALIGN_BOTTOM_ICON;		public static final ImageIcon ALIGN_LEFT_ICON;
	public static final ImageIcon ALIGN_MID_HORIZ_ICON; 	public static final ImageIcon ALIGN_MID_VERT_ICON;
	public static final ImageIcon ALIGN_RIGHT_ICON;			public static final ImageIcon ALIGN_TOP_ICON;
	public static final ImageIcon DIST_VERT_BOTTOM_ICON;	public static final ImageIcon DIST_HORIZ_EQUAL_ICON;
	public static final ImageIcon DIST_VERT_MID_ICON; 		public static final ImageIcon DIST_VERT_TOP_ICON;
	public static final ImageIcon DIST_VERT_EQUAL_ICON;		public static final ImageIcon DIST_HORIZ_MID_ICON;
	public static final ImageIcon DIST_HORIZ_LEFT_ICON;		public static final ImageIcon DIST_HORIZ_RIGHT_ICON;
	public static final ImageIcon ROUNDNESS_ICON;
	public static final ImageIcon GRID_GAP_ICON;
	public static final ImageIcon BUTTON_CLOSE_IN_ICON;
	public static final ImageIcon BUTTON_CLOSE_OUT_ICON;
	public static final ImageIcon GRID_X_LABEL;
	public static final ImageIcon GRID_Y_LABEL;
	public static final ImageIcon GRID_LABELS;
	public static final ImageIcon RELOAD_ICON;


	static {
		PLOT_ICON			= loadImageIcon("/res/plot.png");//$NON-NLS-1$
		RELOAD_ICON			= loadImageIcon("/res/view-refresh.png");//$NON-NLS-1$
		GRID_LABELS			= loadImageIcon("/res/gridLabels.png");//$NON-NLS-1$
		GRID_X_LABEL		= loadImageIcon("/res/xGridLabel.png");//$NON-NLS-1$
		GRID_Y_LABEL		= loadImageIcon("/res/yGridLabel.png");//$NON-NLS-1$

		DIM_POS_ICON		= loadImageIcon("/res/dimPos.png");//$NON-NLS-1$

		TEXTPOS_L			= loadImageIcon("/res/textPosLeft.png");//$NON-NLS-1$
		TEXTPOS_R			= loadImageIcon("/res/textPosRight.png");//$NON-NLS-1$
		TEXTPOS_BL			= loadImageIcon("/res/textPosBL.png");//$NON-NLS-1$
		TEXTPOS_B			= loadImageIcon("/res/textPosB.png");//$NON-NLS-1$
		TEXTPOS_BR			= loadImageIcon("/res/textPosBR.png");//$NON-NLS-1$
		TEXTPOS_TL			= loadImageIcon("/res/textPosTL.png");//$NON-NLS-1$
		TEXTPOS_T			= loadImageIcon("/res/textPosT.png");//$NON-NLS-1$
		TEXTPOS_TR			= loadImageIcon("/res/textPosTR.png");//$NON-NLS-1$
		TEXTPOS_CENTRE		= loadImageIcon("/res/textPosCentre.png");//$NON-NLS-1$
		FILLING_ICON		= loadImageIcon("/res/filling.png");//$NON-NLS-1$
		BORDER_ICON			= loadImageIcon("/res/border.png");//$NON-NLS-1$
		DOUBLE_BORDER_ICON	= loadImageIcon("/res/doubleBorder.png");//$NON-NLS-1$
		SHADOW_ICON			= loadImageIcon("/res/shadow.png");//$NON-NLS-1$
		ROUNDNESS_ICON 		= loadImageIcon("/res/roundness.png");//$NON-NLS-1$
		GRID_GAP_ICON  		= loadImageIcon("/res/gridGap.png");//$NON-NLS-1$

		HATCH_NONE_ICON  = loadImageIcon("/res/hatch/hatch.none.png");//$NON-NLS-1$
		HACTH_VERT_ICON  = loadImageIcon("/res/hatch/hatch.vert.png");//$NON-NLS-1$
		HATCH_HORIZ_ICON = loadImageIcon("/res/hatch/hatch.horiz.png");//$NON-NLS-1$
		HATCH_CROSS_ICON = loadImageIcon("/res/hatch/hatch.cross.png");//$NON-NLS-1$
		HATCH_SOLID_ICON = loadImageIcon("/res/hatch/hatch.solid.png");//$NON-NLS-1$
		HATCH_F_VERT_ICON = loadImageIcon("/res/hatch/hatchf.vert.png");//$NON-NLS-1$
		HATCH_F_HORIZ_ICON= loadImageIcon("/res/hatch/hatchf.horiz.png");//$NON-NLS-1$
		HATCH_F_CROSS_ICON= loadImageIcon("/res/hatch/hatchf.cross.png");//$NON-NLS-1$

		ARROW_ICON				= loadImageIcon("/res/arrowStyles/arrowIcon.png");//$NON-NLS-1$
		ARROW_STYLE_ARC_L_ICON = loadImageIcon("/res/arrowStyles/line.arc.left.png");//$NON-NLS-1$
		ARROW_STYLE_ARC_R_ICON = loadImageIcon("/res/arrowStyles/line.arc.right.png");//$NON-NLS-1$
		ARROW_STYLE_ARC_LR_ICON = loadImageIcon("/res/arrowStyles/line.arc.r.left.png");//$NON-NLS-1$
		ARROW_STYLE_ARC_RR_ICON = loadImageIcon("/res/arrowStyles/line.arc.r.right.png");//$NON-NLS-1$
		ARROW_STYLE_ARROW_L_ICON = loadImageIcon("/res/arrowStyles/line.arrow.left.png");//$NON-NLS-1$
		ARROW_STYLE_ARROW_R_ICON = loadImageIcon("/res/arrowStyles/line.arrow.right.png");//$NON-NLS-1$
		ARROW_STYLE_BAR_END_L_ICON = loadImageIcon("/res/arrowStyles/line.barEnd.left.png");//$NON-NLS-1$
		ARROW_STYLE_BAR_END_R_ICON = loadImageIcon("/res/arrowStyles/line.barEnd.right.png");//$NON-NLS-1$
		ARROW_STYLE_BAR_IN_L_ICON = loadImageIcon("/res/arrowStyles/line.barIn.left.png");//$NON-NLS-1$
		ARROW_STYLE_BAR_IN_R_ICON = loadImageIcon("/res/arrowStyles/line.barIn.right.png");//$NON-NLS-1$
		ARROW_STYLE_BRACK_L_ICON = loadImageIcon("/res/arrowStyles/line.bracket.left.png");//$NON-NLS-1$
		ARROW_STYLE_BRACK_R_ICON = loadImageIcon("/res/arrowStyles/line.bracket.right.png");//$NON-NLS-1$
		ARROW_STYLE_BRACK_LR_ICON = loadImageIcon("/res/arrowStyles/line.bracket.r.left.png");//$NON-NLS-1$
		ARROW_STYLE_BRACK_RR_ICON = loadImageIcon("/res/arrowStyles/line.bracket.r.right.png");//$NON-NLS-1$
		ARROW_STYLE_CIRCLE_END_L_ICON = loadImageIcon("/res/arrowStyles/line.circle.end.left.png");//$NON-NLS-1$
		ARROW_STYLE_CIRCLE_END_R_ICON = loadImageIcon("/res/arrowStyles/line.circle.end.right.png");//$NON-NLS-1$
		ARROW_STYLE_CIRCLE_IN_L_ICON = loadImageIcon("/res/arrowStyles/line.circle.in.left.png");//$NON-NLS-1$
		ARROW_STYLE_CIRCLE_IN_R_ICON = loadImageIcon("/res/arrowStyles/line.circle.in.right.png");//$NON-NLS-1$
		ARROW_STYLE_DBLE_ARROW_L_ICON = loadImageIcon("/res/arrowStyles/line.dbleArrow.left.png");//$NON-NLS-1$
		ARROW_STYLE_DBLE_ARROW_R_ICON = loadImageIcon("/res/arrowStyles/line.dbleArrow.right.png");//$NON-NLS-1$
		ARROW_STYLE_DISK_END_L_ICON = loadImageIcon("/res/arrowStyles/line.disk.end.left.png");//$NON-NLS-1$
		ARROW_STYLE_DISK_END_R_ICON = loadImageIcon("/res/arrowStyles/line.disk.end.right.png");//$NON-NLS-1$
		ARROW_STYLE_DISK_IN_L_ICON = loadImageIcon("/res/arrowStyles/line.disk.in.left.png");//$NON-NLS-1$
		ARROW_STYLE_DISK_IN_R_ICON = loadImageIcon("/res/arrowStyles/line.disk.in.right.png");//$NON-NLS-1$
		ARROW_STYLE_NONE_L_ICON = loadImageIcon("/res/arrowStyles/line.none.left.png");//$NON-NLS-1$
		ARROW_STYLE_NONE_R_ICON = loadImageIcon("/res/arrowStyles/line.none.right.png");//$NON-NLS-1$
		ARROW_STYLE_R_ARROW_L_ICON = loadImageIcon("/res/arrowStyles/line.rarrow.left.png");//$NON-NLS-1$
		ARROW_STYLE_R_ARROW_R_ICON = loadImageIcon("/res/arrowStyles/line.rarrow.right.png");//$NON-NLS-1$
		ARROW_STYLE_R_DBLE_ARROW_L_ICON = loadImageIcon("/res/arrowStyles/line.rdbleArrow.left.png");//$NON-NLS-1$
		ARROW_STYLE_R_DBLE_ARROW_R_ICON = loadImageIcon("/res/arrowStyles/line.rdbleArrow.right.png");//$NON-NLS-1$
		ARROW_STYLE_ROUND_IN_L_ICON = loadImageIcon("/res/arrowStyles/line.roundIn.left.png");//$NON-NLS-1$
		ARROW_STYLE_ROUND_IN_R_ICON = loadImageIcon("/res/arrowStyles/line.roundIn.right.png");//$NON-NLS-1$

		DOT_STYLE_ASTERISK_ICON = loadImageIcon("/res/dotStyles/dot.asterisk.png");//$NON-NLS-1$
		DOT_STYLE_NONE_ICON = loadImageIcon("/res/dotStyles/dot.none.png");//$NON-NLS-1$
		DOT_STYLE_BAR_ICON = loadImageIcon("/res/dotStyles/dot.bar.png");//$NON-NLS-1$
		DOT_STYLE_O_ICON = loadImageIcon("/res/dotStyles/dot.o.png");//$NON-NLS-1$
		DOT_STYLE_CROSS_ICON = loadImageIcon("/res/dotStyles/dot.cross.png");//$NON-NLS-1$
		DOT_STYLE_DIAMOND_ICON = loadImageIcon("/res/dotStyles/dot.diamond.png");//$NON-NLS-1$
		DOT_STYLE_DIAMOND_F_ICON = loadImageIcon("/res/dotStyles/dot.diamondF.png");//$NON-NLS-1$
		DOT_STYLE_O_CROSS_ICON = loadImageIcon("/res/dotStyles/dot.ocross.png");//$NON-NLS-1$
		DOT_STYLE_O_PLUS_ICON = loadImageIcon("/res/dotStyles/dot.oplus.png");//$NON-NLS-1$
		DOT_STYLE_PENTAGON_ICON = loadImageIcon("/res/dotStyles/dot.pentagon.png");//$NON-NLS-1$
		DOT_STYLE_PENTAGON_F_ICON = loadImageIcon("/res/dotStyles/dot.pentagonF.png");//$NON-NLS-1$
		DOT_STYLE_PLUS_ICON = loadImageIcon("/res/dotStyles/dot.plus.png");//$NON-NLS-1$
		DOT_STYLE_SQUARE_ICON = loadImageIcon("/res/dotStyles/dot.square.png");//$NON-NLS-1$
		DOT_STYLE_SQUARE_F_ICON = loadImageIcon("/res/dotStyles/dot.squareF.png");//$NON-NLS-1$
		DOT_STYLE_TRIANGLE_ICON = loadImageIcon("/res/dotStyles/dot.triangle.png");//$NON-NLS-1$
		DOT_STYLE_TRIANGLE_F_ICON = loadImageIcon("/res/dotStyles/dot.triangleF.png");//$NON-NLS-1$

		LINE_STYLE_NONE_ICON 	= loadImageIcon("/res/lineStyles/lineStyle.none.png");//$NON-NLS-1$
		LINE_STYLE_DASHED_ICON = loadImageIcon("/res/lineStyles/lineStyle.dashed.png");//$NON-NLS-1$
		LINE_STYLE_DOTTED_ICON = loadImageIcon("/res/lineStyles/lineStyle.dotted.png");//$NON-NLS-1$

		MIDDLE_ICON = loadImageIcon("/res/doubleBoundary/double.boundary.middle.png");//$NON-NLS-1$
		INNER_ICON  = loadImageIcon("/res/doubleBoundary/double.boundary.into.png");//$NON-NLS-1$
		OUTER_ICON  = loadImageIcon("/res/doubleBoundary/double.boundary.out.png");//$NON-NLS-1$

		GRID_ICON		= loadImageIcon("/res/grid.png");//$NON-NLS-1$
		SUBGRID_ICON	= loadImageIcon("/res/subgrid.png");//$NON-NLS-1$
		COPY_ICON  		= loadImageIcon("/res/Copy.png");//$NON-NLS-1$
		PASTE_ICON 		= loadImageIcon("/res/Paste.png");//$NON-NLS-1$
		CUT_ICON   		= loadImageIcon("/res/Cut.png");//$NON-NLS-1$
		FREE_HAND_ICON 	= loadImageIcon("/res/Draw.png");	//$NON-NLS-1$
		TEXT_ICON 		= loadImageIcon("/res/text.png");		//$NON-NLS-1$
		POLYGON_ICON 	= loadImageIcon("/res/polygon.png");	//$NON-NLS-1$
		ROTATE_ICON 		= loadImageIcon("/res/rotation.png");	//$NON-NLS-1$
		BACKGROUND_ICON 	= loadImageIcon("/res/background.png");	//$NON-NLS-1$
		FOREGROUND_ICON 	= loadImageIcon("/res/foreground.png");//$NON-NLS-1$
		UNDO_ICON 		= loadImageIcon("/res/Undo.png");//$NON-NLS-1$
		REDO_ICON 		= loadImageIcon("/res/Redo.png");	//$NON-NLS-1$
		ZOOM_DEFAULT_ICON = loadImageIcon("/res/Magnify.png");	//$NON-NLS-1$
		WEDGE_ICON 		= loadImageIcon("/res/wedge.png");//$NON-NLS-1$
		ARC_ICON 		= loadImageIcon("/res/Arc.png");	//$NON-NLS-1$
		PREFERENCES_ICON = loadImageIcon("/res/preferences-system.png");	//$NON-NLS-1$
		NEW_ICON 		= loadImageIcon("/res/New.png");	//$NON-NLS-1$
		OPEN_ICON 		= loadImageIcon("/res/document-open.png");	//$NON-NLS-1$
		SAVE_ICON 		= loadImageIcon("/res/document-save.png");	//$NON-NLS-1$
		SAVE_AS_ICON 		= loadImageIcon("/res/document-save-as.png");//$NON-NLS-1$
		CIRCLE_ICON 		= loadImageIcon("/res/circle.png");	//$NON-NLS-1$
		DEL_ICON 		= loadImageIcon("/res/del.png");		//$NON-NLS-1$
		DOT_ICON 		= loadImageIcon("/res/dot.png");	//$NON-NLS-1$
		ELLIPSE_ICON 	= loadImageIcon("/res/ellipse.png");//$NON-NLS-1$
		EMPTY_ICON 		= loadImageIcon("/res/empty.png");	//$NON-NLS-1$
		RECT_ICON 		= loadImageIcon("/res/rectangle.png");	//$NON-NLS-1$
		RHOMBUS_ICON 	= loadImageIcon("/res/rhombus.png");//$NON-NLS-1$
		SELECT_ICON 		= loadImageIcon("/res/select.png");	//$NON-NLS-1$
		SQUARE_ICON 		= loadImageIcon("/res/square.png");	//$NON-NLS-1$
		TRIANGLE_ICON 	= loadImageIcon("/res/triangle.png");//$NON-NLS-1$
		PROPERTIES_ICON 	= loadImageIcon("/res/preferences-desktop-theme.png");	//$NON-NLS-1$
		HELP_ICON 		= loadImageIcon("/res/help-browser.png");	//$NON-NLS-1$
		ABOUT_ICON 		= loadImageIcon("/res/emblem-important.png");	//$NON-NLS-1$
		JOIN_ICON 		= loadImageIcon("/res/join.png");//$NON-NLS-1$
		SEPARATE_ICON 	= loadImageIcon("/res/separate.png");//$NON-NLS-1$
		BEZIER_CURVE_ICON = loadImageIcon("/res/bezierCurve.png");//$NON-NLS-1$
		CHORD_ICON 		= loadImageIcon("/res/chord.png"); //$NON-NLS-1$
		COMMENT_ICON 	= loadImageIcon("/res/comment.png"); //$NON-NLS-1$
		LINES_ICON = loadImageIcon("/res/joinedLines.png"); //$NON-NLS-1$
		ERR_ICON 		= loadImageIcon("/res/emblem-unreadable.png"); //$NON-NLS-1$
		STOP_ICON 		= loadImageIcon("/res/stop.png"); //$NON-NLS-1$
		INSERT_PIC_ICON 	= loadImageIcon("/res/image-x-generic.png"); //$NON-NLS-1$
		INSERT_PST_ICON = loadImageIcon("/res/text-x-generic.png"); //$NON-NLS-1$
		THICKNESS_ICON 	= loadImageIcon("/res/thickness.png"); //$NON-NLS-1$
		GRADIENT_ICON 	= loadImageIcon("/res/hatch/gradient.png"); //$NON-NLS-1$
		DISPLAY_GRID_ICON = loadImageIcon("/res/displayGrid.png"); //$NON-NLS-1$
		ROTATE_180_ICON 	= loadImageIcon("/res/rotation180.png"); //$NON-NLS-1$
		ROTATE_90_ICON 	= loadImageIcon("/res/rotation90.png"); //$NON-NLS-1$
		ROTATE_270_ICON 	= loadImageIcon("/res/rotation270.png"); //$NON-NLS-1$
		MIRROR_H_ICON 	= loadImageIcon("/res/mirrorH.png"); //$NON-NLS-1$
		MIRROR_V_ICON 	= loadImageIcon("/res/mirrorV.png"); //$NON-NLS-1$
		AXES_ICON		= loadImageIcon("/res/axes.png"); //$NON-NLS-1$
		TEX_EDITOR_ICON	= loadImageIcon("/res/texEditor.png"); //$NON-NLS-1$
		CURVES_FREEHAND_ICON	= loadImageIcon("/res/freehand/curve.png"); //$NON-NLS-1$
		LINES_FREEHAND_ICON	= loadImageIcon("/res/freehand/line.png"); //$NON-NLS-1$
		CLOSED_BEZIER_ICON	= loadImageIcon("/res/closedBezier.png"); //$NON-NLS-1$
		UPDATE_ICON			= loadImageIcon("/res/system-software-update.png"); //$NON-NLS-1$
		DRAWING_PROP_ICON		= loadImageIcon("/res/document-properties.png"); //$NON-NLS-1$
		LATEXDRAW_ICON		= loadImageIcon("/res/LaTeXDrawIcon.png"); //$NON-NLS-1$
		PDF_ICON				= loadImageIcon("/res/pdf.png"); //$NON-NLS-1$

		BUTTON_CLOSE_OUT_ICON = loadImageIcon("/res/closeOut.png"); //$NON-NLS-1$
		BUTTON_CLOSE_IN_ICON = loadImageIcon("/res/closeIn.png"); //$NON-NLS-1$

		ALIGN_BOTTOM_ICON		= loadImageIcon("/res/align/alignBottom.png"); //$NON-NLS-1$
		ALIGN_LEFT_ICON		= loadImageIcon("/res/align/alignLeft.png"); //$NON-NLS-1$
		ALIGN_MID_HORIZ_ICON= loadImageIcon("/res/align/alignMiddleHoriz.png"); //$NON-NLS-1$
		ALIGN_MID_VERT_ICON	= loadImageIcon("/res/align/alignMiddleVert.png"); //$NON-NLS-1$
		ALIGN_RIGHT_ICON		= loadImageIcon("/res/align/alignRight.png"); //$NON-NLS-1$
		ALIGN_TOP_ICON		= loadImageIcon("/res/align/alignTop.png"); //$NON-NLS-1$

		DIST_VERT_BOTTOM_ICON	= loadImageIcon("/res/distrib/distVertBottom.png"); //$NON-NLS-1$
		DIST_VERT_EQUAL_ICON	= loadImageIcon("/res/distrib/distVertEqual.png"); //$NON-NLS-1$
		DIST_VERT_MID_ICON	= loadImageIcon("/res/distrib/distVertMiddle.png"); //$NON-NLS-1$
		DIST_VERT_TOP_ICON		= loadImageIcon("/res/distrib/distVertTop.png"); //$NON-NLS-1$
		DIST_HORIZ_EQUAL_ICON	= loadImageIcon("/res/distrib/distHorizEqual.png"); //$NON-NLS-1$
		DIST_HORIZ_MID_ICON	= loadImageIcon("/res/distrib/distHorizMiddle.png"); //$NON-NLS-1$
		DIST_HORIZ_RIGHT_ICON	= loadImageIcon("/res/distrib/distHorizRight.png"); //$NON-NLS-1$
		DIST_HORIZ_LEFT_ICON	= loadImageIcon("/res/distrib/distHorizLeft.png"); //$NON-NLS-1$
	}



	/**
	 * Allows to load a image icon from a path.
	 * @param path The path.
	 * @return The image icon or null.
	 */
	public static ImageIcon loadImageIcon(final String path) {
		try {
			final URL url = Class.class.getResource(path);

			if(url==null)
				throw new MalformedURLException(path);

			return new ImageIcon(url);
		}
		catch(final Exception e) {
			e.printStackTrace();
			BadaboomCollector.INSTANCE.add(e);
			return null;
		}
	}



	public static final Insets INSET_BUTTON = new Insets(1,1,1,1);

	public static final String LABEL_CANCEL = LangTool.INSTANCE.getStringDialogFrame("AbstractParametersFrame.6"); //$NON-NLS-1$

	public static final String LABEL_OK = LangTool.INSTANCE.getStringDialogFrame("AbstractParametersFrame.4"); //$NON-NLS-1$
}
