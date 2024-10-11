package laboratorio;

public class ClienteDatos {

	public static void main(String[] args) {
		 Cliente cliente = new Cliente();

	        cliente.setipellido ("Perez"); 
	        cliente.setEdad (21);
	        cliente.setNombre ("Juan");
	        cliente.setNumeroDeCliente (23);


	        Documento miDocumento = new Documento();
	        miDocumento.setNumero (21335212);
	        miDocumento.setTipo ("DNI");
	        cliente.setDocumento (miDocumento);

	        System.out.println(cliente.getipellido());


	}

}
