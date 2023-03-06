package com.org.future.Exeception;

import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

import javax.persistence.NonUniqueResultException;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerAdvise extends ResponseEntityExceptionHandler  {
	
	/*
	 * @ExceptionHandler(EmptyInputException.class) public ResponseEntity<String>
	 * handllerEmptyInput(EmptyInputException emptyInputException){ return new
	 * ResponseEntity<>("Input filed is Empty please look",HttpStatus.BAD_REQUEST);
	 * }
	 * 
	 * @ExceptionHandler(PleaseEnterCorrectNameException.class) public
	 * ResponseEntity<String>
	 * handllerPleaseEnterCorrectNameException(PleaseEnterCorrectNameException
	 * pleaseEnterCorrectNameException){ return new
	 * ResponseEntity<>("PleseEnter correct name then only get data dataS"
	 * ,HttpStatus.BAD_REQUEST); }
	 */
	@ExceptionHandler(EmptyInputException.class)
	public ResponseEntity<String> handleEmptyInputException(EmptyInputException emptyInputException){
		return new ResponseEntity<String>("given filed is empty plese look once",HttpStatus.BAD_REQUEST);
		
	}
	@ExceptionHandler(PleaseEnterCorrectNameException.class)
	public ResponseEntity<String> handllerPleaseEnterCorrectNameException(PleaseEnterCorrectNameException pleaseEnterCorrectNameException){
		return new ResponseEntity<>("PleseEnter correct name then only get data data",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handllerNoSuchElementException(NoSuchElementException noSuchElementException){
		return new ResponseEntity<>("Input id is not avilable in db please change id",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(EmptyResultDataAccessException.class)
	public ResponseEntity<String> handllerEmptyResultDataAccessException(EmptyResultDataAccessException emptyResultDataAccessException){
		return new ResponseEntity<>("given id does not contain any records",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(FileNotFoundException.class)
	public ResponseEntity<String> handllerFileNotFoundException(FileNotFoundException fileNotFoundException){
		return new ResponseEntity<>("coreseponding file is not available please give the proper path",HttpStatus.NOT_FOUND);
	}
	/*
	 * @ExceptionHandler(NonUniqueResultException.class) public
	 * ResponseEntity<String>
	 * handllerNonUniqueResultException(NonUniqueResultException
	 * nonUniqueResultException){ return new ResponseEntity<>
	 * ("MULTIPLE RECORDS ARE AVAILABLE IS GIVEN NAME PLEASE REMOVE DUBLICATES AND GET THE DATA"
	 * ,HttpStatus.NOT_FOUND); }
	 */
}
