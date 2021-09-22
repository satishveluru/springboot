package example.quickstart.entity;

import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.AuditorAware;

public class UserAuditor implements AuditorAware<AuditUser> {

	@Value("${userid:100}")
	private Long userid;

	@Value("${user:audit}")
	private String username;

	private Optional<AuditUser> auditUser;

	@PostConstruct
	public void init() {
		auditUser = Optional.of(new AuditUser(username, userid));
	}

	@Override
	public Optional<AuditUser> getCurrentAuditor() {
		return auditUser;
	}

}
