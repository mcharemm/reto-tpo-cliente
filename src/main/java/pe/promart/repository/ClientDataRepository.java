package pe.promart.repository;

import com.github.fabiomaffioletti.firebase.repository.DefaultFirebaseRealtimeDatabaseRepository;
import org.springframework.stereotype.Repository;
import pe.promart.model.Client;

@Repository
public class ClientDataRepository extends DefaultFirebaseRealtimeDatabaseRepository<Client, String> {
}