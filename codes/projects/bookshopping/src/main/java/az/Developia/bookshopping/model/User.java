package az.Developia.bookshopping.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class User {
	
	@Size(min=1,message = "İstidəçi adı minimum 1 simvol olmalıdır")
	@Size(max=30,message = "İstidəçi adı maksimum 30 simvol olmalıdır")
	@NotEmpty(message = "Boş qoymaq olmaz")
	private String username;
	
	@Size(min=1,message = "Şifrə  minimum 1 simvol olmalıdır")
	@Size(max=30,message = "Şifrə  maksimum 30 simvol olmalıdır")
	@NotEmpty(message = "Boş qoymaq olmaz")
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}

}
