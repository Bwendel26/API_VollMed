package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.doctor.DataDoctorList;
import med.voll.api.doctor.DataDoctorRegister;
import med.voll.api.doctor.Doctor;
import med.voll.api.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorRepository repository;

    @PostMapping()
    @Transactional
    public void register(@RequestBody @Valid DataDoctorRegister data) {
        repository.save(new Doctor(data));
    }

    @GetMapping()
    public Page<DataDoctorList> list(@PageableDefault(size = 10, sort = {"nome"}) Pageable page) {
        return repository.findAll(page).map(DataDoctorList::new);
    }
}
