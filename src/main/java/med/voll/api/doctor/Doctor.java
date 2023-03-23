package med.voll.api.doctor;

import jakarta.persistence.*;
import med.voll.api.address.Address;

import java.util.Objects;

@Entity(name = "Doctor")
@Table(name = "doctors")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String mail;
    private String phone;
    private String crm;
    @Enumerated(EnumType.STRING)
    private MedicField medicField;
    @Embedded
    private Address address;

    public Doctor() {}

    public Doctor(Long id, String name, String mail, String phone, String crm, MedicField medicField, Address address) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.crm = crm;
        this.medicField = medicField;
        this.address = address;
    }

    public Doctor(DataDoctorRegister data) {
        this.name = data.name();
        this.mail = data.mail();
        this.phone = data.phone();
        this.crm = data.crm();
        this.medicField = data.medicField();
        this.address = new Address(data.dataAddress());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    public String getCrm() {
        return crm;
    }

    public MedicField getMedicField() {
        return medicField;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Doctor)) return false;
        Doctor other = (Doctor) obj;
        return this.id == other.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
