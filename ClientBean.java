package beans;

public class ClientBean {
		private String nom;
		private String prenom;
		private String add;
		private String num;
		private String mail;
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public String getAdresse() {
			return add;
		}
		public void setAdresse(String adresse) {
			this.add = adresse;
		}
		public String getNumtel() {
			return num;
		}
		public void setNumtel(String numtel) {
			this.num = numtel;
		}
		public String getEmail() {
			return mail;
		}
		public void setEmail(String email) {
			this.mail = email;
		}
				public ClientBean() {
			setNom("");
			setPrenom("");
			setAdresse("");
			setNumtel("");
			setEmail("");
			
			
		}
		

	}

