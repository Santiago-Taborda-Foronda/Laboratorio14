package laboratorio;

public class Principal {
	    public String atributo1;
	    private String atributo2;
	    protected String atributo3;
	    // permite controlar el nivel visibilidad de los datos publico, privado, protegido
	    // get para obtener las variables 

	    public String getAtributo2() {
	        return atributo2;
	    }

	    // SET acceder al atributo y enviarle un dato, 
	    public void setAtributo(String atributo2) {
	        this.atributo2=atributo2;
	        }

	    // si es privado solo se puede para la clase en la que se encuentra

	public class Juguetes {
	    private String nombre;

	    private String tamafio;

	    public String getNombre() { return nombre;

	    }

	    public void setNombre(String nombre) { this.nombre = nombre;

	    }

	    public String getTamafio() { return tamafio;

	    }

	    public void setTamafio(String tamafio) { this.tamafio = tamafio;

	    } 
	
	}
}