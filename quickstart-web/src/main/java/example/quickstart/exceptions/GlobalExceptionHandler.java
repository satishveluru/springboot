package example.quickstart.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(CustomException.class)
	public ModelAndView handleCustomException(CustomException ex) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("errorcode", ex.getErrorCode());
		mv.addObject("errormsg" , ex.getErrorMsg());
		return mv;
		
	}
	
}
