package thimodulebackend.thimodulebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thimodulebackend.thimodulebackend.model.MedicalRecord;

@Repository
public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Long> {
}
