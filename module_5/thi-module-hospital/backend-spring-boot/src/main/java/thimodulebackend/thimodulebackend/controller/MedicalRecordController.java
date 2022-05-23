package thimodulebackend.thimodulebackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import thimodulebackend.thimodulebackend.model.MedicalRecord;
import thimodulebackend.thimodulebackend.service.Impl.MedicalRecordServiceImpl;
import thimodulebackend.thimodulebackend.service.MedicalRecordService;

import java.util.List;
import java.util.Optional;

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
    @PostMapping
    public ResponseEntity<MedicalRecord> saveMedicalRecord(@RequestBody MedicalRecord medicalRecord) {
       return new ResponseEntity<>(medicalRecordService.saveHospital(medicalRecord), HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<MedicalRecord> findById(@PathVariable Long id) {
        MedicalRecord medicalRecord = medicalRecordService.findMedicalRecordById(id);
        if (medicalRecord == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(medicalRecord, HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<MedicalRecord> updateMedicalRecord(@PathVariable Long id, @RequestBody MedicalRecord medicalRecord){
        MedicalRecord medicalRecord1 = medicalRecordService.findMedicalRecordById(id);
        if (medicalRecord1 == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        medicalRecord.setId(medicalRecord1.getId());
        return new ResponseEntity<>(medicalRecordService.saveHospital(medicalRecord), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<MedicalRecord> deleteById(@PathVariable Long id) {
        MedicalRecord medicalRecord = medicalRecordService.findMedicalRecordById(id);
        if (medicalRecord == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        medicalRecordService.deleteMedicalRecord(id);
        return new ResponseEntity<>(medicalRecord, HttpStatus.NO_CONTENT);
    }
}
