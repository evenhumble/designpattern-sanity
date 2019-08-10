package io.hedwig.dp.advanced.jdkproxy;

/**
 * @@author: patrick
 */
public class UserService implements IUserService{

    public String findByName(String name){
        return "findByName";
    }
}
