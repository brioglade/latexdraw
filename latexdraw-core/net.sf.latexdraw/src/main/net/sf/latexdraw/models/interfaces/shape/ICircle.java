/*
 * This file is part of LaTeXDraw
 * Copyright (c) 2005-2017 Arnaud BLOUIN
 * LaTeXDraw is free software; you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 * LaTeXDraw is distributed without any warranty; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 */
package net.sf.latexdraw.models.interfaces.shape;

import org.eclipse.jdt.annotation.NonNull;

/**
 * The API for circles.
 * @author Arnaud BLOUIN
 */
public interface ICircle extends ISquaredShape {
	/**
	 * @return The centre of the circle.
	 */
	@NonNull IPoint getCenter();

	/**
	 * @return The radius of the circle.
	 */
	double getRadius();
}