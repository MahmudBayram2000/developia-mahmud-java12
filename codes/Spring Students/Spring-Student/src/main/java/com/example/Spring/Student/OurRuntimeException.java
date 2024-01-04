package com.example.Spring.Student;

import org.springframework.validation.BindingResult;

public class OurRuntimeException extends RuntimeException {

	private BindingResult br;

	public OurRuntimeException(String m, BindingResult br) {
		super(m);
		this.br = br;
	}

	public BindingResult getBr() {
		return br;
	}
}
