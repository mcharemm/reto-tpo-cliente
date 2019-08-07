package pe.promart.configuration;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.FirebaseDatabase;
import pe.promart.util.ConfigurationUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FirebaseConfiguration {

    private static final String CREDENTIALS_PATH = "/Users/everis/IdeaProjects/retotpoclientes/src/main/resources/reto-intercorp-199e9-firebase-adminsdk-q9b5v-4480f1780c.json";
    private FirebaseDatabase firebaseDatabase;
    private String dbname;

    public FirebaseConfiguration(String dbname) {
        this.firebaseDatabase = initFirebase(dbname);
    }

    public FirebaseDatabase getFirebaseDatabase() {
        return firebaseDatabase;
    }

    public void setFirebaseDatabase(FirebaseDatabase firebaseDatabase) {
        this.firebaseDatabase = firebaseDatabase;
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    private FirebaseDatabase initFirebase(String dbname) {
        try {
            FileInputStream serviceAccount = new FileInputStream(CREDENTIALS_PATH);

            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl(ConfigurationUtil.buildUrl(dbname))
                    .build();

            if (FirebaseApp.getApps().isEmpty()){
                FirebaseApp.initializeApp(options);
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return FirebaseDatabase.getInstance();
    }
}
