package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short goles, byte dorsal) {
		super(nombre,edad,"Portero");
		this.golesRecibidos=goles;
		this.dorsal=dorsal;
	}

	public int compareTo(Object p) {
		return ((Portero)p).golesRecibidos-this.golesRecibidos;
	}

	public boolean jugarConLasManos() {
		return true;
	}
	public String toString() {
		return "El futbolista "+getNombre()+" tiene "+getEdad()+", y juega de "+getPosicion()+" con el dorsal "+dorsal+". Le han marcado "+golesRecibidos;
	}

}
