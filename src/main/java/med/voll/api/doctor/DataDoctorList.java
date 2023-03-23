package med.voll.api.doctor;

public record DataDoctorList(String name, String crm, String phone, MedicField medicField) {

    public DataDoctorList(Doctor doctor) {
        this(doctor.getName(), doctor.getCrm(), doctor.getPhone(), doctor.getMedicField());
    }
}
