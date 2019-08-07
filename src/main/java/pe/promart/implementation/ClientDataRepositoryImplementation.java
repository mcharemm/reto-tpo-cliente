package pe.promart.implementation;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import org.springframework.stereotype.Service;
import pe.promart.configuration.FirebaseConfiguration;
import pe.promart.model.Client;
import pe.promart.repository.ClientDataRepository;

import java.util.List;
import java.util.concurrent.CountDownLatch;

@Service
public class ClientDataRepositoryImplementation implements ClientDataRepository {

    @Override
    public Client pushClient(Client client) {
        FirebaseConfiguration configuration = new FirebaseConfiguration("reto-intercorp-199e9");
        if (client != null) {
            DatabaseReference databaseReference = configuration.getFirebaseDatabase().getReference("/");

            DatabaseReference childReference = databaseReference.child("clients");

                /**
                 * The Firebase Java client uses daemon threads, meaning it will not prevent a process from exiting.
                 * So we'll wait(countDownLatch.await()) until firebase saves record. Then decrement `countDownLatch` value
                 * using `countDownLatch.countDown()` and application will continues its execution.
                 */
                CountDownLatch countDownLatch = new CountDownLatch(1);

                /**
                 * push()
                 * Add to a list of data in the database. Every time you push a new node onto a list,
                 * your database generates a unique key, like items/unique-item-id/data
                 */
                childReference.push().setValue(client, new DatabaseReference.CompletionListener() {

                    @Override
                    public void onComplete(DatabaseError de, DatabaseReference dr) {
                        System.out.println("Record saved!");
                        // decrement countDownLatch value and application will be continues its execution.
                        countDownLatch.countDown();
                    }
                });
                try {
                    //wait for firebase to saves record.
                    countDownLatch.await();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        return client;
    }

    @Override
    public List<Client> getClients() {
        return null;
    }
}
