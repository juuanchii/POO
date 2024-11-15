
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClienteRepository {
    private Map<String, Cliente> clientes = new HashMap<>();

    public void guardar(Cliente cliente) {
        clientes.put(cliente.getCuit(), cliente);
    }

    public Cliente buscarPorCuit(String cuit) {
        return clientes.get(cuit);
    }

    public List<Cliente> obtenerTodos() {
        return new ArrayList<>(clientes.values());
    }
}
