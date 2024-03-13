package georgiaLibrary.georgia.exception;

import org.springframework.validation.BindingResult;

@SuppressWarnings("serial")
public class OurRunTimeException extends RuntimeException {

	private BindingResult br;

	public OurRunTimeException(String m, BindingResult br) {
		super(m);
		this.br = br;
	}

	public BindingResult getBr() {
		return br;
	}

}