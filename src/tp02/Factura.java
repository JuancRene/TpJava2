package tp02;
import java.util.*;

public class Factura<T extends Modificador> {

	private double montoTotal = 0.0;
	
	private List<T> listaModificadores;

	private List<ItemProducto> listaProducto;
	
	public Factura() {
		listaModificadores = new ArrayList<T>();
		listaProducto = new ArrayList<>();
	}
	
	public double getMontoTotal() {
		return montoTotal;
	}
	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}
	
	public List<T> getListaModificadores() {
		return listaModificadores;
	}
	
	public List<ItemProducto> getListProducto(){
		return listaProducto;
	}
	
		
}
