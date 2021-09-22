package example.quickstart.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AuditUser implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "USER_CREATED", length = 22)
	private Long createdByUser;

	public AuditUser() {
	}

	public AuditUser(String createdByPk, Long createdByUser) {
		this.createdByUser = createdByUser;
	}

	public Long getCreatedByUser() {
		return createdByUser;
	}

	public void setCreatedByUser(Long createdByUser) {
		this.createdByUser = createdByUser;
	}

}
