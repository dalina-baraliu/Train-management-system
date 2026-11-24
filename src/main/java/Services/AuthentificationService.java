package Services;

import Repository.PerdoruesitRepository;
import models.Perdoruesit;

public class AuthentificationService {
    public Perdoruesit authenticate(String username, String password) {
        return new PerdoruesitRepository().findByUsernameAndPassword(username, password);
    }
}
