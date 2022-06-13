package com.rah.demo.crudrepaso.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class DireccionModel {

	private Integer index;
	private Integer codigoPostal;
	private String localidad;
	private Integer calle;
	private String puerta;
}
