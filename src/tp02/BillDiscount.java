package tp02;

public class BillDiscount extends Modificador {
	
	protected float montoFijo;
	private Factura<Modificador> factura;

	public  BillDiscount (String nombre,float montofijo,float porcentaje,Factura<Modificador> factura) {
		super(nombre,porcentaje);
		this.montoFijo = montofijo;
		this.factura = factura;
		
	}
	
	
	@Override
	public double applayProductDiscount() {
		return 0;
	}

	@Override
	public double applayBillDiscouunt() {
		return (this.montoFijo + this.factura.getMontoTotal() * this.porcentaje);
	}
	
	
	
	
}
