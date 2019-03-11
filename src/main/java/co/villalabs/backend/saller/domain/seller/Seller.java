package co.villalabs.backend.saller.domain.seller;

import javax.persistence.Entity;

import co.villalabs.backend.person.domain.person.Person;

@Entity
public class Seller extends Person {

    public enum Status {
        ACTIVE, DISABLE
    }
    private Long id;
    private String name;
    private Status status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}