package com.zendesk.maxwell.schema.ddl;

public class MaxwellSQLSyntaxError extends RuntimeException {
	private static final long serialVersionUID = 140545518818187219L;

	public MaxwellSQLSyntaxError(String message) {
		super(message);
	}
}
