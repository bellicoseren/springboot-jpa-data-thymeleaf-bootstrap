package com.bellicose.dao;

import java.util.List;

import com.bellicose.entity.Cliente;

public interface IClienteDao {

	public List<Cliente> findAll();
	public void save(Cliente cliente);
	public Cliente findOne(Long id);
	public void elimina(Long id);
}