package Concrete;

import Abstract.OfferService;
import Entities.Offer;

public class OfferManager implements OfferService {

	@Override
	public void add(Offer offer) {
		System.out.println("Offer added");
		
	}

	@Override
	public void update(Offer offer) {
		System.out.println("Offer updated");
		
	}

	@Override
	public void delete(Offer offer) {
		System.out.println("Offer deleted");
		
	}
	
	
	
}
