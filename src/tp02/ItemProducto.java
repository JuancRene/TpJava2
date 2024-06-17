package tp02;

public class ItemProducto {

	private String nombre;
	

	private float precio;
	private float impuesto;
	private int cantidad;
	
	public ItemProducto(String nombre,float precio,float impuesto,int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.impuesto = impuesto;
		this.cantidad = cantidad;
	}
	
	public float CalcularTotal() {
		float montoTotal = precio * cantidad;
		float montoconImpuesto = (montoTotal * impuesto);
		float montoFinal = montoTotal + montoconImpuesto;	   
		return montoFinal;
	}
	
	public String getNombre() {
		return nombre;
	}


	public float getPrecio() {
		return precio;
	}

	public float getImpuesto() {
		return impuesto;
	}

	public int getCantidad() {
		return cantidad;
	}
	
	public float calcularTotal() {
		float total = (precio + (precio * impuesto)) * cantidad;
		return total;
	}
	
	@Override
	public String toString() {
		return "ItemProducto [nombre=" + nombre + ", precio=" + precio + ", impuesto=" + impuesto + ", cantidad="
				+ cantidad + "]";
	}
	
	
}
