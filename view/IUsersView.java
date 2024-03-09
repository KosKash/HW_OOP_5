package view;

import java.util.List;

import modell.User;

public interface IUsersView <T extends User>{
    public void printOnConsole(T user);

    public void printOnConsoleArr(List<T> users);

}
