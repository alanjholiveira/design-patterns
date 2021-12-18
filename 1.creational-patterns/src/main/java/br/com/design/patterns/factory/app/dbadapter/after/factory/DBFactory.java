package br.com.design.patterns.factory.app.dbadapter.after.factory;

import br.com.design.patterns.factory.app.dbadapter.after.db.DB;

public interface DBFactory {
	DB getDatabase();
}
