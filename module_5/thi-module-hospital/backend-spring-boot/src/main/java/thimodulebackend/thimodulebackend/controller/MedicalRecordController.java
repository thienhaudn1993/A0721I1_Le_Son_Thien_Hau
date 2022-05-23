package thimodulebackend.thimodulebackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import thimodulebackend.thimodulebackend.model.MedicalRecord;
import thimodulebackend.thimodulebackend.service.Impl.MedicalRecordServiceImpl;
import thimodulebackend.thimodulebackend.service.MedicalRecordService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/api/medical-record")
public class MedicalRecordController {
    @Autowired
    private MedicalRecordService medicalRecordService;
    @GetMapping("")
    public ResponseEntity<List<MedicalRecord>> findAll() {
        List<MedicalRecord> medicalRecords = medicalRecordService.getAll();
        if (medicalRecords.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(medicalRecords,HttpStatus.OK);
    }
}
