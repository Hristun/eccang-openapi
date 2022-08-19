package com.thirty.exception;

@SuppressWarnings("serial")
public class JsonParseException extends ServerErrorException {
	public JsonParseException() {
		super("JSON_PARSE_ERROR", "JSON解析出错");
	}

	public JsonParseException(String message) {
		super("JSON_PARSE_ERROR", message);
	}
}