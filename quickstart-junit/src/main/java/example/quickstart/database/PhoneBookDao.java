package example.quickstart.database;

import java.util.List;

import example.quickstart.model.PhoneEntry;

public interface PhoneBookDao {
	boolean create(PhoneEntry entry);

	boolean update(PhoneEntry entryToUpdate);

	List<PhoneEntry> searchByNumber(String number);

	List<PhoneEntry> searchByFirstName(String firstName);

	List<PhoneEntry> searchByLastName(String lastName);

	boolean delete(String number);
}
