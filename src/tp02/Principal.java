package tp02;

public class Principal {

	public static void main(String[] args) {

		Caso1();
		Caso2();
		Caso3();
		
	}
	
	public static void Caso1() { 
		  Factura<Modificador> factura = new Factura<>(); 
		 
		     ItemProducto producto1 = new ItemProducto("Bicicleta", 780000, 0.21f, 1);  
		     ItemProducto producto2 = new ItemProducto("Vaporera", 94000, 0.105F, 3); 
		      
		     ProductDiscount descuento1 = new ProductDiscount("ParanaPedalea", 0.05f, producto1); 
		     ProductDiscount descuento2 = new ProductDiscount("JaponComeArroz", 0.03F, producto2); 
		     BillDiscount descuento3 = new BillDiscount("HOTSALE", 0, 10000f, factura); 
		      
		     factura.getListProducto().add(producto1); 
		     factura.getListProducto().add(producto2); 
		     factura.getListaModificadores().add(descuento1);  
		     factura.getListaModificadores().add(descuento2); 
		     factura.getListaModificadores().add(descuento3); 
		     System.out.println(factura.getMontoTotal());
		     double total = new Calculador<Modificador>().CalcularMontoTotal(factura); 
		     System.out.println("Total  1 : $" + String.format("%.2f", total)); 
		 } 
		  
		 public static void Caso2() { 
		  Factura<Modificador> factura = new Factura<>(); 
		   
		     ItemProducto producto1 = new ItemProducto("Lavarropa", 510000F, 0.105F, 1);  
		     ItemProducto producto2 = new ItemProducto("Tostadora", 40000F, 0.21F, 2); 
		     ItemProducto producto3 = new ItemProducto("Heladera", 890000F, 0.105F, 3);  
		     ItemProducto producto4 = new ItemProducto("Ventilador", 158000F, 0.21F, 4); 
		     ProductDiscount descuento1 = new ProductDiscount("ParanaLava", 0.15f, producto1); 
		     ProductDiscount descuento2 = new ProductDiscount("ParanaTosta", 0.35F, producto2); 
		     ProductDiscount descuento3 = new ProductDiscount("ArgetinaConserva", 0.25F, producto3); 
		     ProductDiscount descuento4 = new ProductDiscount("SaltaNoTieneCalor", 0.1F, producto4); 
		     BillDiscount descuento5 = new BillDiscount("PROGRESAR", 0.05F, 15000f, factura); 
		      
		     factura.getListProducto().add(producto1); 
		     factura.getListProducto().add(producto2); 
		     factura.getListProducto().add(producto3); 
		     factura.getListProducto().add(producto4); 
		     factura.getListaModificadores().add(descuento1);  
		     factura.getListaModificadores().add(descuento2); 
		     factura.getListaModificadores().add(descuento3); 
		     factura.getListaModificadores().add(descuento4); 
		     factura.getListaModificadores().add(descuento5); 
		      
		      
		     double total = new Calculador<Modificador>().CalcularMontoTotal(factura); 
		      
		     System.out.println("Total 2 : $" + String.format("%.2f", total)); 
		      
		 } 
		  
		 public static void Caso3() { 
		  Factura<Modificador> factura = new Factura<>(); 
		   
		     ItemProducto producto1 = new ItemProducto("Notebook", 1400000F, 0.21F, 1);  
		     ItemProducto producto2 = new ItemProducto("Sony Music Center", 2600000F, 0.21F, 1); 
		      
		     ProductDiscount descuento1 = new ProductDiscount("ArgentinaPrograma", 0, producto1); 
		     ProductDiscount descuento2 = new ProductDiscount("HOTSALE", 0.18F, producto2); 
		     
		      
		     factura.getListProducto().add(producto1); 
		     factura.getListProducto().add(producto2); 
		     factura.getListaModificadores().add(descuento1);  
		     factura.getListaModificadores().add(descuento2); 
		      
		      
		     double total = new Calculador<Modificador>().CalcularMontoTotal(factura); 
		      
		     System.out.println("Total 3 : $" + String.format("%.2f", total)); 
		      
		 }
}
