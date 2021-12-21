package br.com.design.patterns.bridge.backend.dao;

import br.com.design.patterns.bridge.backend.model.User;

public interface UserDao {
	void save(User user);
}
