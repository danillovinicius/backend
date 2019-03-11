package co.villalabs.backend.person.domain.person;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tb_person", schema="public")
public abstract class Person {

}