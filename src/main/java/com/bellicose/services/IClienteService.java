package com.bellicose.services;

import java.util.List;

import com.bellicose.entity.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();
	public void save(Cliente cliente);
	public Cliente findOne(Long id);
	public void elimina(Long id);
}
