package one.digitalinnovation.gof.desafiocodigo;
import java.util.ArrayList;
import java.util.List;

public class UserManager {

    private static UserManager instance = null;
    private List<User> users;

    private UserManager() {
        // Construtor privado para evitar instanciações externas
        users = new ArrayList<>();
    }

    // Método estático para obter a única instância da classe UserManager
    public static UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }

    public List<User> getUsers() {
        return users;
    }

    public void listUsers() {
        users.forEach(x -> System.out.println((x.getId() + 1) + " - " + x.getName()));
    }

    public void addUser(String name) {
        int cont = users.size();
        User user = new User(cont++, name);
        users.add(user);
    }
}
