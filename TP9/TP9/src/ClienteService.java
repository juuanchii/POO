public class ClienteService {
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void registrarCliente(Cliente cliente) throws ClienteException {
        if (cliente.getNombre().length() < 2) {
            throw new ClienteException("El nombre debe tener al menos 2 caracteres.");
        }
        if (!validarCuit(cliente.getCuit())) {
            throw new ClienteException("El CUIT es inválido.");
        }
        if (!cliente.getEmail().matches("[^@]+@[^.]+\\..+")) {
            throw new ClienteException("El email es inválido.");
        }
        if (!cliente.getNumCelular().matches("[0-9()-]+")) {
            throw new ClienteException("El número de celular es inválido.");
        }
        clienteRepository.guardar(cliente);
    }

    private boolean validarCuit(String cuit) {
        // Implementar algoritmo de validación de CUIT aquí
        return true;
    }

    public Cliente buscarClientePorCuit(String cuit) {
        return clienteRepository.buscarPorCuit(cuit);
    }
}
