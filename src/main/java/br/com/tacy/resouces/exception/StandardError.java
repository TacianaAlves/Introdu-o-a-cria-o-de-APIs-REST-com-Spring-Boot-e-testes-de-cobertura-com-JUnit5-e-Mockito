package br.com.tacy.resouces.exception;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StandardError {

	private LocalDateTime timestamp;
	private Integer Status;
	private String  error;
	private String path;
	
	
}
