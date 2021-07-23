package ru.johnnygomezzz.pattern.datamapper.auth;

import ru.johnnygomezzz.pattern.datamapper.entity.User;

import java.util.Optional;

public interface AuthenticationService {
    Optional<User> doAuth(String login, String password);
}
