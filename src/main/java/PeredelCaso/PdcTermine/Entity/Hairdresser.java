package PeredelCaso.PdcTermine.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Hairdresser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @OneToMany(mappedBy = "hairdresser")
    private List<Appointment> appointments;

    public Hairdresser(){

    }

    public Hairdresser(String name, List<Appointment> appointments) {
        this.name = name;
        this.appointments = appointments;
    }

    // Getter und Setter

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

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
}
