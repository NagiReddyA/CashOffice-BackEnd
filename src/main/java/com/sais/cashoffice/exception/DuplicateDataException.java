package com.sais.cashoffice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class DuplicateDataException extends Exception{

	public DuplicateDataException(String message) {
		super(message);
	}
}
