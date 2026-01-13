package com.oops.inventorysystem;

class EmailAlertService implements AlertService {

	@Override
	public void sendLowStockAlert(Product product) {
		
		System.out.println("Alert: Product "+product.getProductName()+" has low Stock");
		
	}

	
}
