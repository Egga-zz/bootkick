package de.egga.first;

/**
 * @author egga
 */
public class Dto {

    private UserDto user;

    private AccountDto account;


    public Dto() {
    }

    public Dto(final UserDto user, final AccountDto account) {
        this.user = user;
        this.account = account;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(final UserDto user) {
        this.user = user;
    }

    public AccountDto getAccount() {
        return account;
    }

    public void setAccount(final AccountDto account) {
        this.account = account;
    }
}
