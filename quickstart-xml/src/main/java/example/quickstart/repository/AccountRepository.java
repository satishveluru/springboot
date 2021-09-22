package example.quickstart.repository;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import example.quickstart.entity.Account;

@Service
public class AccountRepository {
    private static ConcurrentHashMap<String, Account> personStorage = new ConcurrentHashMap<>();

    public Account add(Account account) {
	personStorage.put(account.getId(), account);

	return account;
    }

    public Account delete(String id) {
	Account p = personStorage.get(id);
	personStorage.remove(id);

	return p;
    }

    public Account findById(String id) {
	return personStorage.get(id);
    }

    public List<Account> findAll() {
	return personStorage.values().stream().collect(Collectors.toList());
    }

    public List<Account> findByRadius(int radius) {
	return personStorage.values().stream().filter(p -> p.getId() != null).collect(Collectors.toList());
    }
}
