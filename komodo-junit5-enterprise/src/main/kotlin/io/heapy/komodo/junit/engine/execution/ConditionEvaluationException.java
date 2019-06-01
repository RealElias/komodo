/*
 * Copyright 2015-2019 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package io.heapy.komodo.junit.engine.execution;

import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.platform.commons.JUnitException;

/**
 * Thrown if an error is encountered while evaluating an
 * {@link ExecutionCondition}.
 *
 * @since 5.0
 * @see ConditionEvaluator
 */
class ConditionEvaluationException extends JUnitException {

	private static final long serialVersionUID = 1L;

	public ConditionEvaluationException(String message, Throwable cause) {
		super(message, cause);
	}

}