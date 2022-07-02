package com.rah.demo.crudrepaso.model;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ModelTest {

	private UserModel userModel;
	private DireccionModel direccionModel;

	@BeforeEach
	public void init() {
		this.userModel = new UserModel();
	}

	@Test
	public void userModelTest() {
		Integer index = 1;
		Integer documento = 123;
		String nombre = "Esme";
		String apellido = "Diaz";
		Integer edad = 20;
		List<DireccionModel> direcciones = new ArrayList<>();
		direcciones.add(direccionModel);

		this.userModel.setIndex(index);
		this.userModel.setDocumento(documento);
		this.userModel.setNombre(nombre);
		this.userModel.setApellido(apellido);
		this.userModel.setEdad(edad);
		this.userModel.setDirecciones(direcciones);
	}
}
