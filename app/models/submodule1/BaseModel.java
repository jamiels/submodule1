package models.submodule1;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
public class BaseModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long id;

	public String uuid = UUID.randomUUID().toString() + UUID.randomUUID().toString();

	@Version
	private Long version;

	@Column(columnDefinition = "DATETIME")
    public Date createdAt = new Date();


	public Long getId() {
		return id;
	}

	public String getSubUuid() {
		return uuid.substring(0, 8);
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}


	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public static String generateUUID() {
		return UUID.randomUUID().toString() + UUID.randomUUID().toString();
	}

}
