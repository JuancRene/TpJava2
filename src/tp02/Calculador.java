package tp02;

public class Calculador<M extends Modificador> {

	public double CalcularMontoTotal(Factura<M> factura) {
		factura = calcularTotalFactura(factura);
		factura = calcularDescuentoTotalPorProducto(factura);
		factura = calcularDescuentoTotalPorFactura(factura);
		return factura.getMontoTotal();
	}
	
	public Factura<M> calcularTotalFactura(Factura<M> factura){
		float total = 0.0f;
		for(ItemProducto producto : factura.getListProducto()) {
			total += producto.CalcularTotal();
		}
		factura.setMontoTotal(total);
		return factura;
	}
	
	public Factura<M> calcularDescuentoTotalPorProducto (Factura<M> factura){
		float totalDesc = 0.0f;
		for(M modificador: factura.getListaModificadores()) {
			totalDesc += modificador.applayProductDiscount();
		}
		factura.setMontoTotal(factura.getMontoTotal()-totalDesc);
		return factura;
	}
	
	public Factura<M> calcularDescuentoTotalPorFactura(Factura<M> factura){
		float totalDesc = 0.0f;
		for(M modificador: factura.getListaModificadores()) {
			totalDesc += modificador.applayBillDiscouunt();
		}
		factura.setMontoTotal(factura.getMontoTotal()-totalDesc);
		return factura;
	}
	
}
