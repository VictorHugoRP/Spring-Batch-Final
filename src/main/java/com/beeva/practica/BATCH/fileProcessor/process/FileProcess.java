package com.beeva.practica.BATCH.fileProcessor.process;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.beeva.practica.BATCH.job.fileProcessor.model.Cliente;
import com.beeva.practica.BATCH.job.fileProcessor.model.User;

@Component

public  class FileProcess implements ItemProcessor <User,Cliente>{



	public Cliente process(User usr) throws Exception {

		Cliente cli = new Cliente();

		cli.setNombre(usr.getNombre());

		cli.setApellido_paterno(usr.getApellido_paterno());
		
		cli.setApellido_materno(usr.getApellido_materno());

		return cli;

	}



}
