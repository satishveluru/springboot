package com.example.construct;

import java.util.Date;

import org.apache.tomcat.jni.Address;
import org.junit.Test;

import example.quickstart.service.impl.best.EncounterService;
import example.quickstart.service.impl.best.dto.AddressType;
import example.quickstart.service.impl.best.dto.CheckInRequest;
import example.quickstart.service.impl.best.dto.Guarantor;
import example.quickstart.service.impl.best.dto.GuarantorType;
import example.quickstart.service.impl.best.dto.Person;

public class EncounterServiceTest {
	EncounterService checkInService;

	@Test
	public void checks_in_patient() throws Exception {

		Person mark = new Person();
		mark.setEmail("mark@gmail.com").setFirstName("Mark")
				.setPhoneNumber1("444-999-0090");

		CheckInRequest request = new CheckInRequest();
		request.setCheckInDate(new Date());
		request.setDisease("Vomiting");
		request.setDoctor("Dr. Mike Hussey");

		String country = "US";
		String johnsStreetAddress = "123 Frazer";
		String johnsState = "PA";
		String johnsZipCode = "19355";
		Address johnsAddressMavernPhilly = buildAddress(johnsStreetAddress,
				country, johnsState, johnsZipCode, AddressType.Residential);
		String johnsEmailId = "johnYou12345@gmail.com";
		String johnsFirstName = "John";
		String familyName = "Peterson";

		Person johnPeterson = buildPerson(johnsAddressMavernPhilly, familyName,
				johnsEmailId, johnsFirstName);

		request.setPerson(johnPeterson);

		Guarantor daddy = new Guarantor();
		daddy.setGuarantorType(GuarantorType.Person);
		String dadsStreetAddress = "12/e xyz Avenue";
		String dadsState = "NY";
		String dadsZipCode = "49355";
		Address dadsAddressNYBayArea = buildAddress(dadsStreetAddress, country,
				dadsState, dadsZipCode, AddressType.Residential);
		String dadsEmail = "dontDisturb@my.org";
		String dadsFirstName = "Freddy";
		Person johnsDad = buildPerson(dadsAddressNYBayArea, familyName,
				dadsEmail, dadsFirstName);
		daddy.setPerson(johnsDad);
		request.setGuarantor(daddy);
	}

	protected Person buildPerson(Address newYorkBayArea, String lastName,
			String email, String firstName) {
		Person person = new Person();
	/*
	 * person.addAddrees(newYorkBayArea); person.setEmail(email);
	 * person.setFirstName(firstName); person.setLastName(lastName);
	 */
		return person;
	}

	protected Address buildAddress(String street, String country, String state,
			String zip, AddressType residential) {
		Address address = new Address();

	/*
	 * address.setAddressType(residential); address.setCountry(country);
	 * address.setState(state); address.setZip(zip); address.setStreet(street);
	 */
		return address;
	}

}
