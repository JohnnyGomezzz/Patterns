package ru.johnnygomezzz.pattern.datamapper.database;

import java.util.ArrayList;
import java.util.List;

public interface DataBaseCommands<T> {
    int initializeDataBase(ArrayList<T> users);
    List<T> findAll();
    T findUser(String nickname);
    int changeNickname(String oldNickName, String newNickName, String password);
}
