/*******************************************************************************
 * Copyright (c) 2017 Kiel University and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.elk.alg.disco.debug.views;

/**
 * States for the various actions in the debug UI.
 */
public enum State {
    /**
     * {@code LOWER} represents the lowest hierarchy level of the graph to be drawn,
     * {@code UPPER} means the same for the highest hierarchy level, {@code depth}
     * represents the maximum hierarchy level of the graph.
     */
    LOWER, UPPER, DEPTH
}
