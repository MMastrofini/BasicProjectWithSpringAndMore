package org.my.project.domain.user;

import javax.persistence.Entity;

import org.my.project.domain.IdentifiableEntity;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Configurable
public class BaseAuthority extends IdentifiableEntity implements
		GrantedAuthority {

	private static final long serialVersionUID = -4691121455918169040L;
	private String authority;

	public BaseAuthority(String authority) {
		super();
		this.authority = authority;
	}

	@Override
	public String getAuthority() {
		return authority;
	}

}
