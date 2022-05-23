package thimodulebackend.thimodulebackend.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thimodulebackend.thimodulebackend.model.MedicalRecord;
import thimodulebackend.thimodulebackend.repository.MedicalRecordRepository;
import thimodulebackend.thimodulebackend.service.MedicalRecordService;

import java.util.List;
@Service
public class MedicalRecordServiceImpl implements MedicalRecordService {
    @Autowired
    private MedicalRecordRepository medicalRecordRepository;
    @Override
    public List<MedicalRecord> getAll() {
        return medicalRecordRepository.findAll();
    }

    @Override
    public MedicalRecord findMedicalRecordById(Long id) {
        return medicalRecordRepository.findById(id).orElse(null);
    }

    @Override
    public void saveHospital(MedicalRecord medicalRecord) {
        medicalRecordRepository.save(medicalRecord);
    }

    @Override
    public void deleteMedicalRecord(Long id) {
        medicalRecordRepository.deleteById(id);
    }
}
