package ru.johnnygomezzz.pattern.datamapper.auth;

import ru.johnnygomezzz.pattern.datamapper.database.DBService;
import ru.johnnygomezzz.pattern.datamapper.entity.User;

import java.util.Optional;

public class BasicAuthenticationService implements AuthenticationService {

    @Override
    public Optional<User> doAuth(String email, String password) {
        DBService dbService = new DBService();

        User newUser = dbService.findUser(email);

        if (newUser.getPassword().equals(password)) {
            return Optional.of(newUser);
        }
        return Optional.empty();
    }
}
