package se.lexicon.mark.PetClinic;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class PetType {
    int id;
    String name;

    public PetType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public PetType(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PetType petType = (PetType) o;
        return id == petType.id &&
                Objects.equals(name, petType.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "PetType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
