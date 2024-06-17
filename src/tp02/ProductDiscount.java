package tp02;

public class ProductDiscount extends Modificador {
	
	private ItemProducto refProducto;
	

	public ProductDiscount(String nombreDescuento, float porcentaje, ItemProducto producto) {
		super(nombreDescuento, porcentaje);
		this.refProducto = producto;
		
	}

	public ItemProducto getRefProducto() {
		return refProducto;
	}
	

	@Override
	public double applayProductDiscount() {
		return this.refProducto.getPrecio() * this.getPorcentaje() * this.refProducto.getCantidad();
	}

	@Override
	public double applayBillDiscouunt() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
