
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CompraRepository {
    private List<Compra> compras = new ArrayList<>();

    public void guardar(Compra compra) {
        compras.add(compra);
    }

    public List<Compra> buscarPorCliente(Cliente cliente) {
        return compras.stream()
                .filter(c -> c.getCliente().equals(cliente))
                .collect(Collectors.toList());
    }

    public List<Compra> obtenerTodas() {
        return new ArrayList<>(compras);
    }
}
