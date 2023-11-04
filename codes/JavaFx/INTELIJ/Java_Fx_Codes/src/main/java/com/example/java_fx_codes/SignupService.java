package com.example.java_fx_codes;

import java.sql.SQLException;

public class SignupService {

    public boolean checkUsername(String username) throws SQLException {

        SignupRepository repository = new SignupRepository();

        return repository.checkUsername(username);
    }

    public void save(Teacher t) throws SQLException {

        SignupRepository repository = new SignupRepository();
        repository.save(t);

    }

}