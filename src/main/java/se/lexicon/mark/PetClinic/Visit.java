package se.lexicon.mark.PetClinic;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Visit {

    private String visitId;
    private Pet pet;
    LocalDate localDate;
    private String description;

    public Visit(String visitId, Pet pet, LocalDate localDate, String description) {
        this.visitId = visitId;
        this.pet = pet;
        this.localDate = localDate;
        this.description = description;
    }

    public Visit(Pet pet, LocalDate localDate, String description) {
        this.pet = pet;
        this.localDate = localDate;
        this.description = description;
    }

    public String getVisitId() {
        return visitId;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Visit visit = (Visit) o;
        return Objects.equals(visitId, visit.visitId) &&
                Objects.equals(pet, visit.pet) &&
                Objects.equals(localDate, visit.localDate) &&
                Objects.equals(description, visit.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(visitId, pet, localDate, description);
    }

    @Override
    public String toString() {
        return "Visit{" +
                "visitId='" + visitId + '\'' +
                ", pet=" + pet +
                ", localDate=" + localDate +
                ", description='" + description + '\'' +
                '}';
    }
}
