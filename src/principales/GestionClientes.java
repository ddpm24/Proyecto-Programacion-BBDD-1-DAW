package principales;

import java.util.Scanner;

import modelo.dao.ClienteDao;
import modelo.dao.ClienteDaoImplMy8Jpa;
import modelo.entidades.Cliente;

public class GestionClientes {
	private static Scanner leer;
	public static void main(String[] args) {
        GestionClientes gestionClientes = new GestionClientes();
        gestionClientes.menu();
    }

    public void menu() {
    	Scanner leer = new Scanner(System.in);
    		int opcion;
    	    do {
    	        System.out.println("Men� de Gesti�n de Clientes:");
    	        System.out.println("1. Alta del Cliente");
    	        System.out.println("2. Buscar un Cliente");
    	        System.out.println("3. Mostrar Todos");
    	        System.out.println("4. Eliminar un Cliente");
    	        System.out.println("5. Salir");
    	        System.out.print("Seleccione una opci�n: ");
    	        opcion = leer.nextInt();
    	        
    	        switch (opcion) {
    	            case 1:
    	            	alta();
    	                break;
    	            case 2:
    	                
    	                break;
    	            case 3:
    	                
    	                break;
    	            case 4:
    	                
    	                break;
    	            case 5:
    	                System.out.println("Saliendo...");
    	                break;
    	            default:
    	                System.out.println("Opci�n inv�lida. Por favor, seleccione una opci�n del 1 al 5.");
    	                break;
    	        }
    	    } while (opcion != 5);
    }
    
    private static ClienteDao cdao;
    
    static {
    	cdao = new ClienteDaoImplMy8Jpa();
    }
    
    public static void alta() {
    	
    	Cliente cliente = new Cliente();
    	System.out.println("A�ade el cif : ");
    	cliente.setCif(leer.next());
    	System.out.println("A�ade el nombre : ");
    	cliente.setNombre(leer.next());
    	System.out.println("A�ade el apellido : ");
    	cliente.setApellidos(leer.next());
    	System.out.println("A�ade el domicilio : ");
    	cliente.setDomicilio(leer.next());
    	System.out.println("A�ade el : ");
    	cliente.setFacturacionAnual(leer.nextBigDecimal());
    	System.out.println("A�ade el numero de empleados a cargo : ");
    	cliente.setNumeroEmpleados(leer.nextInt());
    	System.out.println(cdao.alta(cliente));
    }
    public static void buscarUno() {
    	Cliente cliente = new Cliente();
    	System.out.println(cdao.alta(cliente));
    }
    public static void buscarTodos() {
    	Cliente cliente = new Cliente();
    	System.out.println(cdao.alta(cliente));
    }
    public static void {
    	Cliente cliente = new Cliente();
    	System.out.println(cdao.alta(cliente));
    }
    
}