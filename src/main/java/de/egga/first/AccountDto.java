package de.egga.first;

import java.util.UUID;

/**
 * @author egga
 */
public class AccountDto {

    private UUID id;

    private String status;


    public AccountDto() {
    }

    public AccountDto(final UUID id, final String status) {
        this.id = id;
        this.status = status;
    }


    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }
}
