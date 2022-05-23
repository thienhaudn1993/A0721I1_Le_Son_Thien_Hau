package thimodulebackend.thimodulebackend.service;

import thimodulebackend.thimodulebackend.model.MedicalRecord;

import java.util.List;

public interface MedicalRecordService {
    List<MedicalRecord> getAll();
    MedicalRecord findMedicalRecordById(Long id);
    MedicalRecord saveHospital(MedicalRecord medicalRecord);
    void deleteMedicalRecord(Long id);
}
