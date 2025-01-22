package org.example.database.repository;

import org.example.database.pool.ConnectionPool;

public class CompanyRepository {

    private final ConnectionPool connectionPull;

    public CompanyRepository(ConnectionPool connectionPull) {

        this.connectionPull = connectionPull;
    }
}

