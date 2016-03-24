package vijay.poc.spring.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@RequestMapping("/test")
	public String testMethod(){
		throw new RuntimeException("Not an valid input request");
		//return "Hello, World";
	}
	
	
	@ExceptionHandler({RuntimeException.class})
	public ResponseEntity<String> handleException(Exception ex) throws JsonProcessingException{
		System.out.println(ex.getMessage());
		ValidationErrors error = new ValidationErrors();
		error.setErrorMessage(ex.getMessage());
		ObjectMapper mapper = new ObjectMapper();		
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body(mapper.writeValueAsString(error));
	}

}
